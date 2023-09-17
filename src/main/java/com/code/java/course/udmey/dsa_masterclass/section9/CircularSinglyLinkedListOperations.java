package com.code.java.course.udmey.dsa_masterclass.section9;

public class CircularSinglyLinkedListOperations {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCircularSinglyLinkedList(5);
        System.out.println(cSLL.head.value);
        cSLL.insertCircularSinglyLinkedList(4,0);
        cSLL.insertCircularSinglyLinkedList(6,1);
        cSLL.insertCircularSinglyLinkedList(7,8);
        System.out.println(cSLL.head.value);
        cSLL.traversalCircularSinglyLinkedList();
        cSLL.searchNode(10);
        cSLL.deleteCircularSinglyLinkedList(0);
        cSLL.traversalCircularSinglyLinkedList();
        cSLL.deleteEntireCircularSinglyLinkedList();
        cSLL.traversalCircularSinglyLinkedList();

    }
}
class Node{
    public int value;
    public Node next;
}
class CircularSinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head =node;
        tail = node;
        size =1;
        return head;
    }
    public void insertCircularSinglyLinkedList(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head ==null){
            createCircularSinglyLinkedList(nodeValue);
            return;
        }else if(location ==0){
            node.next=head;
            head = node;
            tail.next = head;
        }else if(location>=size){
            tail.next = node;
            tail=node;
            tail.next=head;
        }else {
            Node tempNode = head;
            int index=0;
            while(index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.next=tempNode.next;
            tempNode.next = node;
        }
        size++;
    }
    public  void traversalCircularSinglyLinkedList(){
        if(head==null){
            System.out.println("CLL does not exist");
        }else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }
    public boolean searchNode(int nodeValue){
        if(head==null){
            System.out.println("CSLL does not exist");
        }else{
            Node tempNode =head;
            for(int i=0;i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found : "+nodeValue +"at location:"+i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("No node found");
        return false;
    }
    public void deleteCircularSinglyLinkedList(int location){
        if(head==null){
            System.out.println("CSLL does not exist");
            return;
        }else if(location==0){
            head = head.next;
            tail.next=head;
            size--;
            if(size==0){
                tail=null;
                head.next=null;
                head=null;
            }
        }else if(location>=size){
            Node tempNode =head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                head.next=null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next=head;
            tail=tempNode;
            size--;
        }else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }
    public void deleteEntireCircularSinglyLinkedList(){
        if(head==null){
            System.out.println("cSLL does not exist");
        }else{
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("cSLL is successfully deleted");
        }
    }
}
