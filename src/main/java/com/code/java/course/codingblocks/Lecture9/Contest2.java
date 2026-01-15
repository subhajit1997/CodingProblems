package com.code.java.course.codingblocks.Lecture9;

import static org.junit.Assert.fail;

import java.util.Scanner;

public class Contest2 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        int n = 2635;
        int odd=0;
        int even=0;
        int position=1;
        while (n>0) {
            int digit = n%10;
            if(position%2==0)
                even+=digit;
            else
                odd+=digit;
            n=n/10;
            position++;
        }
        System.out.println(odd);
        System.out.println(even);
        
        //2
    //    count digits
        int num = 5433231;
        int digit = 3;
        int count=0;
        while (num>0) {
            int temp_digit = num%10;
            if(temp_digit==digit)
                count++;
            num=num/10;
        }
        System.out.println(count);

        //print reverse
        int num3 = 123456789;
        int reverse =0;
        while (num3>0) {
            int digit1 = num3%10;
            reverse = reverse*10+digit1;
            num3=num3/10;
        }
        System.out.println(reverse);
        

        /*
        4) Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
Input Format
Constraints
0 < N <= 1000000000
        */
        int input_binary = 101010;
        int output_decimal=0;
        int count1=0;
        while (input_binary!=0) {
            int digit1 = input_binary%10;
            output_decimal += digit1*Math.pow(2, count1++);
            input_binary=input_binary/10;
        }
        System.out.println(output_decimal);

        /*
        5)LCM
        Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.


Input Format
Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000


Output Format
Sample Input
4 
6
Sample Output
12
        */
        int n1 = 6;
        int n2 = 4;
        int n1_1=n1;
        int n2_1=n2;
        while (n1%n2!=0) {
            int gcd = n1%n2;
            n1=n2;
            n2 = gcd;
        }
        int lcm = (n1_1*n2_1)/n2;
        System.out.println(lcm);

        /*
            Nth Fibonacci (Hard)
            Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
        */
        int inputFib=10;
        int a=0;
        int b=1;
       for(int i=2;i<=inputFib;i++){
            int c= a+b;
            a=b;
            b=c;
        }
        System.out.println(b);

        /*
        Convert farenthesis to celsius
        */
       int min=0;
       int max=100;
       int step = 20;
        while (min<=max) {
            int c = (5*(min-32)/9);
            System.out.println(min+" "+c);
            min+=step;
        }
        /*
        Inverse of number
        1234
        4321
        */
       int input_reverse=32145;
        int result=0;
        int place=1;
        while (input_reverse>0) {
            int digit1 = input_reverse%10;
            result = result + place*(int)Math.pow(10,digit1-1);
            input_reverse = input_reverse/10;
            place++;
        }
        System.out.println(result);

        //check prime
        int input_prime = 3;
        boolean check_prime=true;
        for(int i=2;i<input_prime;i++){
            if(input_prime%i==0){
                check_prime=false;
                break;
            }
        }
        if(check_prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        //gcd
        int n1_gcd = 16;
        int n2_gcd = 24;
        while (n1_gcd%n2_gcd!=0) {
            int gcd = n1_gcd%n2_gcd;
            n1_gcd=n2_gcd;
            n2_gcd = gcd;
        }
        System.out.println(n2_gcd);

        //Chewbacca and Number

        //Replace Them All

        //Print Series
        int N1 = 2;
        int N2 = 5;

        int printed = 0;
        int nSeries = 1;
        while (printed < N1) {
            int term = 3 * nSeries + 2;
            if (term % N2 != 0) {
                System.out.println(term);
                printed++;
            }
            nSeries++;
        }
        //Simple Input

        //Print Armstrong Numbers
        int N1_arm = 400;
        int N2_arm = 1000;
        printArmstrongNumbers(N1_arm, N2_arm);
        
        
        //Conversion(Any To Any)
        int sb =sc.nextInt();
        int db =sc.nextInt();
        int sn =sc.nextInt();
        int decimal = anyToDecimal(sn,sb);
        System.out.println(decimalToAny(decimal, db));

    }
 public static void printArmstrongNumbers(int N1, int N2) {
        for (int num = N1; num <= N2; num++) {
            int temp = num;
            int digits = 0;
            int sum = 0;

            // Count digits
            int t = temp;
            while (t > 0) {
                digits++;
                t /= 10;
            }

            t = temp;
            while (t > 0) {
                int d = t % 10;
                sum += Math.pow(d, digits);
                t /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
        public static int anyToDecimal(int num,int src){
        int decimal=0;
        int mul =1;
        while (num!=0) {
            int r = num%10;
            decimal = decimal + r*mul;
            mul = mul*src;
            num = num/10;
        }
        return decimal;
    }
    public static int decimalToAny(int num,int dest){
        int result =0;
        int mul =1;
        while (num!=0) {
            int digit = num%dest;
            result = result + digit*mul;
            mul = mul*10;
            num = num/dest;
        }
        return result;
    }
}
