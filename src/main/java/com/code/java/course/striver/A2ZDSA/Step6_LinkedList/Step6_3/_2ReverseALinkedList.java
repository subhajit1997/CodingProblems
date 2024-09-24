package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_3;

/**
 * learn: https://takeuforward.org/data-structure/reverse-a-linked-list/
 * practice: https://leetcode.com/problems/reverse-linked-list/description/
 *
 Given the head of a singly linked list, reverse the list, and return the reversed list.


 */
public class _2ReverseALinkedList {
    public static void main(String[] args) {
        
    }

    //Time Complexity - O(N) , space - O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }



}


