package com.leetcode01_maxNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    ///小组中每位都有一张卡片 卡片是6位以内的正整数 将卡片连起来可以组成多种数字 计算组成的最大数字

//    小组中每位都有一张卡片，卡片上是6位内的正整数，将卡片连起来可以组成多种数字，计算组成的最大数字。
    //第一题是编程，第二题是算法，第三题是应用。
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        String count = input.next();

        String[] split = count.split(",");
        Arrays.sort(split);
//        for(int i=0;i<split.length;i++){
//            System.out.print(split[i]);
//        }
        for(int i=split.length-1;i>=0;i--){
            System.out.print(split[i]);
        }

    }

    //“,”号分割的多个正整数字符串，不需要考虑非数字异常情况，小组最多25个人
//    最大的数字字符串




}
