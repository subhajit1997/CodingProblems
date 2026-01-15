package com.code.java.course.gfg.Week4.LinedList.videos;

public class _32SortedInsertInASinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head = insertInSortedOrder(head, 34);
        System.out.println();
        printList(head);
    }
    //Time : O(N)
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    static Node insertInSortedOrder(Node head,int x){
        Node temp = new Node(x);
        if(head == null)
            return temp;
        if(x<head.data){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next!= null && curr.next.data<x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

}
