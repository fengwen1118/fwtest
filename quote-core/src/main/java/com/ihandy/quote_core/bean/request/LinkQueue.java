package com.ihandy.quote_core.bean.request;
import com.ihandy.quote_core.bean.request.Queue;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by fengwen on 2016/5/7.
 */
public class LinkQueue {
    //已经访问的队列
    private static Set visitedUrl = new HashSet();
    //未访问的队列
    private static Queue unVisitedUrl = new Queue();

    //获得URL队列
    public static Queue getUnVisitedUrl() {
        return unVisitedUrl;
    }
    public static Set getVisitedUrl() {
        return visitedUrl;
    }
    //添加到访问过的URL队列中
    public static void addVisitedUrl(String url) {
        visitedUrl.add(url);
    }

    //删除已经访问过的URL
    public static void removeVisitedUrl(String url){
        visitedUrl.remove(url);
    }
    //未访问的URL出队列
    public static Object unVisitedUrlDeQueue(){
        return unVisitedUrl.deQueue();
    }
    //保证每个URL只被访问一次,url不能为空,同时已经访问的URL队列中不能包含该url,而且因为已经出队列了所未访问的URL队列中也不能包含该url
    public static void addUnvisitedUrl(String url){
        if(url!=null&&!url.trim().equals("")&&!visitedUrl.contains(url)&&!unVisitedUrl.contains(url))
            unVisitedUrl.enQueue(url);
    }
    //获得已经访问过的URL的数量
    public static int getVisitedUrlNum(){
        return visitedUrl.size();
    }

    //判断未访问的URL队列中是否为空
    public static boolean isUnvisitedUrlsEmpty(){
        return unVisitedUrl.empty();
    }

    private void initCrawlerWithSeeds(String[] seeds) {
        for (int i = 0; i < seeds.length; i++) {
            this.addUnvisitedUrl(seeds[i]);
        }
    }
}
