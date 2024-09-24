package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_2;

import java.util.Stack;

/**
 * learn:https://takeuforward.org/data-structure/reverse-a-doubly-linked-list/
 * practice: https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class _4ReverseADLL {
        //Brute Force Approach - swapping data
        public static Node reverseDLL(Node head)
        {
            Stack<Integer> st = new Stack<>();
            Node temp = head;
            while(temp!=null){
                st.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            while(temp!=null){
                temp.data =st.pop();
                temp = temp.next;
            }
            return head;
        }

        //Optimised approach - changing links
        public static Node reverseDLLOptimised(Node head)
        {
            if(head==null || head.next ==null)
                return head;
            Node newPrev = null;
            Node current=head;
            while(current!=null){
                newPrev = current.prev;
                current.prev = current.next;
                current.next = newPrev;
                current= current.prev;
            }
            return newPrev.prev;
        }
}
