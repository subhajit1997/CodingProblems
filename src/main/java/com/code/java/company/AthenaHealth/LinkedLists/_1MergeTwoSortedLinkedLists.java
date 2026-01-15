package com.code.java.company.AthenaHealth.LinkedLists;

import java.util.ArrayList;
import java.util.Collections;

/**
 * https://takeuforward.org/data-structure/merge-two-sorted-linked-lists/
 */
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        data=data1;
        next = next1;
    }
    Node(int data1){
        data=data1;
        next = null;
    }
}
//Time Complexity: O(N1 + N2) + O(N log N) + O(N)
//Space Complexity : O(N)+O(N) 
public class _1MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);        

        Node mergedList = sortTwoLinkedLists(list1, list2);
         System.out.print("Final linked list: ");
        printLinkedList(mergedList);  

         Node mergedList1 =sortTwoLinkedListsOptimised(list1, list2);
         System.out.print("Final linked list: ");
        printLinkedList(mergedList1);  
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node sortTwoLinkedLists(Node list1,Node list2){
        ArrayList<Integer> arr =new ArrayList<>();
        Node temp1 = list1;
        Node temp2 = list2;
        while (temp1!=null) {
            arr.add(temp1.data);
            temp1=temp1.next;
        }
        while (temp2!=null) {
            arr.add(temp2.data);
            temp2=temp2.next;
        }
        Collections.sort(arr);
        Node head = convertArrToLinkedList(arr);
        return head;
    }
    public static Node convertArrToLinkedList(ArrayList<Integer> arr){
        Node dummy = new Node(-1);
        Node temp = dummy;

        for(int i=0;i<arr.size();i++){
            temp.next = new Node(arr.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }

        // Function to merge two sorted linked lists
    static Node sortTwoLinkedListsOptimised(Node list1, Node list2) {
        // Create a dummy node to serve
        // as the head of the merged list
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        // Traverse both lists simultaneously
        while (list1 != null && list2 != null) {
            // Compare elements of both lists and
            // link the smaller node to the merged list
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            // Move the temporary pointer
            // to the next node
            temp = temp.next;
        }

        // If any list still has remaining
        // elements, append them to the merged list
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        // Return the merged list starting
        // from the next of the dummy node
        return dummyNode.next;
    }

}
