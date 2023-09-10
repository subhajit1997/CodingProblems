package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**

 For Input:
 5
 Your Output:
 E
 E D
 E D C
 E D C B
 E D C B A

 */
public class Pattern19 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static  void printTriangle(int n) {
        int valueChar =(char)'A'+n;

        if(n>=0&&n<=20){
            for(int i=0;i<n;i++){
                char newval = (char)valueChar;
                for(int j=0;j<=i;j++){
                    newval--;
                    System.out.print(newval+" ");

                }
                System.out.println();
            }
        }
    }
}
