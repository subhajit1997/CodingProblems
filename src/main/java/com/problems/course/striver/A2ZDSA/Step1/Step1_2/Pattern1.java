package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**
 * Input: 5
 *
 * Output:
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 */

public class Pattern1 {
    public static void main(String[] args) {
        printSquare(5);
    }
    public static void   printSquare(int n) {
        if(n>=1 && n<=20){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
