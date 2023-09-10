package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

public class PrintRecursionNTimes {
    public static void main(String[] args) {
        printNtimes(4);
    }
    public static void printNtimes(int n){
        if(n<=0){
            return;
        }
        System.out.print("Coding Ninjas ");
        n--;
        printNtimes(n);
    }
}
