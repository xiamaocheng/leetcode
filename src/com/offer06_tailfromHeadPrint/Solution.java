package com.offer06_tailfromHeadPrint;

import org.omg.CORBA.Object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.SortedMap;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {


    //输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
    public int[] reversePrint(ListNode head) {



        System.out.println("===="+len(head));
        int  leng=len(head);
        int[] a = new int[leng];

        if (head == null) {
            return a;
        }
        int i=0;
        while ( head !=null ) {
            a[i++] = head.val;
            head = head.next;
            if(head==null){
                break;
            }
            if(head.next==null){
                a[i++] = head.val;
                break;
            }
        }

        for (int c = 0; c<a.length; c++) {
            System.out.println(a[c]);
        }
        int[] b = new int[leng];
        int k = 0;
        for (int j = a.length-1 ; j >= 0; j--) {
            b[k++] = a[j];
        }
        return b;

    }



    public int len(ListNode head) {
        int len=0;
        while ( head !=null ) {
            len++;
            head = head.next;
            if(head==null){
                return 1;
            }else  if(null==head.next){
                return len=len+1 ;
            }




        }

        return 0;
    }

}
