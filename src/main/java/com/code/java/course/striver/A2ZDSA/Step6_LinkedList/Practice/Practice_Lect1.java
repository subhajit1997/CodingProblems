package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Practice;


import java.util.Arrays;
import java.util.List;


public class Practice_Lect1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12,8,5,7);
        lect1_1(arr);
        lect1_2(arr,100);
        lect1_3(arr);
        lect1_4(arr);
        lect1_5(arr,7);
    }

    public static void lect1_1(List<Integer> arr ){
        Node y = new Node(arr.get(0));
        System.out.println(y.data);
    }
    public static void lect1_2(List<Integer> arr, int val){
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        head = insertHead(head,val);
        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node insertHead(Node head, int val) {
        Node temp = new Node(val,head);
        return temp;

    }
    public static void lect1_3(List<Integer> arr){
        
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        head = deleteTrail(head);
        printLinkedList(head);
    }

    private static Node deleteTrail(Node head) {
        if(head ==null || head.next==null)
            return null;
        Node temp =head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }  
    public static void lect1_4(List<Integer> arr){
        
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        System.out.println(lengthOfLL(head));
    }

    private static int lengthOfLL(Node head) {
        int count=0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void lect1_5(List<Integer> arr,int val){
        
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        System.out.println(checkIfPresent(head,val));
    }

    private static boolean checkIfPresent(Node head, int val) {
        Node tempNode = head;
        while (tempNode!=null) {
            if(tempNode.data ==val){
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }
}
