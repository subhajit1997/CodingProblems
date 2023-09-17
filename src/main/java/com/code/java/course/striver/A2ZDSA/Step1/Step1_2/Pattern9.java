package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 For Input:
 5
 Your Output:
     *
    * *
   * * *
  * * * *
 * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

 */
public class Pattern9 {
    public static void main(String[] args) {
        printDiamond(5);
    }
    static void printDiamond(int n) {
        if(n>=1 && n<=20){
            int l=0;
            for(int i=0;i<2*n;i++){
                if(i<n){
                    for(int j=i;j<n-1;j++){
                        System.out.print(" ");
                    }
                    for(int k=0;k<=i;k++){
                        System.out.print("* ");
                    }
                }else{
                    for(int j=0;j<l;j++){
                        System.out.print(" ");
                    }
                    for(int k=n;k>l;k--){
                        System.out.print("* ");
                    }
                    l++;
                }
                System.out.println();
            }
        }
    }
}
