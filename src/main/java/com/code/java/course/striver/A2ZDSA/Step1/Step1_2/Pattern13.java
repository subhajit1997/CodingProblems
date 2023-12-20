package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**

 Input: 5

 Output:
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */
public class Pattern13 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        int start=1;
        if(n>=0&& n<=20) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println();
            }
        }
    }
}
