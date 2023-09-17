package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 <IMPORTANT>
 Input: 4

 Output:
 ****
 *  *
 *  *
 ****

 */
public class Pattern22 {
    public static void main(String[] args) {
        printSquare(5);
    }
    static  void printSquare(int n) {
        if(n>0&&n<=20){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if((i==1||i==n )||(j==1||j==n)){
                        System.out.print("*");
                    }else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
