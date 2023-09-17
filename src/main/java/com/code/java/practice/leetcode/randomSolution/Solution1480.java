package com.code.java.practice.leetcode.randomSolution;

/*
1480. Running Sum of 1d Array
https://leetcode.com/problems/running-sum-of-1d-array/
 */

class Solution1480 {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int count=0;
        for(int i: nums)
        {
            sum=sum+i;
            nums[count]=sum;
            count++;
        }
        return nums;
    }
}