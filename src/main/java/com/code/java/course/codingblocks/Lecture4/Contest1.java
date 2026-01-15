package com.code.java.course.codingblocks.Lecture4;

import java.util.Scanner;

public class Contest1 {
    public static void main(String[] args) {
        /*
Take N (number of rows), print the following pattern (for N = 5).

     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *        
        */
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();

        int nst1_1 = (n+1)/2;
        int nst1_2=(n+1)/2;
        int row_1 = 1;
        int nsp_1 = -1;
       while (row_1<=n) {
        int cst_1 = 0;
        //1st star
        while (cst_1<nst1_1) {
            System.out.print("* ");
            cst_1++;
        }
        //space
        int cst_p=0;
        while (cst_p<nsp_1) {
            System.out.print("  ");
            cst_p++;
        }
        //2st star
        int cst = 0;
        if(row_1==1 || row_1==n){
            cst=1;
        }
        while (cst<nst1_2) {
            System.out.print("* ");
            cst++;
        }
        System.out.println();

        if(row_1<n/2+1){
            nst1_1--;
            nsp_1+=2;
            nst1_2--;
        }else{
            nst1_1++;
            nsp_1-=2;
            nst1_2++;
        }
        row_1++;

/*
Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
*/
       }
       int row_2= 1;
       int nst_2=1;
       int nsp_2=n-1;
       while (row_2<=n) {
        int temp_row=row_2;
        //space
        int csp=0;
        while (csp<nsp_2) {
            System.out.print("  ");
            csp++;
        }
        //number
        int cst=0;
        while (cst<nst_2) {
            System.out.print(temp_row+" ");
            if(cst<(nst_2/2))
                temp_row++;
            else
                temp_row--;
            cst++;
        }
        nst_2+=2;
        row_2++;
        nsp_2--;
        System.out.println();
       }
/*
Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *

*/
       int row3 = 1;
       int nst3=1;
       int nsp3= n/2;
       while (row3<=n) {
        //space
        int csp=0;
        while (csp<nsp3) {
            System.out.print("  ");
            csp++;
        }
        //star
        int cst=0;
        while (cst<nst3) {
            System.out.print("* ");
            cst++;
        }
        if(row3<=(n/2)){
            nst3+=2;
            nsp3--;
        }else{
            nst3-=2;
            nsp3++;
        }
        row3++;
        System.out.println();
       }
/*
Take N (number of rows), print the following pattern (for N = 4)

1
2 3
4 5 6
7 8 9 10
*/
       int row4 =1;
       int nst4 = 1;
       int counter=1;
       while (row4<=n) {
        int cst=0;
        while (cst<nst4) {
            System.out.print(counter+" ");
            counter++;
            cst++;
        }
        nst4++;
        row4++;
        System.out.println();
       }
/*
    *****
   *   *
  *   *
 *   *
*****

*/
       int nst5=n;
       int row5=1;
       int nsp5=n-1;
       while (row5<=n) {
        //space
        int csp=0;
        while (csp<nsp5) {
            System.out.print(" ");
            csp++;
        }
        //star
        int cst=0;
        while (cst<nst5) {
            if(row5==1 || row5==n || cst==0 || cst==nst5-1)
                System.out.print("*");
            else{
                System.out.print(" ");
            }
            cst++;
        }
        row5++;
        nsp5--;
        System.out.println();
       }
/*

Take N (number of rows), print the following pattern (for N = 3).

                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1


*/
       int row6 = 1;
       int nst6=1;
       int nsp6= n-1;
        int count6 = 1;
       while (row6<=n*2-1) {
        int count_temp = count6;
        //space
        int csp=0;
        while (csp<nsp6) {
            System.out.print("  ");
            csp++;
        }
        //star
        int cst=0;
        while (cst<nst6) {
            System.out.print(count_temp+" ");
            if(cst<nst6/2){
                count_temp++;
            }else{
                count_temp--;                
            }
            cst++;
        }
        if(row6<=((n*2)/2-1)){
            nst6+=2;
            nsp6--;
            count6++;
        }else{
            nst6-=2;
            nsp6++;
            count6--;
        }
        row6++;
        System.out.println();
       }
/*

Take N (number of rows), print the following pattern (for N = 5)
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5
*/
       int row7=1;
       int nst7=1;
       while (row7<=n) {
        int cst=0;
        while (cst<nst7) {
            if(cst==0 || cst==nst7-1)
                System.out.print(row7+" ");
            else
                System.out.print("0 ");
            cst++;
        }
        row7++;
        nst7++;
        System.out.println();
       }
/*
Take N (number of rows), print the following pattern (for N = 4)
Fibonachi series
0
1 1
2 3 5
8 13 21 34
*/
       int row8=1;
       int nst8=1;
       int a=0;
       int b=1;
       int c=0;
       while (row8<=n) {
        int cst=0;
        while (cst<nst8) {
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
            cst++;
        }
        System.out.println();
        nst8++;
        row8++;
       }
/*
Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1  
 */
       int nst9=1;
       int row9=1;
       int nsp9=2*n-3;
       while (row9<=n) {
        int val=1;
        int cst1=0;
        if(row9==n){
            cst1=1;
        }
        while (cst1<nst9) {
            System.out.print((val++)+ " ");
            cst1++;
        }
        int csp=0;
        while (csp<nsp9) {
            System.out.print("  ");
            csp++;
        }
        int cst2=0;
        val = row9;
        while (cst2<nst9) {
            System.out.print((val--)+" ");
            cst2++;
        }
        row9++;
        nst9++;
        nsp9-=2;
        System.out.println();
       }

/*
You will be given a number N. You have to code a hollow diamond looking pattern.

The output for N=5 is given in the following image.
*/
//0 1 3 5 
       int nst10=n;
       int row10=1;
       int nsp10=-1;
       while (row10<=2*n-1) {
        int cst=0;
        if(row10==1|| row10==2*n-1){
            cst=1;
        }
        while (cst<nst10) {
            System.out.print("*");
            cst++;
        }
        int csp=0;
        if(row10==0)
            csp=1;
        while (csp<nsp10) {
            System.out.print(" ");
            csp++;
        }
        int cst1=0;
        while (cst1<nst10) {
            System.out.print("*");
            cst1++;
        }
        if(row10<n){
            nsp10+=2;
            nst10--;
        }
        else{
            nsp10-=2;
            nst10++;
        }
        row10++;
        System.out.println();
       }
/*
Sample Input
3
Sample Output
*

**

***

*/
       int nst11=1;
       int row11=1;
       while (row11<=2*n-1) {
        int cst=0;
        while (cst<nst11) {
            if(row11%2!=0){
                System.out.print("*");
                cst++;
            }else{
                System.out.println();
                break;
            }
            
        }
        System.out.println();
        if(row11%2!=0){
            nst11++;
        }
        row11++;
       }
/*
Take N as input. For a value of N=7, we wish to draw the following pattern :

            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
*/
       int nst12=1;
       int row12= 1;
       int nsp12_1=-1;
       int nsp12 =n-1;
       int val1=0;
       while (row12<=n) {
        int csp0=0;
        if(row12<n/2+2)
            val1 = row12;
        else
            val1 = n-row12+1;
        int val2=1;
        while (csp0<nsp12) {
            System.out.print("  ");
            csp0++;
        }
        int cst=0;
        if(row12==1 || row12==n)
            cst=1;
        while (cst<nst12) {
            System.out.print(val1+" ");
            val1--;
            cst++;
        }
        int csp=0;
        while (csp<nsp12_1) {
            System.out.print("  ");
            csp++;
        }
        int cst1=0;
        while (cst1<nst12) {
            System.out.print(val2+" ");
            val2++;
            cst1++;
        }  
        if(row12<n/2+1){
            nsp12-=2;
            nsp12_1+=2;
            nst12++;
        }else{
            nsp12+=2;
            nsp12_1-=2;
            nst12--;

        }

        row12++;
        System.out.println();
       }
/*
Pascale triangle
Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
*/      
       //pascales triangel cCr: n!/(n-r)!*r!
       //(row)C(cst) 
       int row13 = 0;
       int nst13=1;
       while (row13<n) {
        int val=1;
        int cst=0;
        while (cst<nst13) {
            System.out.print(val+" ");
            val = val*(row13-cst)/(cst+1);
            cst++;
        }
        System.out.println();
        nst13++;
        row13++;
       }


/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 

Input Format
 */
       int nst14=1;
       int row14 =1;
       int nsp14=2*n-2;
       while (row14<=2*n+1) {
        int cst=0;
        int tempVal = n;
        while (cst<nst14) {
            System.out.print((tempVal--)+" ");
            cst++;
        }
        int csp=0;
        while (csp<=nsp14) {
            System.out.print("  ");
            csp++;
        }
        int cst1=1;
        if(row14!=n+1){
            cst1=0;
            tempVal++;
        }else{
            tempVal+=2;
        }
        while (cst1<nst14) {
            System.out.print((tempVal++)+" ");
            cst1++;
        }
        if(row14<=n){
            nst14++;
            nsp14-=2;
        }else{
            nst14--;
            nsp14+=2;
        }

        row14++;
        System.out.println();
       }
/*
Faculty at CodingBlocks loves to purchase smartphones and decides to play a game. Aayush and Harshit decides to shop for smartphones. Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, then Aayush purchases 3 smartphones, then Harshit purchases 4 smartphones, and so on. Once someone can't purchase more smartphones, he loses.

Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones. Who will win ? Print "Aayush" and "Harshit" accordingly.

Input Format
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. Two integers M and N denoting the maximum possible number of smartphones Aayush and Harshit can purchase respectively.

Constraints
1 ≤ T ≤ 1000 1 ≤ M, N ≤ 10^6

Output Format
For each test case, output a single line containing one string — the name of the winner i.e. Aayush or Harshit
*/
       int t = 1;
       int[] mArray = new int[1000];
       int[] nArray = new int[1000];
       for(int i=0;i<t;i++){
            mArray[i] =  3; //aayush
            nArray[i] =  11; // harshit
       }
       for(int i=0;i<t;i++){
        int val = 0;
        while (true) {
                int m = val++;
                int n1 = val++;
                if(m>=mArray[i]){
                    System.out.println("Harshit");
                    break;
                }
                if(n1>=nArray[i]){
                    System.out.println("Aayush");
                    break;
                }
            }
        }
/*
Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".


Input Format
Constraints
2 < N <= 1000000000
*/
        int val = 83;
        int i=2;
        boolean check =false;
        while (i<val) {
           if(val%i==0 || val%2==0){
            check = true;
            break;
           }
           i++;
        }
        if(check)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");

/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5
*/
        int nst15 = 2*n+1;
        int row15=1;
        int nsp15=0;
        int num=n;
        while (row15<=2*n+1) {
            int tempNum = num;
            int csp=0;
            while (csp<nsp15) {
                System.out.print("  ");
                csp++;
            }
            int cst=0;
            while (cst<nst15) {
                System.out.print(tempNum+" ");
                if(cst<nst15/2)
                    tempNum--;
                else
                    tempNum++;
                cst++;
            }
            if(row15<=n){
                nst15-=2;
                nsp15++;
                num--;
            }else{
                nst15+=2;
                nsp15--;
                num++;
            }

            row15++;
            System.out.println();
        }
    }
}
