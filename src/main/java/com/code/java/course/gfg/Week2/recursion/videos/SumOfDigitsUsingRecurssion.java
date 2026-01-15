package com.code.java.course.gfg.Week2.recursion.videos;

public class SumOfDigitsUsingRecurssion {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
    private static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigits(n/10)+n%10;
    }
    private static int sumOfDigitsIterative(int n){
        int res = 0;
        while(n>=0){
            res = res+n%10;
            n=n/10;
        }
        return res;
    }

}
