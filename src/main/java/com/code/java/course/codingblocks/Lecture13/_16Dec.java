package com.code.java.course.codingblocks.Lecture13;

public class _16Dec {
    public static void main(String[] args) {
        long starttime= System.currentTimeMillis();
        for(int i=0;i<10000000;i++){

        }
        long endtime= System.currentTimeMillis();
        System.out.println(endtime-starttime);

        /*
            BigO-> upper bound
            Big (omega) -> lower bound
            Big(theta) -> tight bound

            O(1) -> constant
            O(N) -> linear

            n=5
            2,1

            n=20
            10,5,2,1
        */
       // 0,1,4,9,...
       //0, 1^2,2^2,3^2,..k^2 
       //k^2 = n
       //k = sqrt(n)
       //O(K) = O(sqrt(N))


      int n=4;
      for(int a=0;a<=n;a++){
        for(int b=1;b<=a*a;b++){
            for(int c =0;c<=n/2;c++){
            }
        }
      }
       /*
       
       a = 0    1   2   3   ,...   }
                                     }-> 1+2^2+3^2+4^2+...n^2 -> n(n+1)(n+4)/6 = n^3
       b = 1    4   9   16  ,....  }

       c = n/2, n/2 , n/2 ,... -> n/2

       Final -> n/2*n^3 = n^4

       
       */

      for(int a=n/2;a<=n;a++){
        for(int b=1;b<=n/2;b++){
            for(int c =1;c<=n/2;c+=2){
            }
        }
      }
      /*
      a =   n/2 .......n/2..n-times ->n/2
      b=    n/2 ........n/2..n-times -> n/2
      c=                                -> log(n)

      total = log(n)*n/2*n/2 = Log(n)*N^2

      */
       
    }
}
