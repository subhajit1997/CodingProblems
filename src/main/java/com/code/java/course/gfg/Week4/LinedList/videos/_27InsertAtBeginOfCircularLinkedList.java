package com.code.java.course.gfg.Week4.LinedList.videos;

public class _27InsertAtBeginOfCircularLinkedList {
    public static void main(String[] args) {
        // in circular linked list we use Node format of single LL
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next =  new Node(15);
        head.next.next.next.next = head;
        printList(head);
        head = insertBegin(head,11);
        System.out.println();
        printList(head);
        head = insertBeginEfficient(head,44);
        System.out.println();
        printList(head);
    }

    static void printList(Node head){
        if(head == null)
            return;
        System.out.print(head.data+ " ");
        for(Node r=head.next ; r!=head;r=r.next){
            System.out.print(r.data+" ");
        }
    }
    //naive solution, Time : O(N)
    public static Node insertBegin(Node head,int x){
        Node temp = new Node(x);
        if(head==null)
            temp.next = temp;
        else{
            Node curr = head;
            while(curr.next!=head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }
    //efficient solution, Time : O(1)
    //swap the value of head with new node
    public static Node insertBeginEfficient(Node head,int x){
        Node temp = new Node(x);
        if(head==null){
            temp.next = temp;
            return temp;
        }else{
            temp.next = head.next;
            head.next = temp;
            int tempval = head.data;
            head.data = temp.data;
            temp.data = tempval;
            return head;
        }

    }

}
