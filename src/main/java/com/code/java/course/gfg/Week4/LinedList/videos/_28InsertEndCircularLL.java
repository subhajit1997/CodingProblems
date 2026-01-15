package com.code.java.course.gfg.Week4.LinedList.videos;

public class _28InsertEndCircularLL {
    
    public static void main(String[] args) {
        // in circular linked list we use Node format of single LL
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next =  new Node(15);
        head.next.next.next.next = head;
        printList(head);
        head = insertEnd(head,11);
        System.out.println();
        printList(head);
        head=insertEndEfficient(head,44);
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
    //naive solution , Time: O(N)
    public static Node insertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null){
            temp.next = temp;
            return temp;
        }else{
            Node curr = head;
            while (curr.next !=head) 
                curr = curr.next;
            curr.next =temp;
            temp.next =head;
            return head;
        }
    }

    //efficient solution , Time: O(1)
    public static Node insertEndEfficient(Node head,int x){
        Node temp = new Node(x);
        if(head==null){
            temp.next = temp;
            return temp;
        }else{
            temp.next = head.next;
            head.next = temp;
            int tempval = temp.data;
            temp.data = head.data;
            head.data = tempval;
            return temp;
        }
    }
}
