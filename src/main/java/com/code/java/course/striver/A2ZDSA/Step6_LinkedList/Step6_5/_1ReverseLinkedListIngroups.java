package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_5;

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

public class _1ReverseLinkedListIngroups {
    public static void main(String[] args) {
        lect5_1(new int[]{1,2,3,4,5,6,7,8},3);
    }

    private static void printLL(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Reverse Linked List in groups of Size K
    private static void lect5_1(int[] arr,int k) {
        System.out.println("Reverse Linked List in groups of Size K");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[7]);

        System.out.println("original LL: ");
        printLL(head);
        head = kReverse(head,k);
        System.out.println("Modified LL: ");
        printLL(head);
    }

    private static Node kReverse(Node head, int k) {
        Node temp = head;
        Node prevLast = null;
        while (temp!=null) {
            Node kthNode = getKthNodeOfCurrentGroup(temp,k);
            if(kthNode==null){
                if(prevLast!=null){
                    prevLast.next = temp;
                }
                break;
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverseLinkedListGroup(temp);
            if(temp ==head){
                head = kthNode;
            }else{
                prevLast.next = kthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }

    private static Node reverseLinkedListGroup(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    private static Node getKthNodeOfCurrentGroup(Node temp, int k) {
        k = k-1;
        while (temp!=null && k>0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
}
