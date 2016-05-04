package com.ihandy.quote_common;

/**
 * Created by fengwen on 2016/5/4.
 */


    import java.io.BufferedInputStream;
    import java.security.cert.CertificateException;
    import java.security.cert.X509Certificate;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.List;

    import javax.net.ssl.SSLContext;
    import javax.net.ssl.SSLSocket;
    import javax.net.ssl.TrustManager;
    import javax.net.ssl.X509TrustManager;

    import org.apache.http.HttpResponse;
    import org.apache.http.HttpVersion;
    import org.apache.http.NameValuePair;
    import org.apache.http.client.HttpClient;
    import org.apache.http.client.entity.UrlEncodedFormEntity;
    import org.apache.http.client.methods.HttpPost;
    import org.apache.http.client.params.AllClientPNames;
    import org.apache.http.conn.scheme.Scheme;
    import org.apache.http.conn.ssl.SSLSocketFactory;
    import org.apache.http.impl.client.DefaultHttpClient;
    import org.apache.http.message.BasicNameValuePair;
    import org.apache.http.params.BasicHttpParams;
    import org.apache.http.params.HttpParams;
    import org.apache.http.protocol.HTTP;


     public class SingleVisit {



         public static void main(String[] args) throws Exception {
             String HTTPURL = "https://www.baidu.com/";
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(HTTPURL);
            httpClient.getParams().setParameter(AllClientPNames.PROTOCOL_VERSION,
                    HttpVersion.HTTP_1_1);
            httpClient.getParams().setParameter(
                    AllClientPNames.USE_EXPECT_CONTINUE, Boolean.TRUE);
            httpClient.getParams().setParameter(
                    AllClientPNames.HTTP_CONTENT_CHARSET, "UTF_8");
            httpClient.getParams().setParameter(
                    AllClientPNames.CONN_MANAGER_TIMEOUT, 10000l);
            httpClient.getParams().setParameter(AllClientPNames.CONNECTION_TIMEOUT,
                    2000);
            httpClient.getParams().setParameter(AllClientPNames.SO_TIMEOUT, 10000);
            try {
                TrustManager easyTrustManager = new X509TrustManager() {
                    public void checkClientTrusted(X509Certificate[] chain,
                                                   String authType) throws CertificateException {

                    }
                    public void checkServerTrusted(X509Certificate[] chain,
                                                   String authType) throws CertificateException {

                    }
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                };
                SSLContext sslcontext = SSLContext.getInstance("TLS");
                sslcontext.init(null, new TrustManager[] { easyTrustManager }, null);
                SSLSocketFactory sf = new SSLSocketFactory(sslcontext);
                SSLSocket socket = (SSLSocket) sf.createSocket();
                socket.setEnabledCipherSuites(new String[] { "SSL_RSA_WITH_RC4_128_MD5" });
                HttpParams params = new BasicHttpParams();
                Scheme sch = new Scheme("https", 1443, sf);
                sf.connectSocket(socket, "https://www.baidu.com/", 1443, null, -1, params);

                httpClient.getConnectionManager().getSchemeRegistry().register(sch);

                List<NameValuePair> nvps = new ArrayList<NameValuePair>();
                nvps.add(new BasicNameValuePair("userName", "abin"));
                nvps.add(new BasicNameValuePair("createTime", new SimpleDateFormat(
                        "yyyy-MM-dd HH:mm:ss").format(new java.util.Date())));
                HttpResponse httpResponse = null;
                String result = "";
                try {
                    httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
                    httpResponse = httpClient.execute(httpPost);
                    BufferedInputStream buffer = new BufferedInputStream(
                            httpResponse.getEntity().getContent());
                    byte[] bytes = new byte[1024];
                    int line = 0;
                    StringBuilder builder = new StringBuilder();
                    while ((line = buffer.read(bytes)) != -1) {
                        builder.append(new String(bytes, 0, line, "UTF-8"));
                    }
                    result = builder.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (httpPost.isAborted()) {
                        httpPost.abort();
                    }
                    httpClient.getConnectionManager().shutdown();
                }
                System.out.println("result=" + result);

            } finally {
                // When HttpClient instance is no longer needed,
                // shut down the connection manager to ensure
                // immediate deallocation of all system resources
                httpClient.getConnectionManager().shutdown();
            }
        }




}
