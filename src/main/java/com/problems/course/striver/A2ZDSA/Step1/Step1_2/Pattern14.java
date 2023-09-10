package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**

 For Input:
 5
 Your Output:
 A
 AB
 ABC
 ABCD
 ABCDE

 */
public class Pattern14 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=0&&n<=20){
            for(int i=0;i<n;i++){
                char start = 'A';
                for(int j=0;j<=i;j++){
                    System.out.print(start);
                    start++;
                }
                System.out.println();
            }
        }
    }
}
