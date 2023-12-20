package com.code.java.course.udmey.dsa_masterclass.section10;

public class DoublySinglyLinkedListOperations {
    public static void main(String[] args) {
        DoublySinglyLinkedList dSLL = new DoublySinglyLinkedList();
        dSLL.createDSLL(1);
        dSLL.insertDSLL(2,0);
        dSLL.insertDSLL(3,1);
        dSLL.insertDSLL(4,7);
        System.out.println(dSLL.head.value);
        dSLL.traverDSLL();
        dSLL.reverseTraverDSLL();
    }
}
class DoubleNode {
    public int value;
    public DoubleNode next;
    public DoubleNode prev;
}

class DoublySinglyLinkedList{
    DoubleNode head;
    DoubleNode tail;
    int size;
    public DoubleNode createDSLL(int nodeValue){
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();
        newNode.value =nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail =newNode;
        size =1;
        return head;
    }
    public void insertDSLL(int nodevalue,int location){
        DoubleNode newNode = new DoubleNode();
        newNode.value=nodevalue;
        if(head ==null){
            System.out.println("DSLL does not exist, creating a new one ");
            createDSLL(nodevalue);
            return;
        }else if(location==0){
            newNode.next=head;
            newNode.prev = null;
            head.prev=newNode;
            head = newNode;
        }else if(location >=size){
            newNode.next=null;
            tail.next= newNode;
            newNode.prev=tail;
            tail=newNode;
        }else{
            DoubleNode tempNode =head;
            int index=0;
            while(index<location-1){
                tempNode= tempNode.next;
                index++;
            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            newNode.next.prev=newNode;
        }
        size++;
    }
    public void traverDSLL(){
        if(head==null){
            System.out.println("DSLL does not exist");
        }else{
            DoubleNode tempNode = head;
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
    public void reverseTraverDSLL(){
        if(head==null){
            System.out.println("DSLL does not exist");
        }else{
            DoubleNode tempNode = tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
            System.out.println();
        }
    }
}