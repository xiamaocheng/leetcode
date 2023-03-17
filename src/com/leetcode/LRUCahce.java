package com.leetcode;

import java.util.HashMap;

public class LRUCahce {
    int capacity;

    HashMap<Integer,Node>  map=new HashMap<>();
    Node head=null;
    Node end=null;

    public LRUCahce(int capacity) {
        this.capacity = capacity;
    }


    public void remove(Node n){
        if(n.pre!=null){
            n.pre.next=n.next;

        }else{
            head=n.next;

        }




        if(n.next!=null){
            n.next.pre=n.pre;
        }else{
            end=n.pre;
        }
    }


    //在双向链表头部添加节点
    public void setHead(Node n){
        n.next=head;
        n.pre=null;

        if(head!=null){
            head.pre=n;
        }
        head=n;
        if(end==null){
            end=head;
        }
    }


    //往HashMap 中添加新的keyvalue
    public void set(int key,int value){

        if(map.containsKey(key)){
            Node old=map.get(key);
            remove(old);
            setHead(old);
        }else{
            Node newNode=new Node(key,value);

            if(map.size()>=capacity){
                remove(end);
                map.remove(end.key);
                setHead(newNode);
            }else{
                setHead(newNode);
            }
        }
    }



    public int get(int key){
        if(map.containsKey(key)){
            Node n=map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }

}


//https://leetcode.cn/problems/lru-cache/solution/146-by-shiinamashiro-9uls/

