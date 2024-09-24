package com.code.java.course.striver.Blind_75_Sheet.Day1_Arrays;

/**
 * https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
 * https://leetcode.com/problems/maximum-subarray/
 */
public class _5KadaneAlgorithmMaximumSubarraySum {
    public static void main(String[] args) {

    }

    // approach-1 using two loops
    //time - O(N^2)
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    //aproach- 2
    //time - O(N)
    public int maxSubArrayOptimised(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(sum>max){
                max= sum;
            }
            if(sum<0)
                sum =0;
        }
        return max;
    }
}
