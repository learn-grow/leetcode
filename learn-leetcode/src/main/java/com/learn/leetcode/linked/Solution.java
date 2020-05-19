package com.learn.leetcode.linked;

/**
 * @author: lisy
 * @version: : Solution , v0.1 2020年05月14日 3:31 下午
 * @remark: the Solution is
 */
public class Solution {


    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next , l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }
}
