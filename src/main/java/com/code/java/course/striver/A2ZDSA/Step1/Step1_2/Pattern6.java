package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 Input: 5

 Output:
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */
public class Pattern6 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {

        if(n>=1 && n<=20){
            for(int i=n;i>0;i--){
                int count=1;
                for(int j=i;j>0;j--){
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
        }
    }
}
