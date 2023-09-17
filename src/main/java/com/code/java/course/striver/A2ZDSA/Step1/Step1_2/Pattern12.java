package com.code.java.course.striver.A2ZDSA.Step1.Step1_2;

/**

 For Input:
 5
 Your Output:
 1                 1
 1 2             2 1
 1 2 3         3 2 1
 1 2 3 4     4 3 2 1
 1 2 3 4 5 5 4 3 2 1

 */
public class Pattern12 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        if(n>=1&&n<=20){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                for(int j=0;j<2*(n-i);j++){
                    System.out.print("  ");
                }
                for(int j=i;j>0;j--){
                    if(j==i){
                        System.out.print(j);
                    }else{
                        System.out.print(" "+j);
                    }
                }
                System.out.println();
            }

        }
    }
}
