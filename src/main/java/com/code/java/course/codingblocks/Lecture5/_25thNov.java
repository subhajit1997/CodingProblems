package com.code.java.course.codingblocks.Lecture5;

public class _25thNov {
    public static void main(String[] args) {
        //for-loop
        // int n =10;
        // for(int i=0;i<=n;i++){
        //     System.out.print(i+" ");
        // }
        //fibonacci series - 
        /*
            0 ,1 ,(0+1)=1  ,(1+1)=2  ,(1+2)=3  ,(2+3)=5 ,(3+5)=8 ,13, 21,...
        */
       System.out.println("fibonacci series");
       int a=0;
       int b=1;
       for(int i=3;i<=5;i++){
            int c = a+b;
            a=b;
            b=c;
        }
       System.out.println(b);

       System.out.println("prime number check: ");
       int n = 81;
       boolean prime = true;
       for(int i=2;i<n;i++){
        if(n%i==0){
            prime = false;
            break;
        }
       }
       if(prime){
        System.out.println("prime");
       }else{
        System.out.println("not prime");
       }
       System.out.println("sim of all digits");
       int n1= 31542;
       int sum = 0;
       while (n1!=0) {
            int res = n1%10;
            sum  = sum + res;
            n1 = n1/10;
       }
       System.out.println(sum);


       System.out.println("Q) reverse a mnumber");
       int val = 12345;
       int reverse=0;
       while (val!=0) {
        int digit = val%10;
        reverse = reverse*10+digit;
        val = val/10;
       }
       System.out.println(reverse);

       System.out.println("Q) GCD/HCF : ");
       //36 & 60= 
       /*         1       1       2     0
        36 /60 = 60/36 = 24/36 = 12/24 (GCD 12)
       */
       int input1 =36;
       int input2= 60;
        int gcd= 1;
       for(int i=1;i<input1 && i<input2;i++){
        if(input1%i==0 && input2%i==0){
            gcd=i;
        }
       }
       System.out.println(gcd);

       int divident = 36;
       int divisor = 60;
       while (divident%divisor!=0) { //no need to check which is greater or small, as if 36/60 will be reversed in next iteration
        int r = divident%divisor;
        divident = divisor;
        divisor = r;
       }
       System.out.println(divisor);

       //LCM*GCD = a*B
    }
}
