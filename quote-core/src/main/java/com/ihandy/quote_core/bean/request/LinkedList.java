package com.ihandy.quote_core.bean.request;

import com.ihandy.quote_core.bean.Node;

/**
 * Created by fengwen on 2016/5/7.
 */
public class LinkedList {
    private Node head;//头结点
    int size;//链表的长度
    public LinkedList(){
        head=null;
    }
    /*//增加一个头结点
    public void addToStart(int id,int nextId,String url,Response response,Request request){
        head = new Node( id,nextId, url, response, request);
        size++;
    }
    //删除一个头结点
    public boolean deleteHead(){
        if(head!=null){
            head=head.getLink();
            size--;
            return true;
        }
        else
            return false;
    }
    //增加一个尾节点
    public void addEnd(int id,int nextId,String url,Response response,Request request){

        Node position=head;
        if(head==null){
            System.out.println("这是个空链表");
        }else{
            while(position.getLink()!=null){
                position=position.getLink();
            }
            Node end=new Node( id,nextId, url, response, request);
            position.setLink(end);
            size++;
        }

    }
    //在链表的中间插入一个节点
    public void addMiddle(int id,int nextId,String url,Response response,Request request,int i){
        Node postion=null;
        int j=0;
        if(i>size||i<=0){
            System.out.println("您要插入的位置不在链表中");
        }else{
            for(postion=head;postion!=null;postion=postion.getLink()){
                j++;
                if(j==i){
                    Node temp=new Node( id,nextId, url, response, request);
                    temp.setLink(postion.getLink());
                    postion.setLink(temp);

                }
            }

        }

    }
    //删除尾节点
    public void deleteEnd(){
        Node postion=head;
        int k=0;
        while(k<size-2){
            postion=postion.getLink();
            k++;
        }
        postion.setLink(null);

        size--;
    }

    //链表的长度
    public int size(){
        int i=0;
        Node postion=head;
        while(postion!=null){
            postion=postion.getLink();
            i++;
        }
        return i;
    }

    //根据节点Id删除节点
    public void deleteNode(int nodeId){
        Node temp=head;
        Node temp2=head.getLink();
        if(nodeExist(nodeId)){
            if(head.getNodeId()==nodeId){
                deleteHead();
                size--;
            }else{
                int i=0;
                while(i<size-1){
                    if(temp.getLink().getNodeId() == nodeId){
                        temp.setLink(temp2.getLink());
                        size--;
                    }
                    temp=temp.getLink();
                    temp2=temp.getLink();
                    i++;
                }
            }
            deleteNode(nodeId);
        }else{
            System.out.println("该节点已经删除干净");
        }
    }
    //判断 nodeId 的节点在不在链表中
    public boolean nodeExist(int nodeId){
        Node tem=head;
        while(tem.getLink()!=null){
            if(head.getNodeId()==nodeId){
                return true;
            }
            tem=tem.getLink();
            if(tem.getNodeId()==nodeId){
                return true;
            }
        }
        return false;

    }

    //遍历链表
    public void printAll(){
        Node postion=head;
        while(postion!=null){
            System.out.println("nodeId = "+ postion.getNodeId()+ " nodeUrl = " + postion.getNodeUrl()+"/n");
            postion=postion.getLink();
        }
    }
    public static void main(String[] args) {
        LinkedList lk2=new LinkedList();
        lk2.addToStart("A");
        lk2.addEnd("B");
        lk2.addEnd("C");
        lk2.addEnd("D");
        lk2.addEnd("E");
        lk2.addEnd("F");
        lk2.addEnd("G");

        lk2.addMiddle("h", 3);
        lk2.printAll();
    }*/
}
