package com.code.java.course.gfg.Week4.LinedList.videos;

public class _34NthNodeFromEndofLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        
        System.out.println(nthNodeFromEnd(head,2));
        System.out.println(nthNodeFromEndEfficient(head,2));
    }
    //method : 1 (using length of LL)
    static int nthNodeFromEnd(Node head,int x){
        int length= 0;
        Node curr;
        for(curr=head;curr!=null;curr=curr.next){
            length++;
        }
        if(length<x)
            return -1;
        curr = head;
        for(int i=1;i<length-x+1;i++){
            curr =curr.next;
        }
        return curr.data;
    }
    //method 2: using two points/refernces 
    //we keep two points one in head and another in nth place, Now move both simultinuously ,
    // when 2nd references reaches null then 1st refernce is the outcome
    static int nthNodeFromEndEfficient(Node head,int x){
        if(head==null)
            return -1;
        Node first = head;
        for(int i=0;i<x;i++){
            if(first==null)
                return -1;
            first = first.next;
        }
        Node second = head;
        while (first!=null) {
            second = second.next;
            first = first.next;
        }
        return second.data;
    }
}
