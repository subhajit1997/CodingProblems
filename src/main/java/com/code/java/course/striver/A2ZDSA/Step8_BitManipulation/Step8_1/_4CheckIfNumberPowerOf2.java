package com.code.java.course.striver.A2ZDSA.Step8_BitManipulation.Step8_1;

/**practice: https://leetcode.com/problems/power-of-two/
 *
 */
public class _4CheckIfNumberPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        else
            return ((n&(n-1))==0);
    }
}
