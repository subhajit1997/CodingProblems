package com.code.java.company.AthenaHealth.LinkedLists;

import java.util.HashMap;
import java.util.Map;

/*
 * https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
 */
class Node{
    public int data;
    public Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class _5CycleDetectionInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        if(detectCycle(head)){
            System.out.println("cycle detected");
        }else{
            System.out.println("not cuyclic");
        }
    }
    public static boolean detectCycle(Node head){
        Node temp = head;
        Map<Node, Integer> nodeMap = new HashMap<>();

        while (temp!=null) {
            if(nodeMap.containsKey(temp)){
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}
