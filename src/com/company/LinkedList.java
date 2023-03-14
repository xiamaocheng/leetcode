package com.company;

public class LinkedList<T> {

    private Node<T>   head;
    private Node<T>    tail;
    private int length;

    public LinkedList(){
        this.head=null;
        this.tail=null;
    }


    public int size(){
        return   this.length;
    }

    public void insertAtHead(T data){
        Node<T>  newNode=new Node<>(data);
        addFirst(newNode);
    }

    public void addFirst(Node<T> newNode) {
       if(this.head==null){
           this.head=newNode;
           this.tail=newNode;
       }else{
           newNode.next=this.head;
           this.head.prev=newNode;
           this.head=newNode;
       }

       this.length++;
    }


    public void addLast(Node<T>  newNode){
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
        this.tail.next=newNode;
        newNode.prev=this.tail;
        this.tail=newNode;
        }
        this.length++;

    }


    public void remove(Node<T>  node){

        if(node==null)
            return;

        if(node.prev!=null){
            node.prev.next=node.next;
        }

        if(node.next!=null){
            node.next.prev=node.prev;
        }

        if(node==this.head){
            this.head=this.head.next;
        }

        if(node==this.tail){
            this.tail=this.tail.prev;

            if(this.tail!=null){
                this.tail.next=null;
            }
        }
        this.length--;
        node=null;

    }



    public void removeFirst(){
        this.remove(this.head);
    }

    public void removeLast(){
        this.removeLast();
    }


    public Node<T>  getFirst(){
        return this.head;
    }

    public Node<T>  getLast(){
        return this.tail;
    }


//    public class IntPairList extends  LinkedList<Pair.IntPair>{
//
//    };
//



}
