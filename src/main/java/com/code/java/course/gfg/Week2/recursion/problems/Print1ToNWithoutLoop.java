package com.code.java.course.gfg.Week2.recursion.problems;

public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        printNos(10);
    }
    public static void printNos(int n) {
        printRecursive(n,1);
    }
    public static void printRecursive(int n,int i){
        if(n==0){
            return;
        }
        System.out.print(i+" ");
        printRecursive(n-1,i+1);
    }
}
