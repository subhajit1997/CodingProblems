package com.code.java.company.AthenaHealth.LinkedLists;

public class _2ImplementAStackusingALinkedList {
    class stackNode{
        int data;
        stackNode next;
        stackNode(int d){
            data = d;
            next = null;
        }
    }
    stackNode top;
    int size;
    _2ImplementAStackusingALinkedList(){
        this.top = null;
        this.size =0;
    }
    public void push(int x){
        stackNode s = new stackNode(x);
        s.next = top;
        top = s;
        System.out.println("elemnt pushed :"+x);
        size++;
    }
    public void print(){
        stackNode current = top;
        while (current!=null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public int pop(){
        if(top==null)
            return -1;
        int topData = top.data;
        top = top.next;
        return topData;
    }
    public int stackSize() {
    return size;
  }
  public boolean stackIsEmpty() {
    return top == null;
  }
    public static void main(String[] args) {
        _2ImplementAStackusingALinkedList s = new _2ImplementAStackusingALinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println("element popped: "+ s.pop());
         s.print();
    }
}
