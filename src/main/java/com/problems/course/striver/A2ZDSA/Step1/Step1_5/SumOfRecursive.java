package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

public class SumOfRecursive {
    public static void main(String[] args) {
        System.out.println(sumFirstN(5));
        System.out.println(sumFirstNFormula(5));
    }

    //Using recursion - O(n)
    public static int sumFirstN(int n) {
        if(n==0){
            return 0;
        }else{
            return n+sumFirstN(n-1);
        }
    }
    //Using formula - O(1)
    public static int sumFirstNFormula(int n) {
        return n*(n+1)/2;
    }

}
