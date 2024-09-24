package com.code.java.company.Lenskart;

/**
 * practice: https://leetcode.com/problems/reverse-linked-list-ii/
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class ReverseLinkedListII {
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node just before the left position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;
        ListNode front = null;

        // Reverse the nodes from left to right
        for (int i = 0; i <= right - left; i++) {
            ListNode temp = current.next;
            current.next = front;
            front = current;
            current = temp;
        }

        // Connect the reversed portion back to the original list
        prev.next.next = current;
        prev.next = front;

        return dummy.next;
    }
}
