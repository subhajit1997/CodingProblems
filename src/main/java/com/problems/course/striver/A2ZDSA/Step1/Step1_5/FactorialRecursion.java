package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(7).toString());
    }

    public static List<Long> factorialNumbers(long n) {

        List<Long> data = new ArrayList<Long>();
        long val=0;
        long incr=1;
        while(val<=n){
            val = findFactorial(incr++);
            if(val <=n)
                data.add(val);
        }
        return data;
    }
    public static long findFactorial(long n){
        if(n>=1){
            return n*findFactorial(n-1);
        }else{
            return 1;
        }
    }
}
