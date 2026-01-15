package com.code.java.course.codingblocks.Lecture2;

public class _18Nov {
    public static void main(String[] args) {
        //print n times
        int n =5;
        int i_1=0; //declaration
        while (i_1<=n) { //condition
            System.out.println("hello");
            i_1=i_1+1; //change
        }

        //print increasing
        int n1 = 5;
        int i1=1;
        while (i1<=n1) {
            System.out.println(i1);
            i1=i1+1;
        }

        //sum of number
        int n2= 10;
        int sum =0;
        int i2=1;
        while (i2<=n2) { 
            sum = sum + i2;
            i2 = i2 + 1;

        }
        System.out.println(sum); 

        System.out.println("multiples Of 3");
        //multiples Of 3 till 100 like 3,6,9,.12,,,,..n
        int n_3 =100;
        int i_3 = 1;
        while (i_3<=n_3) {
            i_3=i_3+1;
            if(i_3%3==0){
                System.out.println(i_3);
            }
        }

        //Star pattern 1
        /*
        *       * * * * * 
                * * * * * 
                * * * * * 
                * * * * * 
                * * * * * 
         * 
         */
        int n_4 = 5;
        int nst =n_4; //noOfStar
        int row_4=1;
        while (row_4<=n) {
            int cst=0; //countOfStar
            while (cst<nst) {
                System.out.print("* ");
                cst++;
            }
            row_4++;
            System.out.println();
        }
  
        //Star pattern 2
        /*
        *       * 
                * *
                * * *  
                * * * *
                * * * * * 
         * 
         */
        int n_5=5;
        int row_5 =1;
        int nst_5=1; //no of star
        while (row_5<=n_5) {
            int cst_5 = 0; //count of star printed
            while (cst_5<nst_5) {
                System.out.print("* ");
                cst_5++;
            }
            System.out.println();
            nst_5++;
            row_5++;
        }
        //Star pattern 3
        /*
            * * * * * 
            * * * * 
            * * * 
            * * 
            * 
         * 
         */
        int n_6 = 5;
        int nst_6 = n_6;
        int row_6 = 1;
        while (row_6<=n_6) {
            int cst = 0;
            while (cst<nst_6) {
                System.out.print("* ");
                cst++;
            }
            nst_6--;
            row_6++;
            System.out.println();
        }
        //Star pattern 5
        /*
            * * * * * 
              * * * * 
                * * * 
                  * * 
                    * 
         * 
         */
        int n_7 = 5;
        int nst_7 = n_7;
        int row_7 = 1;
        int nsp = 0;
        while (row_7<=n_7) {
            //space 
            int csp = 0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;
            }

            int cst = 0;
            while (cst<nst_7) {
                System.out.print("* ");
                cst++;
            }
            nst_7--;
            row_7++;
            nsp++;
            System.out.println();
        }
        System.out.println("6th pattern");
        /*
            * * * * * 
                * * * * 
                    * * * 
                        * * 
                            * 
         * 
         */
        int n_8 = 5;
        int nst_8 = n_8;
        int row_8 = 1;
        int nsp_8 = 0;
        while (row_8<=n_8) {
            //space 
            int csp = 0;
            while (csp<nsp_8) {
                System.out.print("  ");
                csp++;
            }

            int cst = 0;
            while (cst<nst_8) {
                System.out.print("* ");
                cst++;
            }
            nst_8--;
            row_8++;
            nsp_8=nsp_8+2;
            System.out.println();
        }
        // 4,6,9,10


        System.out.println("4th pattern");
        int n_9 = 5;
        int row_9 = 1;
        int nst_9 = 1;
        int nsp_9=n_9;
        while (row_9<=n_9) {
            int csp = 0;
            while (csp<nsp_9) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_9) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row_9++;
            nst_9++;
            nsp_9--;
        }

        System.out.println("9th pattern");
        int n_10 = 5;
        int row_10 = 1;
        int nst_10 = 1;
        int nsp_10=n_10-1;
        while (row_10<=n_10) {
            int csp = 0;
            while (csp<nsp_10) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_10) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row_10++;
            nst_10+=2;
            nsp_10--;
        }

        System.out.println("11th pattern");
        int n_11 = 5;
        int row_11 = 1;
        int nst_11 = 9;
         int nsp_11=0;
        while (row_11<=n_11) {
            int csp = 0;
            while (csp<nsp_11) {
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while (cst<nst_11) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row_11++;
            nst_11-=2;
            nsp_11++;
        }



    }
}
