package com.ihandy.quote_common;


import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import java.io.*;
import java.net.URL;
import java.util.HashMap;


/**
 * Created by fengwen on 2016/4/28.
 */
public class HttpUtils {

    private static Log log = LogFactory.getLog(HttpUtils.class);

    /**
     * 向指定 URL 发送 GET 方法的请求
     *
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数
     * @return 所代表远程资源的响应结果
     */
    public static Map<String, String>  sendGet(String url, String param) {
        Map<String, String> resultMap = new HashMap<String, String>();
        String result = "";
        try {
            // 向指定URL发送GET方法的请求
            String urlName = url;
            // 向指定URL发送POST方法的请求
            if(null!=param){
                urlName = urlName + "?" + param;
            }
            URL realUrl = new URL(urlName);
            //打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            //建立实际的连接
            conn.connect();
            result = convertStreamToString(conn.getInputStream());
            resultMap.put("result", result);
            String cookieValue = conn.getHeaderField("Set-Cookie");
            resultMap.put("JSESSIONID", cookieValue);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultMap;
    }
    /**
     * 向指定 URL 发送 Post 方法的请求
     *
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数
     * @return 所代表远程资源的响应结果
     */
    public static Map<String, String>  sendPost (String url, String param) {
        Map<String, String> resultMap = new HashMap<String, String>();
        PrintWriter out = null;
        String result = "";
        try {
            String urlName = url;
            // 向指定URL发送POST方法的请求
            if(null!=param){
                 urlName = urlName + "?" + param;
            }
            URL realUrl = new URL(urlName);
            //打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            //发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            result = convertStreamToString(conn.getInputStream());
            resultMap.put("result", result);
            String cookieValue = conn.getHeaderField("Set-Cookie");
            resultMap.put("JSESSIONID", cookieValue);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultMap;
    }
    /**
      ******************* 将输入流InputStream转换为String *******************
     */
    public static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        // 创建Get方法实例
        Map<String, String> resultMap = new HashMap<String, String>();
        resultMap = sendGet("http://www.baidu.com",null);
        log.info(resultMap);
    }
}
