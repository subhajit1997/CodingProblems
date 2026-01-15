package com.code.java.course.gfg.Week4.LinedList.videos;

public class _12_DeleteFirstNodeOfSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head = deleteHead(head);
        System.out.println();
        printList(head);
    }
    static Node deleteHead(Node head){
        if(head == null)
            return null;
        else
            return head.next;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
