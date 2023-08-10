package com.offer11_minNumber;

public class Solution {

    //把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转


    public int minArray(int[] numbers) {


        //处理旋转
//        numbers 原来是一个升序排序的数组，并进行了 1 至 n 次旋转

        int min=0;

        if(numbers.length>1){
            //处理最小值

            //冒泡排序第一个
            for (int i=0;i<numbers.length;i++){

                for(int j=i+1;j<numbers.length;j++){
                    if(numbers[i]>numbers[j]){
                        int temp = numbers[i];
                        numbers[i]=numbers[j];
                        numbers[j]=temp;
                    }
                }
            }
          return  numbers[0];

        }else{
            return numbers[0];
        }



    }


    //1,2,3,4,5
//   min 1
}
