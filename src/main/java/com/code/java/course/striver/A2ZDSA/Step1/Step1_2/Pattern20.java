package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 <IMPORTANT>
 For Input:
 5
 Your Output:
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */
public class Pattern20 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=0&&n<=20){
            for(int i=0;i<n;i++){
                for(int j=0;j<2*n;j++){
                    if(j>=(n-i)&&j<(n+i))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>0;i--){
                for(int j=0;j<2*n;j++){
                    if(j>(n-i)&&j<(n+i-1))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
