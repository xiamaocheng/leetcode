package com.offer15_BinContain1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Solution {


    public static void main(String[] args) {

    }


    public int hammingWeight1  (int n) throws IOException {

//        n = 128 (控制台输入 00000000000000000000000000001011
        int count = 0;

        String str ;
      
//        str1= new Integer(n).byteValue();
           str=Integer.toBinaryString(n);



        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (1 == arr[i]) {
                count++;
            }
        }
        return count;
    }





    public int hammingWeight(int n) throws IOException {

//        n = 128 (控制台输入 00000000000000000000000000001011
        int count = 0;

        String str ;

//        str1= new Integer(n).byteValue();
        str=Integer.toBinaryString(n);


        System.out.println(str);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (49 == arr[i]) {
                count++;
            }
        }
        return count;
    }

}