package com.example;

import java.util.HashMap;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * lfu design
     * @param operators int整型二维数组 ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    HashMap hashMap = new HashMap();

    public int[] LFU (int[][] operators, int k) {
        // write code here

        for ( int i = 0; i < operators.length; i++) {

            for (int j = 0; j < operators.length; j++) {


                int l=0;   int m=0;
                if(i==1){
                     l = set(i, j, k);
                }else if(i==2){
                     m = get( k);
                }

                if (l < m && hashMap.size() == k) {
                    hashMap.remove(hashMap.size() - 1);
                }
            }
        }
             return  new int[1];
    }


    public  int   set (Object key, int value, int k) {

        // write code here
        int i = 0;
        hashMap.put(key,value);
        i++;
        return i;

    }

    public int  get (int key) {
        // write code here
        int j = 0;
        hashMap.get(key);
        j++;
        return j;
    }








}