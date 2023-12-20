package com.code.java.course.striver.A2ZDSA.Step6.Step6_1;

/**
 *
 * learn: https://takeuforward.org/data-structure/delete-last-node-of-linked-list/
 * prcatice: https://leetcode.com/problems/delete-node-in-a-linked-list/
 *
 */
public class _3DeleteNodeInALinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
  }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

