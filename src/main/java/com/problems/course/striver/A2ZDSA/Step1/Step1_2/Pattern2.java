package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**
 * Input: 5
 *
 * Output:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Pattern2 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=1 && n<=20){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

}
