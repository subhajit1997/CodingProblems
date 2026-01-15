package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Practice;


public class Practice_Lect2 {
    public static void main(String[] args) {
        int[] arr = {12,8,5,7};
        DoubleLLNode head = convertArrayTwoDLL(arr);
        System.out.println("Doubly Linked List Initially: ");
        printDLL(head);
        System.out.println("Doubly Linked List After Inserting before the DoubleLLNode with value 8:");
        head = lect1_2(head,8);
        printDLL(head);
        System.out.println("Doubly Linked List after deleting tail node: ");
        head = lect1_3_Delete_tail(head);
        printDLL(head);
        System.out.println("Doubly Linked List after deleting head node: ");
        head = lect1_3_Delete_head(head);
        printDLL(head);
        System.out.println("Doubly Linked List reverse: ");
        head = lect1_3_reverse(head);
        printDLL(head);
    }
    
    private static void printDLL(DoubleLLNode head) {
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static DoubleLLNode lect1_2(DoubleLLNode head,int k){
       
       //insert at tail
       DoubleLLNode newDoubleLLNode = new DoubleLLNode(k);
       if(head==null)
            return newDoubleLLNode;
        DoubleLLNode current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newDoubleLLNode;
        newDoubleLLNode.back = current;
        return head;
    }

    private static DoubleLLNode convertArrayTwoDLL(int[] arr) {
        DoubleLLNode head = new DoubleLLNode(arr[0]);
        DoubleLLNode prev = head;
        for(int i=1;i<arr.length;i++){
            DoubleLLNode temp = new DoubleLLNode(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static DoubleLLNode lect1_3_Delete_tail(DoubleLLNode head){
       
       //delete at tail
        if(head==null || head.next == null){
            return null;
        }
        DoubleLLNode tail = head;
        while (tail.next!=null) {
            tail = tail.next;
        }
        DoubleLLNode newtail = tail.back;
        newtail.next = null;
        tail.back = null;
        return head;
    }
    public static DoubleLLNode lect1_3_Delete_head(DoubleLLNode head){
       
       //delete at head
        if(head==null || head.next == null){
            return null;
        }
        DoubleLLNode prev = head;
        head = head.next;
        head.back =null;
        prev.next = null;
        return head;
    }
    public static DoubleLLNode lect1_3_reverse(DoubleLLNode head){
       
        if(head == null || head.next ==null)
            return null;
        DoubleLLNode prev = null;
        DoubleLLNode current = head;
        while (current!=null) {
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }
        return prev.back;
    }
}
