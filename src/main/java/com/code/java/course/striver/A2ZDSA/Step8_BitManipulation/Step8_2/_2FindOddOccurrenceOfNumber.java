package com.code.java.course.striver.A2ZDSA.Step8_BitManipulation.Step8_2;

/**
 * practice: https://leetcode.com/problems/single-number/
 *
 * 136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class _2FindOddOccurrenceOfNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
    public static int singleNumber(int[] nums) {
        int result =0;
        for(int i : nums){
            result ^=i;
        }
        return result;
    }
}
