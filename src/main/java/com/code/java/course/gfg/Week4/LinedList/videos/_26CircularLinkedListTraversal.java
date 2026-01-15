package com.code.java.course.gfg.Week4.LinedList.videos;

public class _26CircularLinkedListTraversal {
    public static void main(String[] args) {
        // in circular linked list we use Node format of single LL
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next =  new Node(15);
        head.next.next.next.next = head;
        printList(head);
    }

    static void printList(Node head){
        if(head == null)
            return;
        System.out.print(head.data+ " ");
        for(Node r=head.next ; r!=head;r=r.next){
            System.out.print(r.data+" ");
        }
    }
}
