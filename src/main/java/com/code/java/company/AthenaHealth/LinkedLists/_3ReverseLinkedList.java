package com.code.java.company.AthenaHealth.LinkedLists;
/*
 *https://takeuforward.org/data-structure/reverse-a-linked-list/ 
 */
class NodeR{
    int data;
    NodeR next;
    NodeR(int data,NodeR next){
        this.data=data;
        this.next = next;
    }
    NodeR(int data){
        this.data=data;
        this.next = null;
    }
}
public class _3ReverseLinkedList {
    public static void main(String[] args) {
        NodeR head = new NodeR(1);
        head.next = new NodeR(3);
        head.next.next = new NodeR(2);
        head.next.next.next = new NodeR(4);
        printLinkedList(head);
        head = reverseLL(head);
        printLinkedList(head);
    }
    public static void printLinkedList(NodeR head){
        NodeR temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static NodeR reverseLL(NodeR head){
        NodeR temp = head;
        NodeR prev = null;
        while (temp!=null) {
            NodeR front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
