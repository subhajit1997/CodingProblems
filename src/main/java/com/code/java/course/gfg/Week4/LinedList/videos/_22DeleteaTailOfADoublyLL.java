package com.code.java.course.gfg.Week4.LinedList.videos;

public class _22DeleteaTailOfADoublyLL {
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
    	head = deleteTail(head);
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
    public static NodeD deleteTail(NodeD head){
        if(head ==null)
            return null;
        if(head.next ==null)
            return null;
        NodeD curr = head;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.prev.next=null;
        return head;
            
    }
}
