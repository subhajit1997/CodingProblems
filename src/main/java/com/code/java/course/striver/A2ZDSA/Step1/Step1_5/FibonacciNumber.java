package com.code.java.course.striver.A2ZDSA.Step1.Step1_5;

/**
 * https://leetcode.com/problems/fibonacci-number/
 *
 * 509. Fibonacci Number
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return (fib(n-1)+fib(n-2));
    }
}
