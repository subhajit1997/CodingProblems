package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**

 For Input:
 5
 Your Output:
 A
 BB
 CCC
 DDDD
 EEEEE

 */
public class Pattern17 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=0&&n<=20){
            char value = 'A';
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(value);
                }
                System.out.println();
                value++;
            }
        }
    }
}
