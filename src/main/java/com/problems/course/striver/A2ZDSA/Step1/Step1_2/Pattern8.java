package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**
 Input: 5

 Output:

 *********
  *******
   *****
    ***
     *
 */
public class Pattern8 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {

        if(n>=0&& n<=20){
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=2*(n-i)-1;k>0;k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
