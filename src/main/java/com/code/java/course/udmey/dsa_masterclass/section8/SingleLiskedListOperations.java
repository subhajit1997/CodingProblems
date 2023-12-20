package com.code.java.course.udmey.dsa_masterclass.section8;

public class SingleLiskedListOperations {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(99,3);
        sLL.insertInLinkedList(8,4);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);
        sLL.traversalSingleLinkedList();
        sLL.searchNode(8);
        sLL.deleteFromSingleLinkedList(2);
        sLL.traversalSingleLinkedList();
        sLL.deleteAllSingleLinkedList();
        sLL.traversalSingleLinkedList();
    }
}
class Node {
    public int value;
    public Node next;
}

class SingleLinkedList{
    public Node head;
    public Node tail;
    public int size;
    public Node createSingleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head =node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSingleLinkedList(nodeValue);
            return;
        }else if(location ==0){
            node.next = head;
            head = node;
        }else if(location >=size){
            node.next = null;
            tail.next = node;
            tail =node;
        }else{
            Node tempNode =head;
            int index =0;
            while(index<location-1){
                tempNode = tempNode.next;
                index ++;
            }
            Node nextNode = tempNode.next;
            tempNode.next =node;
            node.next = nextNode;
        }
        size++;
    }
    public void traversalSingleLinkedList(){
        if(head ==null){
            System.out.println("SLL does not exist");
        }else{
            Node tempNode =head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println();
    }
    public boolean searchNode(int nodeValue){
        if(head ==null){
            System.out.println("SLL does not exist");
        }else {
            Node tempNode = head;
            for(int i =0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("value :"+nodeValue+ "found at location: "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }
    public void deleteFromSingleLinkedList(int location){
        if(head == null){
            System.out.println("SLL does not exist");
            return;
        }else if(location==0){
            head = head.next;
            size--;
            if(size==0){
                tail =null;
            }
        }else if(location >=size){
            Node tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                tail = head =null;
                size--;
                return;
            }
            tempNode.next =null;
            tail =tempNode;
            size--;
        }else {
            Node tempNode = head;
            for(int i=0;i<location -1;i++){
                    tempNode = tempNode.next;
            }
            tempNode.next= tempNode.next.next;
            size--;
        }
    }
    public void deleteAllSingleLinkedList(){
        head =null;
        tail = null;
        System.out.println("SLL is successfully deleted");
    }
}

