package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**

 Input: 5

 Output:
 ABCDE
 ABCD
 ABC
 AB
 A

 */
public class Pattern16 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static  void printTriangle(int n) {
        if(n>=0&&n<=20){
            for(int i=0;i<n;i++){
                char charValue = 'A';
                for(int j=n;j>i;j--){
                    System.out.print(charValue);
                    charValue++;
                }
                System.out.println();
            }
        }
    }
}
