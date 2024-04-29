package com.tenxuuJingXuan_01_huiwen;

public class huiwen {
    public static void main(String[] args) {


//        回文数
//        是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//        int x = 1000030001;
    int x = 121;
        System.out.println(isPalindrome(x));

//        int y = -121;
//        System.out.println(isPalindrome(y));
//
//        int z = 10;
//        System.out.println(isPalindrome(z));
//

    }


    //        回文数
//        是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public static boolean isPalindrome(int x) {


        //01.转化为String
        String s = Integer.toString(x);
        char[] array = s.toCharArray();
        if(array.length==1){
            return  true;
        }
        if(array.length==2){
            return  array[0]==array[1]?true:false;
        }
        //02.偶数收尾比较相同返回true,
        if (array.length % 2 == 0) {
            int i = 0;
            while (i < s.length() / 2) {


                if (array[i] == array[s.length() - 1 - i]) {
                    i++;
                     if(i==s.length()/2){
                         return  true;
                     }
                } else {
                    break;
                }


            }
        }

        //03.奇数中心旋转比较首尾相同即可
        if (array.length % 2 != 0) {
            int i = 0;
            while ( i <=s.length() / 2) {

                if (array[i] == array[s.length() - 1 - i]) {
                    i++;
                    if(i>=s.length()/2){
                        return  true;
                    }

                } else {
                    break;
                }


            }


        }
        return false;
    }


}
