package com.code.java.course.gfg.Week2.recursion.problems;

public class SumofDigitsofaNumber {
    /**
     * You are given a number n. You need to find the sum of digits of n.

Example 1:

Input:
n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.
Example 2:

Input:
n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45.
Your Task:
You don't need to read input or print anything. Your task is to complete the function sumOfDigits() that takes n as parameter and returns the sum of digits of n.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn) (Recursive).

Constraints:
1 <= n <= 107
     */
    public static void main(String[] args) {
        System.out.println(sumOfDigits(999));
    }
    public static int sumOfDigits(int n)
    {
        if(n==0)
            return 0;
        return sumOfDigits(n/10)+n%10;
    
    }
}
