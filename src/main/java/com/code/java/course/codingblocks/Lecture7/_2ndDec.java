package com.code.java.course.codingblocks.Lecture7;

import java.util.Scanner;

public class _2ndDec {
    public static void main(String[] args) {
       /*
       Function/methods ->  block of code
            ->  Repetative tab
            ->  Execute only when its required
       */   
      System.out.println("hi");
      add();
      System.out.println("bye");

        /*  primitive stored in stack data types
            non-primitive stored in heap
            
            |        |
            |        |
            |add     |
            |a       |
            |b       |
            |20      |
            |---------
            |main    |
            |"hi"    |
            |add     |
            |"bye"   |
            __________


            stak:
                            |       |
k memory location ->        |[10]   |
                            |       |
x memory location ->        |[20]   |
                            ---------
        */

      System.out.println("hello from main");
      greet();
        Scanner sc = new Scanner(System.in);
        int src =  5;
        int dest =3;
        int num = 134;

        int decimalConcverted = anyToDecimal( num, src);
        int finalVal = decimalToAny(decimalConcverted,dest);
        System.out.println(finalVal);
    
        //armstrong num
        //1634 = 1^4+6^4+3^4+4^4 = 1634 then boolean
        int input = sc.nextInt();
        int count = noOfDigits(input);
        System.out.println(findArmstrongNum(count,input));
    }
    public static void greet(){
        System.out.println("hello"); 
        /* In case of void this method does not return at the end it just removes its 
        execution call from stack as nothing is left in the method
        */
    }
    public static void add(){
        int a =10;
        int b = 10;
        int c = a+b;
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
    public static int noOfDigits(int val){
        int count =0;
        while (val!=0) {
            val = val/10;
            count++;
        }
        return count;
    }
    public static boolean findArmstrongNum(int count,int val){
        int result = 0;
        int tempVal = val;
        while (tempVal!=0) {
            int digit = tempVal%10;
            result = result + (int)Math.pow(digit, count);
            tempVal = tempVal/10;
        }
        if(result==val)
            return true;
        return false;
    }



}
