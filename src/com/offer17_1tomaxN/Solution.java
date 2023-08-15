package com.offer17_1tomaxN;

public class Solution {

    public static void main(String[] args) {





    }


    public int[] printNumbers ( int n){

        //最大的 n 位十进制数。
        int[] a = new int[(int) Math.pow(10, n) - 1];
        int end = (int) Math.pow(10, n) - 1;

        for (int i = 0; i < end-1; i++) {
            a[i] = i;
        }
        return a;
    }


}
