package com.offer21_arrayAdjust;

public class Solution {

    public static void main(String[] args) {


    }

    public int[] exchange(int[] nums) {


        for(int i=0;i<nums.length;i++){

            if(nums.length%2==0){//偶数长度


                if(nums[i]%2!=0){ //奇数
                    //不动


                }else{  //偶数

                    int temp;

                    if( nums[nums.length/2]%2!=0){ //奇数交换
                        temp=nums[i];
                        nums[i]=nums[nums.length/2];
                        nums[nums.length/2]=temp;
                    }else{  //偶数不动
                        temp=nums[i];
                        nums[i]=nums[nums.length/2+1];
                        nums[nums.length/2+1]=temp;
                    }


                }




            }

        }

        return nums;
    }



}
