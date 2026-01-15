package com.code.java.course.codingblocks.Lecture3;

import java.util.Scanner;

public class _19Nov {
    public static void main(String[] args) {
        //integer input
            //scanner helps to get data
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("9th pattern for input:"+n);
        int row_1 = 1;
        int nst_1 = 1;//number of star
        int nsp_1=n-1; //number of space
        while (row_1<=n) {
            //spaces
            int csp = 0; //count of space
            while (csp<nsp_1) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_1) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row_1++;
            nst_1+=2;
            nsp_1--;
        }
        System.out.println("12th pattern for input:"+n);
        int row_2 = 1;
        int nst_2 = 1;
        int nsp_2=n-1;
        while (row_2<=n) {
            //spaces
            int csp = 0;
            while (csp<nsp_2) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_2) {
                if(cst%2!=0)
                    System.out.print("! ");
                else
                    System.out.print("* ");
                cst++;
            }
            System.out.println();
            row_2++;
            nst_2+=2;
            nsp_2--;
        }
        System.out.println("24th pattern for input:"+n);
        int row_3 = 1;
        int nst_3 = 1;
        int nsp_3=n-1;
        while (row_3<=n) {
            //spaces
            int csp = 0;
            while (csp<nsp_3) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_3) {
                System.out.print(row_3+" ");
                cst++;
            }
            System.out.println();
            row_3++;
            nst_3+=2;
            nsp_3--;
        }
        System.out.println("25th pattern for input:"+n);
        int row_4 = 1;
        int nst_4 = 1;
        int nsp_4=n-1;
        int counter =1;
        while (row_4<=n) {
            //spaces
            int csp = 0;
            while (csp<nsp_4) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_4) {
                System.out.print(counter+" ");
                counter++;
                cst++;
            }
            System.out.println();
            row_4++;
            nst_4+=2;
            nsp_4--;
        }
        System.out.println("26th pattern for input:"+n);
        int row_5 = 1;
        int nst_5 = 1;
        int nsp_5=n-1;

        while (row_5<=n) {
            int counter1=1;
            //spaces
            int csp = 0;
            while (csp<nsp_5) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;

            while (cst<nst_5) {
                System.out.print(counter1+" ");
                counter1++;
                cst++;
            }
            System.out.println();
            row_5++;
            nst_5+=2;
            nsp_5--;
        }
        System.out.println("27th pattern for input:"+n);
        int row_6 = 1;
        int nst_6 = 1;
        int nsp_6=n-1;

        while (row_6<=n) {
            //spaces
            int csp = 0;
            while (csp<nsp_6) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            int counter2 =1;
            while (cst<nst_6) {
                if(cst<nst_6/2){
                    System.out.print(counter2+" ");
                    counter2++;
                }else{
                    System.out.print(counter2+" ");
                    counter2--;
                }
                cst++;
            }
            System.out.println();
            row_6++;
            nst_6+=2;
            nsp_6--;
        }
        System.out.println("29th pattern for input:"+n);
        int row_7 = 1;
        int nst_7 = 1;
        int nsp_7=n-1;

        while (row_7<=n) {
            //spaces
            int csp = 0;
            while (csp<nsp_7) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            int counter2 =row_7;
            while (cst<nst_7) {
                if(cst==0 || cst==nst_7-1){
                    System.out.print(counter2+" ");
                }else{
                    System.out.print("0 ");
                }
                cst++;
            }
            System.out.println();
            row_7++;
            nst_7+=2;
            nsp_7--;
        }
        System.out.println("21st pattern");
        int nst_8=1;
        int row_8 = 1;
        int nsp = 2*n-3;
        while (row_8<=n) {
            //1st area
            int cst = 0;
            while (cst<nst_8) {
                System.out.print("* ");
                cst++;
            }

            //space area
            int csp=0;
            while (csp<nsp ) {
                System.out.print("  ");
                csp++;
            }

            //3rd area
            int cst1=0;
            if(row_8 ==n)
                cst1=1;
            while (cst1<nst_8) {
                System.out.print("* ");
                cst1++;
            }
            nst_8++;
            row_8++;
            nsp-=2;
            System.out.println(" ");
        }


         System.out.println("22st pattern");
        //prtactice- 22

        int row_9 = 1;
        int nst_9 = n;
        while (row_9<=n) {
            //1st star
            int cst =0;
            while (cst<nst_9) {
                System.out.print("* ");
                cst++;
            }
            //space
            int csp=0;
            while (csp<2*row_9-3) {
                System.out.print("- ");
                csp++;
            }
            //2nd star
            int cst_1 = 0;
            if(row_9==1)
                cst_1=1;
            while (cst_1<nst_9) {
                System.out.print("* ");
                cst_1++;
            }
            System.out.println();
            //next line
            nst_9--;
            row_9++;
        }

        
    }
}
