package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_2;

/**
 * learn:https://takeuforward.org/data-structure/delete-last-node-of-a-doubly-linked-list/
 * prcatice:https://www.codingninjas.com/studio/problems/delete-last-node-of-a-doubly-linked-list_8160469?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class _3DeleteANodeInDLL {
    public static Node deleteLastNode(Node head) {

        if(head==null || head.next==null)
            return null;
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }
}
