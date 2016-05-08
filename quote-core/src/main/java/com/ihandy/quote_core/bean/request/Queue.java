package com.ihandy.quote_core.bean.request;

/**
 * Created by fengwen on 2016/5/7.
 * 管理网页url的实现队列
 */
import java.util.LinkedList;
public class Queue {
    //使用链表实现队列
    private LinkedList queueList = new LinkedList();


    //入队列
    public void enQueue(Object object) {
        queueList.addLast(object);
    }

    //出队列
    public Object deQueue() {
        return queueList.removeFirst();
    }

    //判断队列是否包含object元素..
    public boolean contains(Object object) {
        return queueList.contains(object);
    }

    //判断队列是否为空
    public boolean empty() {
        return queueList.isEmpty();
    }
}
