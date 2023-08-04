package com.offer05_repalceBlank;

class Solution {
    public  static String replaceSpace(String s) {



        String ss = null;

        ss = s.replace(" ", "%20");
        return ss;


    }


    public static void main(String[] args) {
        String string = "We are happy";

        System.out.println(replaceSpace(string));
    }

}
