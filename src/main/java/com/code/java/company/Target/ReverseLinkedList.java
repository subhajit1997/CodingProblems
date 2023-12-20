package com.code.java.company.Target;

/**
 *
 * 	• reversing the linked list
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListOperations ll= new LinkedListOperations();
        ll.createLL(1);
        ll.insertLL(0,0);
        ll.insertLL(2,3);
        ll.insertLL(3,9);
        ll.traverseLL();
        ll.reverseLL();
        ll.traverseLL();
    }
}
class Node{
    public int value;
    public Node next;
}
class LinkedListOperations{
    public Node head;
    public Node tail;
    public int size;
    public Node createLL(int inputValue){
        head = new Node();
        Node node = new Node();
        node.value=inputValue;
        node.next=null;
        head = node;
        tail= node;
        size=1;
        return head;
    }
    public  void insertLL(int inputValue, int location){
        Node node = new Node();
        node.value=inputValue;
        if(head == null){
            System.out.println("Creating new LL");
            createLL(inputValue);
            return;
        }else if(location ==0){
            node.next = head;
            head = node;
        }else if(location>=size){
            node.next = null;
            tail.next= node;
            tail = node;

        }else{
            Node tempNode = head;
            int index=0;
            while(index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    public void traverseLL(){
        if(head==null){
            System.out.println("No LL present");
        }else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                tempNode= tempNode.next;
            }
            System.out.println();
        }
    }
    public void reverseLL(){
        if(head==null){
            return;
        }else{
            Node currentNode = head;
            Node prevNode = null;
            while(currentNode!=null){
                Node temp=currentNode.next;
                currentNode.next= prevNode;
                prevNode=currentNode;
                currentNode=temp;
            }
            tail=head;
            head=prevNode;
        }
    }

}
