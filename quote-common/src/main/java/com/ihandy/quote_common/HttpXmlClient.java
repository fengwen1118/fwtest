package com.ihandy.quote_common;

/**
 * Created by fengwen on 2016/5/4.
 */

import java.io.*;
import java.security.*;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.*;

import java.security.cert.CertificateException;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.AllClientPNames;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import javax.net.ssl.*;

public class HttpXmlClient {
    private static Logger log = Logger.getLogger(HttpXmlClient.class);

    public static String post(String url, Map<String, String> params) {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String body = null;

        log.info("create httppost:" + url);
        HttpPost post = postForm(url, params);

        body = invoke(httpclient, post);

        httpclient.getConnectionManager().shutdown();

        return body;
    }

    public static String get(String url) {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String body = null;

        log.info("create httppost:" + url);
        HttpGet get = new HttpGet(url);
        body = invoke(httpclient, get);

        httpclient.getConnectionManager().shutdown();

        return body;
    }


    private static String invoke(DefaultHttpClient httpclient,
                                 HttpUriRequest httpost) {

        HttpResponse response = sendRequest(httpclient, httpost);
        String body = paseResponse(response);

        return body;
    }

    private static String paseResponse(HttpResponse response) {
        log.info("get response from http server..");
        HttpEntity entity = response.getEntity();

        log.info("response status: " + response.getStatusLine());
        String charset = EntityUtils.getContentCharSet(entity);
        log.info(charset);

        String body = null;
        try {
            body = EntityUtils.toString(entity);
            log.info(body);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return body;
    }

    private static HttpResponse sendRequest(DefaultHttpClient httpclient,
                                            HttpUriRequest httpost) {
        log.info("execute post...");
        HttpResponse response = null;

        try {
            response = httpclient.execute(httpost);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static HttpPost postForm(String url, Map<String, String> params){

        HttpPost httpost = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList <NameValuePair>();

        Set<String> keySet = params.keySet();
        for(String key : keySet) {
            nvps.add(new BasicNameValuePair(key, params.get(key)));
        }
        try {
            log.info("set utf-8 form entity to httppost");
            httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return httpost;
    }

/*    public static void main(String[] args) throws Exception {

        String xml = HttpXmlClient.post("https://10.134.136.48:8888/casserver/login?service=http%3A%2F%2F10.134.136.48%3A80%2Fportal%2Findex.jsp", null);
        log.info(xml);

    }*/

    public static void main(String[] args) throws ClientProtocolException, IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, KeyManagementException, UnrecoverableKeyException {
        String HTTPURL ="https://10.134.136.48:8888/casserver/login?service=http%3A%2F%2F10.134.136.48%3A80%2Fportal%2Findex.jsp";

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
            org.apache.http.conn.ssl.SSLSocketFactory sf = new org.apache.http.conn.ssl.SSLSocketFactory(sslcontext);
            SSLSocket socket = (SSLSocket) sf.createSocket();
            socket.setEnabledCipherSuites(new String[] { "SSL_RSA_WITH_RC4_128_MD5" });
            HttpParams params = new BasicHttpParams();
            Scheme sch = new Scheme("https", 1443, sf);
            sf.connectSocket(socket,HTTPURL, 1443, null, -1, params);

            httpClient.getConnectionManager().getSchemeRegistry().register(sch);

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("userName", "fw"));
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
            httpClient.getConnectionManager().shutdown();
        }
    }
}
