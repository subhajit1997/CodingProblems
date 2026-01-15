package com.code.java.course.gfg.Week4.LinedList.videos;

public class _10_InsertAtTheEndOfSinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
    }
    public static Node insertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null)
            return temp;
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
}
