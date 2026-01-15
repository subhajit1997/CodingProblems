package com.code.java.course.gfg.Week4.LinedList.videos;

public class _33MiddleOflinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
        
        System.out.println(findMiddle(head));
        System.out.println(findMiddleEfficient(head));
    }
    //naive solution
    //two traversal
    static int findMiddle(Node head){
        if(head==null)
            return -1;
        int count=0;
        Node curr;
        for(curr=head;curr!=null ; curr =curr.next){
            count++;
        }
        curr=head;
        for(int i=0;i<count/2;i++){
            curr = curr.next;
        }
        return curr.data;
    }
    //efficiuent 
    //using slow and fast refernces using two pointers
    //where slow moves 1 nodes at a time and fast moves 2 nodes when fast reraches null then we get mid
    static int findMiddleEfficient(Node head){
        if(head==null)
            return -1;
        Node slow = head ,fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
