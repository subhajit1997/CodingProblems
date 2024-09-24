package com.code.java.course.striver.A2ZDSA.Step9_StackQueue.Step9_1;




/**
 * learn: https://takeuforward.org/data-structure/implement-stack-using-array/
 */
public class _1ImplementStackUsingArrays {
    public static void main(String[] args) {
    }
}
class Stack {
    int[] arr;
    int top;
    Stack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }
    public void push(int num) {
        if(top==arr.length-1){
            return;
        }
        top++;
        arr[top] = num;


    }
    public int pop() {
        if(top==-1)
            return -1;
        return arr[top--];
    }
    public int top() {
        if(top ==-1)
            return -1;
        return arr[top];
    }
    public int isEmpty() {
        return (top==-1)?1:0;
    }
    public int isFull() {
        return (top==arr.length-1)?1:0;
    }
}
