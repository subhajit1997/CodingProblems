package com.problems.course.striver.A2ZDSA.Step1.Step1_2;

/**

 For Input:
 4
 Your Output:
 4 4 4 4 4 4 4
 4 3 3 3 3 3 4
 4 3 2 2 2 3 4
 4 3 2 1 2 3 4
 4 3 2 2 2 3 4
 4 3 3 3 3 3 4
 4 4 4 4 4 4 4

 */
public class Pattern23 {
    public static void main(String[] args) {
        printSquare(5);
    }
    static   void printSquare(int n) {
        if(n>0&&n<=20){
            int row = 0;
            int col=0;
            for(int i=0;i<2*n-1;i++){
                for(int j=0;j<2*n-1;j++){
                    int top=i;
                    int left=j;
                    int right = (2*n-2)-j;
                    int down = (2*n-2)-i;
                    System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right))+" ");
                }
                System.out.println();
            }
        }
    }
}
