package com.offer21_arrayAdjust;

public class Solution2 {

    public static void main(String[] args) {


    }

    class Solution {
        public int[] exchange(int[] nums) {

            int i=0;
            int temp;
            int a[]={};
            if(nums.length==0 ){
                return a;
            }

            if(nums.length==1){
                return nums;
            }

            do{
                if(nums[nums.length/2] % 2 != 0){//是奇数
                    temp=nums[i];
                    nums[i]=nums[nums.length/2];
                    nums[nums.length/2]=temp;

                    i++;
                }



            } while( nums[i]%2==0&&i<=nums.length/2);



            return nums;

        }

    }

}
