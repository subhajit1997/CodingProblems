package com.problems.course.striver.A2ZDSA.Step1.Step1_4;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
    public static String isPrime(int num) {
        if(num<=1){
            return "NO";
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return "NO";
            }
        }
        return "YES";
    }
}
