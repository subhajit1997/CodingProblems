package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**
 Input: 5

 Output:
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */
public class Pattern4 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=1 && n<=20){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
