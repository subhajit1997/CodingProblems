package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 Input: 5

 Output:
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern5 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=1 && n<=20){
            for(int i=n;i>0;i--){
                for(int j=i;j>0;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
