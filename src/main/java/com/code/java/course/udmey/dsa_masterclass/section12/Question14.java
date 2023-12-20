package com.code.java.course.udmey.dsa_masterclass.section12;
import java.util.HashSet;
public class Question14 {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.createLinkedList(1);
        linkedList.insertLinkedList(2);
        linkedList.insertLinkedList(2);
        linkedList.insertLinkedList(2);
        linkedList.insertLinkedList(5);
        linkedList.traverseLinkedList();
        deleteDups(linkedList);
        linkedList.traverseLinkedList();
    }

    public static void deleteDups(LinkedList ll){
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current!=null){
            int currentValue = current.value;
            if(hashSet.contains(currentValue)){
                prev.next = current.next;
                ll.size --;
            }else{
                hashSet.add(currentValue);
                prev = current;
            }
            current =current.next;
        }
    }

}
