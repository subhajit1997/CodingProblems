package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_3;

/**
 * learn:https://takeuforward.org/data-structure/find-middle-element-in-a-linked-list/
 * practice: https://leetcode.com/problems/middle-of-the-linked-list/description/
 *
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */
public class _1MiddleOfALinkedList {
    public static void main(String[] args) {
        
    }

    //Brute -Force Approach
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int count =0;
        while(node.next!=null){
            count++;
            node = node.next;
        }
        node = head;
        for(int i=0;i<count/2;i++){
            node = node.next;
        }
        if(count%2!=0){
            node = node.next;
        }
        return node;
    }

    //Tortoise & Hare Approach Optimised
    public ListNode middleNodeOptimised(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

 class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
