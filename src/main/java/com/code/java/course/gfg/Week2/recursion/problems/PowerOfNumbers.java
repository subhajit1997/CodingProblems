package com.code.java.course.gfg.Week2.recursion.problems;

public class PowerOfNumbers {
    /*
     * Given a number n, find the value of n raised to the power of its own reverse.

        Note: The result will always fit into a 32-bit signed integer.

        Examples:

        Input: n = 2
        Output: 4
        Explanation: The reverse of 2 is 2, and 22 = 4.
        Input: n = 10
        Output: 10
        Explanation: The reverse of 10 is 1 (leading zero is discarded), and 101 = 10.
        Input: n = 3
        Output: 27
        Explanation: The reverse of 3 is 3, and 33 = 27.
        Constraints:
        1 <= n <= 10
     */
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(2));
    }
    public static int reverseExponentiation(int n) {
        int raise = n;
        if(n==10)
            raise = 1;
        return (int)Math.pow(n,raise);
    }
}
