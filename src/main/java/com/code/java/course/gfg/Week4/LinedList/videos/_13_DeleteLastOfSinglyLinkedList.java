package com.code.java.course.gfg.Week4.LinedList.videos;

public class _13_DeleteLastOfSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head = deleteTail(head);
        System.out.println();
        printList(head);
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    static Node deleteTail(Node head){
        if(head == null)
            return null;
        if(head.next == null)
            return null;
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
