package com.code.java.company.AthenaHealth.LinkedLists;
/*
 * https://www.geeksforgeeks.org/binary-search-on-singly-linked-list/
 */
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class _4BinarySearchOnLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(10);
        if(binarySearch(head,5)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
    }
    public static boolean binarySearch(Node head,int value){
        Node start = head;
        Node last = null;
        while(true){
            Node mid = middle(start,last);
            if(mid == null)
                return false;
            if(mid.data ==value)
                return true;
            else if(start==last)
                break;
            else if(mid.data <value)
                start = mid.next;
            else if(mid.data >value)
                last = mid;
        }
        return false;
    }
    public static Node middle(Node start,Node last){
        if(start==null)
            return null;
        if(start == last)
            return start;
        Node slow = start;
        Node fast = start.next;
        while (fast!=last) {
            fast = fast.next;
            slow = slow.next;
            if(fast!=last)
                fast = fast.next;
        }
        return slow;
    }
}
