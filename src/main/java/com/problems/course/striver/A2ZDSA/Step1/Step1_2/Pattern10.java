package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**
 For Input:
 5
 Your Output:

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern10 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        int star=1;
        if(n>=1 && n<=20){
            for(int i=1;i<=2*n-1;i++){
                if(i<=n){
                    star=i;
                }else{
                    star=2*n-i;
                }
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
