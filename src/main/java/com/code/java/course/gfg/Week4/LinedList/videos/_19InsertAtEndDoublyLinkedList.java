package com.code.java.course.gfg.Week4.LinedList.videos;

public class _19InsertAtEndDoublyLinkedList {
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
    	head=insertEnd(head,5);
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
    static NodeD insertEnd(NodeD head, int data){
        NodeD temp = new NodeD(data);
        if(head ==null){
            return temp;
        }

        NodeD curr = head;
        while (curr.next!=null) {
             curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
}
