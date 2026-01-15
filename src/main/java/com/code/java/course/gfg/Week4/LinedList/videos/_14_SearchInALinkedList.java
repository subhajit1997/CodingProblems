package com.code.java.course.gfg.Week4.LinedList.videos;

public class _14_SearchInALinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(searchLinkedList(head,30));
        System.out.println(searchLinkedListRecursive(head,30));
    }

    static int searchLinkedList(Node head,int x){
        int i =1;
        Node curr = head;
        while(curr!=null){
            if(curr.data ==x)
                return i;
            else{
                i++;
                curr = curr.next;
            }
        }
        return -1;
        
    }
    static int searchLinkedListRecursive(Node head,int x){
        if(head == null)
            return -1;
        if(head.data ==x)
            return 1;
        else {
            int res = searchLinkedList(head.next, x);
            if(res == -1)
                return -1;
            else
                return (res+1);
        }
    }
}
