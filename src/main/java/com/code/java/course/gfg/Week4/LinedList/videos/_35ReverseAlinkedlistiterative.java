package com.code.java.course.gfg.Week4.LinedList.videos;

public class _35ReverseAlinkedlistiterative {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head = reverseLL(head);
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
    //approach 1 : using arraylist to store the elements by iterating once
    //then itterate through the LL again and remove from arralylist from end and update the current data of LL.

    //aproach2:
    static Node reverseLL(Node head){
        Node curr=head;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; //prev is new head
    }
}
