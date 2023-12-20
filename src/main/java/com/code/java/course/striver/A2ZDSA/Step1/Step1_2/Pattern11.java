package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**
 For Input:
 5
 Your Output:
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1

 */
public class Pattern11 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=1 && n<=20){
            int val1=1;
            int val2=0;
            for(int i=0;i<n;i++){

                for(int j=0;j<=i;j++){
                    if(j%2==0)
                        System.out.print(val1+" ");
                    else
                        System.out.print(val2+" ");

                }
                int k=val1;
                val1=val2;
                val2=k;

                System.out.println();
            }
        }
    }
}
