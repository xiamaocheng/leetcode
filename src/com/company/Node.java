package com.company;

public class Node<T> {



    public T data;

    public Node<T>  next;

    public Node<T>  prev;

    public Node(T dataVal){
        this.data=dataVal;
        this.next=null;
        this.prev=null;
    }
}
