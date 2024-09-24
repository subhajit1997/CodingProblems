package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_3;

import java.util.HashMap;
import java.util.Map;

/**
 * learn:   https://leetcode.com/problems/linked-list-cycle/
 * practice: https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class _4DetectALoopInLL {
    public static void main(String[] args) {

    }

    //Using itterative with hashMap
    // Time Complexity : O(N)
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> mpp= new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(mpp.containsKey(temp)){
                return true;
            }
            mpp.put(temp,1);
            temp = temp.next;
        }
        return false;
    }

    //Tortoise & Hare Approach Optimised
    public boolean hasCycleOptimised(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }



}
