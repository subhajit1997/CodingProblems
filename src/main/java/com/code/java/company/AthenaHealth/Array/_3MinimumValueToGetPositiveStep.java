package com.code.java.company.AthenaHealth.Array;

/**
 * https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/
 */
public class _3MinimumValueToGetPositiveStep {
 public static void main(String[] args) {
    System.out.println(findMinValue(new int[]{-3,2,-3,4,2}));
 }   
 public static int findMinValue(int[] nums){
    int min = 0;
    int sum = 0;
    for(int num:nums){
        sum+=num;
        min = Math.min(min, sum);
    }
    return 1-min;
 }
}
