package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_1;

/**
 * learn:https://takeuforward.org/data-structure/implement-powxn-x-raised-to-the-power-n/
 * prcatice:https://leetcode.com/problems/powx-n/description/
 *
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:
 *
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:
 *
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 *
 */
public class _2PowerOfXOnN {
    public static void main(String[] args) {
        System.out.println(myPow(2.0000,10));
    }

    //Time complexity: O(logN)
    //space -O(1)
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return power(x, n);
    }

    private static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double temp = power(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}
