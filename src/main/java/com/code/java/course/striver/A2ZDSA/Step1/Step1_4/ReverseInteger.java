package com.code.java.course.striver.A2ZDSA.Step1.Step1_4;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 *
 *
 * code Explain:https://leetcode.com/problems/reverse-integer/solutions/3136892/java-beat-100-well-explained-code/
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public  static int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum = finalNum+lastDig;
            finalNum = finalNum*10;
            x=x/10;
        }
        finalNum = finalNum/10;
        if(finalNum>Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}
