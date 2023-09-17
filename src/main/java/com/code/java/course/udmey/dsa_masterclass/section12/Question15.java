package com.code.java.course.udmey.dsa_masterclass.section12;

public class Question15 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.createLinkedList(1);
        linkedList.insertLinkedList(2);
        linkedList.insertLinkedList(3);
        linkedList.insertLinkedList(4);
        linkedList.insertLinkedList(5);
        linkedList.traverseLinkedList();
        System.out.println(nthToLast(linkedList,2).value);

    }
    public static Node nthToLast(LinkedList ll , int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i=0;i<n;i++){
            if(p2==null)
                return null;
            p2 = p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
