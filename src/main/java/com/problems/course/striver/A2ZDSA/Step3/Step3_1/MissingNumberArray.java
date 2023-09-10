package com.problems.course.striver.A2ZDSA.Step3.Step3_1;

/**
 * practice: https://leetcode.com/problems/missing-number/solutions/
 *
 * implement a solution using only O(1) extra space complexity and O(n) runtime complexity
 */
public class MissingNumberArray {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i:nums){
            sum +=i;
        }
        return ((n*(n+1)/2)-sum);
    }
}
