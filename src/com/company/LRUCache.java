package com.company;

import java.util.HashMap;

public class LRUCache {

    private  int capacity;

    HashMap<Integer,Node<IntPair>> cahcheMap=new HashMap<>();

    //
    IntPairList  cacheList= new IntPairList();



    public LRUCache(int size){
        this.capacity=size;
    }


   public  int  get(int key){


        if(!cahcheMap.containsKey(key)){
            return -1;
        }else{
            Node<IntPair> foundIter=cahcheMap.get(key);
            //把当前的节点移动到head 的位置
            cacheList.remove(foundIter);
            cacheList.addLast(foundIter);

            return (int) foundIter.data.value;
        }



    }


    public void set (int key,int value){

        //判断要访问的key 是否已在缓存中
        if(cahcheMap.containsKey(key)){
            Node<IntPair> foundIter = cahcheMap.get(key);
            cacheList.remove(foundIter);
            cacheList.addFirst(foundIter);

            //更新节点的数值
            foundIter.data.value=value;
            return;
        }

        //如果key不在缓存中且缓存满了
        if(cahcheMap.size()==capacity){
            int keyTmp=(int)cacheList.getLast().data.key;
            cahcheMap.remove(keyTmp);
            cacheList.removeLast();
        }

        //在缓存的head 处插入新元素
        IntPair pair = new IntPair(key,value);
        cacheList.insertAtHead(pair);

        //更新哈希表，记录目前已有的缓存
        if(cahcheMap.containsKey(key)){
            cahcheMap.replace(key,cacheList.getFirst());

        }else{
            cahcheMap.put(key,cacheList.getFirst());
        }


    }


    //打印缓存的当前的状态
    public void printCacheState(){
        System.out.println("cache current size:"+cacheList.size()+",");
        System.out.println("cache contents :{");
        Node iter = cacheList.getFirst();


        while(iter!=null){
           IntPair pair=(IntPair)iter.data;
            System.out.println("{"+pair.key+":"+pair.value+"}");
            iter=iter.next;
            if(iter!=null){
                System.out.println(",");
            }
        }

        System.out.println("}");
        System.out.print(
                "\n----------------------------------------------------------------------------------------------------\n");




    }




}
