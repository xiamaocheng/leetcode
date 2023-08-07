package com.offer10_finberna;

public class Solution {




    //斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

//    答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。


    public static int fib(int n) {



        if(1==n){
            return 1;
        }
        if(0==n){
            return 0;
        }



           return  (fib(n-1)+fib(n-2))%1000000007;


    }

    public static void main(String[] args) {
        System.out.print(fib(2));
    }



}
