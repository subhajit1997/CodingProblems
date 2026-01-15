package com.code.java.course.gfg.Week4.LinedList.videos;



public class _8_RecursiveTraversalSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        recursivePrint(head);
    }
    static void recursivePrint(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        recursivePrint(head.next);
    }
    
}
