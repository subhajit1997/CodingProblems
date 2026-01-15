package com.code.java.course.gfg.Week4.LinedList.videos;
// class Node{
//     int data;
//     Node next;

//     Node(int x){
//         data=x;
//         next=null;
//     }
// }
public class _23CircularLL {
    public static void main(String[] args) {
        // in circular linked list we use Node format of single LL
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next =  new Node(15);
        head.next.next.next.next = head;
    }

}
