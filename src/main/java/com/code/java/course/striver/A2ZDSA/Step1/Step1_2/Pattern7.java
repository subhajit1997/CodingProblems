package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 Input: 5

 Output:
     *
    ***
   *****
  *******
 *********
 */
public class Pattern7 {
    public static void main(String[] args) {
        printTriangle(5);
        printTriangle1(5);
    }
    static void printTriangle(int n) {

        if(n>=1 && n<=20){
            for(int i=0;i<n;i++){
                for(int j=n-1;j>i;j--){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    //optimised
    static void printTriangle1(int n) {
        if(n>=1 && n<=20){
            for(int i=1;i<=n;i++){
                for(int j=n;j>i;j--){
                    System.out.print(" ");
                }

                for(int k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }
}
