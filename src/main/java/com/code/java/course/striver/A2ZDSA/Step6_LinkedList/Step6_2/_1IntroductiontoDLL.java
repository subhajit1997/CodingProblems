package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_2;

/**
 * learn:https://takeuforward.org/binary-search/introduction-to-doubly-linked-list/
 * prraice:https://www.codingninjas.com/studio/problems/introduction-to-doubly-linked-list_8160413?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries
 */
public class _1IntroductiontoDLL {
    public static Node constructDLL(int []arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
};