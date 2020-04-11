package com.learn.leetcode;

/**
 * @author: lisy
 * @version: : ReverseList , v0.1 2020年04月11日 12:19 下午
 * @remark: the ReverseList is
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {
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
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}