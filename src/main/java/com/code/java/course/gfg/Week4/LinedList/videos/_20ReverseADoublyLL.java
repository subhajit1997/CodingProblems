package com.code.java.course.gfg.Week4.LinedList.videos;

public class _20ReverseADoublyLL {
    public static void main(String args[]) 
    { 
        NodeD head=new NodeD(10);
    	NodeD temp1=new NodeD(20);
    	NodeD temp2=new NodeD(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
        printlist(head);
    	head = reverseDLL(head);
    	printlist(head);
    	
    } 
    public static void printlist(NodeD head){
        NodeD curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static  NodeD reverseDLL(NodeD head){
        if(head == null || head.next ==null)
            return head;
        NodeD prev = null;
        NodeD curr = head;
        while(curr!=null){
            //swapping references
            prev = curr.prev; // temp

            curr.prev = curr.next;
            curr.next = prev;

            curr = curr.prev;
        }
        return prev.prev;
    }
}
