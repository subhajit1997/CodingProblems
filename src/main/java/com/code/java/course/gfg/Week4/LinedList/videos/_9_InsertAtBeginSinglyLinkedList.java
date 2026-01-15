package com.code.java.course.gfg.Week4.LinedList.videos;

public class _9_InsertAtBeginSinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
    }
    static Node insertBegin(Node head ,int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
    
}
