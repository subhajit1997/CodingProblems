package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 Input: 5

 Output:
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */
public class Pattern3 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=1 && n<=20){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
