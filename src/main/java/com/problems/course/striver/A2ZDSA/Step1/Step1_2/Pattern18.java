package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**

 Input: 4
 Output:
    A
   ABA
  ABCBA
 ABCDCBA

 */
public class Pattern18 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=0&&n<=20){
            for(int i=0;i<n;i++){
                for(int j=n-1;j>i;j--){
                    System.out.print(" ");
                }
                char start='A';
                for(int j=0;j<=i;j++){
                    System.out.print(start);
                    start++;
                }
                start--;
                for(int k=i-1;k>=0;k--){
                    start--;
                    System.out.print(start);
                }
                System.out.println();
            }
        }
    }
}
