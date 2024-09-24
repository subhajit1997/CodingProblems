package com.code.java.course.striver.A2ZDSA.Step8_BitManipulation.Step8_1;

/**
 * practice: https://leetcode.com/problems/divide-two-integers/
 */
public class _8DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(10,3));
    }
    public static int divide(int dividend, int divisor) {
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        // Handle division by zero
        if (divisor == 0) {
            return dividend > 0 ? INT_MAX : INT_MIN;
        }

        // Handle overflow cases
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        // Determine the sign of the quotient
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Take the absolute values
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);

        long quotient = 0;
        while (longDividend >= longDivisor) {
            long temp = longDivisor, multiple = 1;
            while (longDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            longDividend -= temp;
            quotient += multiple;
        }

        return sign * (int) quotient;
    }

}
