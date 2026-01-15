package com.code.java.course.codingblocks.Lecture4;

import java.util.Scanner;

public class _20thNov {
    public static void main(String[] args) {
        //13th question
        /*
            * 
            * * 
            * * * 
            * * * * 
            * * * * * 
            * * * * 
            * * * 
            * * 
            * 
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row_1 = 1;
        int nst_1 = 1;
        System.out.println("13 th question");
        while (row_1<=2*n-1) {
            int cst =0;
            while (cst<nst_1) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if(row_1<n){
                nst_1++;
            }else{
                nst_1--;
            }
            row_1++;
        }
        //14th question
        /*
       * 
      * * 
    * * * 
  * * * * 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
        */
       System.out.println("14th question");
        int row_2 = 1;
        int nst_2 = 1;
        int nsp_2 = n-1;
        while (row_2<=2*n-1) {
            //space
            int csp = 0;
            while (csp<nsp_2) {
                System.out.print("  ");
                csp++;
            }
            //star
            int cst =0;
            while (cst<nst_2) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            //next row
            if(row_2<n){
                nst_2++;
                nsp_2--;
            }else{
                nst_2--;
                nsp_2++;
            }
            row_2++;
        }
        //16th question
        /*
                    * * * * * 
                * * * * 
                * * * 
            * * 
        * 
            * * 
                * * * 
                * * * * 
                    * * * * * 
        */
        System.out.println("16th question");
        int row_3=1;
        int nst_3= n;
        int nsp_3=n-1;
        while (row_3<=2*n-1) {
            //space
            int csp=0;
            while (csp<nsp_3) {
                System.out.print("  ");
                csp++;
            }
            int cst=0;
            while (cst<nst_3) {
                System.out.print("* ");
                cst++;
            }

            if(row_3<n){
                nst_3--;
                nsp_3--;
            }else{
                nst_3++;
                nsp_3++;
            }
            row_3++;
            System.out.println();
        }
        //18th question
        /*
                * 
              * * * 
            * * * * * 
              * * * 
                * 
        */
        System.out.println("18th question");
        int nst_4=1;
        int row_4= 1;
        int nsp_4=n/2;
        while (row_4<=n) {
            //space
            int csp=0;
            while (csp<nsp_4) {
                System.out.print("  ");
                csp++;
            }
            int cst=0;
            while (cst<nst_4) {
                System.out.print("* ");
                cst++;
            }
            if(row_4<n/2+1){
                nst_4+=2;
                nsp_4--;
            }else{
                nst_4-=2;
                nsp_4++;       
            }
            row_4++;
            System.out.println();
        }
        System.out.println("7th question");
/*
            * * * * * 
            *       * 
            *       * 
            *       * 
            * * * * * 

*/
        int nst_5=n;
        int row_5 =1;
        while (row_5<=n) {
            int cst =0;
            while (cst<nst_5) {
                if(cst==0 || cst==n-1 || row_5==1 || row_5==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                cst++;
            }
            System.out.println();
            row_5++;
        }
/*
* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
*/
        System.out.println("19th question");
        int row_6=1;
        int nst6_1 = (n+1)/2;
        int nst6_2 = (n+1)/2;
        int nsp_6 =-1;
        while (row_6<=n) {
            //star
            int cst1=0;
            while (cst1<nst6_1) {
                System.out.print("* ");
                cst1++;
            }
            //space
            int csp=0;
            while (csp<nsp_6) {
                System.out.print("  ");
                csp++;
            }
            //star2
            int cst2=0;
            if(row_6==1 || row_6==n){
                cst2=1;
            }
            while (cst2<nst6_2) {
                System.out.print("* ");
                cst2++;
            }
            System.out.println();
            if(row_6<n/2+1){
                nst6_1--;
                nst6_2--;
                nsp_6+=2;
            }else{
                nst6_1++;
                nst6_2++;
                nsp_6-=2;
            }

            row_6++;

        }
        //practice - all remaining pattern & contest dec 1st
    }
    
}
