package com.learn.leetcode.l20191219;

/**
 * @author : lisy
 * @version $Id: ListNode, v 0.1 2019年12月19日 5:34 PM lisy Exp $
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode(int v){
        this.val = v;
    }

    //递归
    public ListNode reverseList1(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode p = reverseList1(head.next);

        head.next.next = head;
        head.next = null;
        return p;
    }

    //遍历
    public ListNode reverseList2(ListNode head){
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
