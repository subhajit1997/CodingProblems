package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_3;

import java.util.ArrayList;
import java.util.List;

/**
 * learn: https://takeuforward.org/data-structure/check-if-given-linked-list-is-plaindrome/
 * practice:
 */
public class _7CheckLLPalindromeOrNot {
    public static void main(String[] args) {

    }
    //using Arraylist
    // Time - O(N) . size:O(N)
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        for(int i=0;i<list.size()/2;i++){
            if(list.get(i)!=list.get(list.size()-i-1))
                return false;
        }
        return true;
    }

    //optimised using Tortoise & Hare Approach
    //Time Complexity: O(N/2)+O(N/2)+O(N/2)
    //Space Complexity: O(1)

    public boolean isPalindromeOptimised(ListNode head) {
        if(head == null || head.next==null)
            return true;
        ListNode slow= head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;
        ListNode temp = head;
        while(slow!=null){
            if(slow.val!=temp.val)
                return false;
            slow = slow.next;
            temp = temp.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode front= null;
        while(head!=null){
            front = head.next;
            head.next= prev;
            prev = head;
            head = front;
        }
        return prev;
    }
}
