package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_5;

public class _2RotateALinkedList {
    public static void main(String[] args) {
         lect5_2(new int[]{1,2,3,4,5,6,7,8},3);
    }
    private static void printLL(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Rotate a Linked List
    private static void lect5_2(int[] arr,int k) {
        System.out.println("Rotate a Linked List");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[7]);

        System.out.println("original LL: ");
        printLL(head);
        head = rotateRight(head,k);
        System.out.println("Modified LL: ");
        printLL(head);
    }

    private static Node rotateRight(Node head, int k) {
        if(head==null || head.next ==null)
            return head;
        for(int i=0;i<k;i++){
            Node temp = head;
            while (temp.next.next !=null) {
                temp = temp.next;
            }
            Node end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
}
