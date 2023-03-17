package com.leetcode;

public class Node {
    public int key;
    public int value;
    public Node pre;
    public Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    Node head=null;
    Node tail=null;

    int size=0;


    //在头部添加节点
    public void addHead(Node n){


        if(head==null){
            head=n;
            tail=n;
            head.pre=null;
            head.next=null;

        }else{
            n.next=head;
            n.pre=null;
            head.pre=n;
            n=head;
            size++;
        }
    }


    //在尾部添加节点
    public void addTail(Node n){

        if(tail==null){
            head=n;
            tail=n;
            head.pre=null;
            head.next=null;
        }else{
            n.pre=tail;
            n.next=null;
            tail.next=n;
            n=tail;
            size++;

        }

    }


    //删除节点
    public void remoe(Node n){

        if(n.pre!=null){
            n.pre.next=n.next;
        }else{
            head=n.next;
        }


        if(n.next!=null){
            n.next.pre=n.pre;
        }else{
            tail=n.pre;
        }
       size--;




    }



    //弹出头部节点
    public Node popHead() {
        if (head == null) {
            return null;
        }

        Node node = head;
        if (node.next != null) {
            head = node.next;
            head.pre = null;
        } else {
            tail = null;
            head = null;
        }
         size--;
          return node;
    }


    //弹出尾部的节点
    public Node popTail(){
        if(tail==null)
            return null;
        Node node=tail;

        if(node.pre!=null){
            tail=node.pre;
            tail.next=null;
        }else{
            tail=null;
            head=null;
        }
        size--;
        return node;
    }



}
