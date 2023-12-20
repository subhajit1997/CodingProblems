package com.code.java.course.striver.A2ZDSA.Step6.Step6_1;

/**
 * learn: https://takeuforward.org/linked-list/find-the-length-of-a-linked-list/
 * practice: https://www.codingninjas.com/studio/problems/count-nodes-of-linked-list_5884?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries
 */
public class _4FindTheLengthOfTheLinkedlist {

    public static int length(Node head){
        Node newNode = head;
        int ct=0;
        while(newNode!=null){
            newNode = newNode.next;
            ct++;
        }
        return ct;
    }
}
class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}