package com.offer10_II;

class Solution {

    public int numWays(int n) {

        if (n==0) {
            return 1;

        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
          return   numWays(n-1)+numWays(n-2)%1000000008;
        }

    }


    //一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。

//    求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
}