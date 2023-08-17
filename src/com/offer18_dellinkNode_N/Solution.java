package com.offer18_dellinkNode_N;

class Solution {
    public ListNode deleteNode(ListNode head, int val) {

        if(null==head){
            return  null;
        }

        while(head.next!=null){

            if(val==head.val){
                head=head.next;
            }else   if(val==head.next.val){
                //删除
                head.next=head.next.next;


            }

        }


        return head;

    }
}