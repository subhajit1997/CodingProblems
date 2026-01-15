package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_4;

public class DoubleLLNode{
    public int data;
    public DoubleLLNode next;
    public DoubleLLNode back;

    DoubleLLNode(int data,DoubleLLNode next,DoubleLLNode back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
    DoubleLLNode(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
