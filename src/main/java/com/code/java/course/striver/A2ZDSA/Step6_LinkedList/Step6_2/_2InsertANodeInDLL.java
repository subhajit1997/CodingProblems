package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_2;

/**
 * learn:https://takeuforward.org/data-structure/insert-at-end-of-doubly-linked-list/
 * practice:https://www.codingninjas.com/studio/problems/insert-at-end-of-doubly-linked-list_8160464?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class _2InsertANodeInDLL {
    public static Node insertAtTail(Node list, int K) {
        Node lstNode = new Node(K);
        if(list==null)
            return lstNode;

        Node current = list;
        while(current.next!=null){
            current=current.next;
        }
        current.next = lstNode;
        lstNode.prev= current;
        return list;
    }
}
