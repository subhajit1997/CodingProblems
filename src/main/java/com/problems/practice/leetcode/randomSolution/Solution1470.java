package com.problems.practice.leetcode.randomSolution;

/*
1470. Shuffle the Array
https://leetcode.com/problems/shuffle-the-array/

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int a=0;
        for(int i=0;i<n;i++)
        {
            arr[a]=nums[i];
            a=a+2;
        }
        a=1;
        for(int j=n;j<nums.length;j++)
        {
            arr[a]=nums[j];
            a=a+2;
        }
        return arr;
    }
}