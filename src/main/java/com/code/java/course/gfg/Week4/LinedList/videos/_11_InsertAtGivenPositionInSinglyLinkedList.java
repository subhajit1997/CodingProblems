package com.code.java.course.gfg.Week4.LinedList.videos;



public class _11_InsertAtGivenPositionInSinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head = insertPosition(head, 1, 10);
        head = insertPosition(head, 2, 20);
    }

    static Node insertPosition(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
            curr = curr.next;
        }
        if(curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
