package com.code.java.course.gfg.Week4.LinedList.videos;

class NodeD {
    int data;
    NodeD prev;
    NodeD next;
    NodeD(int d){
        data =d;
        prev =null;
        next = null;
    }
}
public class _16_DoublyLinkedList {
    public static void main(String[] args) {
        NodeD head = new NodeD(10);
        NodeD temp1 = new NodeD(10);
        NodeD temp2 = new NodeD(10);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
    }
}
