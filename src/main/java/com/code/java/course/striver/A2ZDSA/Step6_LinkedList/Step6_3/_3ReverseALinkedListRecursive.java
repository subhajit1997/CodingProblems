package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_3;

/**
 * learn: https://takeuforward.org/data-structure/reverse-a-linked-list/
 * practice: https://leetcode.com/problems/reverse-linked-list/description/
 *
 Given the head of a singly linked list, reverse the list, and return the reversed list.


 */
public class _3ReverseALinkedListRecursive {
    public static void main(String[] args) {
        
    }

    //Recursive call for reversal
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        if(temp==null || temp.next==null){
            return temp;
        }
        ListNode newHead = reverseList(temp.next);
        ListNode front = temp.next;
        front.next = temp;
        temp.next = null;
        return newHead;
    }



}


