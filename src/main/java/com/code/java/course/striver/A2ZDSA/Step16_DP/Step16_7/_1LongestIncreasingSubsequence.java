package com.code.java.course.striver.A2ZDSA.Step16_DP.Step16_7;

import java.util.Arrays;

/**
 * learn:https://takeuforward.org/data-structure/longest-increasing-subsequence-dp-41/
 * practice:https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class _1LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(lengthOfLISOptimised(new int[]{10,9,2,5,3,7,101,18}));
    }
    //Brute force -> PowerSet -> store lemgth -> 2^N times
    //            -> recursion -> express everything in terms of index
    //                          -> explore all yes/no
    //                          -> take the max length

    //Recursion - Simple but time limit exceed
    public static int lengthOfLIS(int[] nums) {
        return function(0,-1,nums,nums.length);
    }
    public static int function(int index, int prev, int[] arr, int n){
        if(index==n)
            return 0;
        int len = 0+ function(index+1,prev,arr,n);
        if(prev==-1 || arr[index]>arr[prev]){
            len = Math.max(len,1+function(index+1,index,arr,n));
        }
        return len;
    }

    //Recursion optimised using memorization
    public static int lengthOfLISOptimised(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        // Initialize dp array with -1 to mark states as not calculated yet
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return function(0,-1,nums,nums.length,dp);
    }
    public static int function(int index, int prev, int[] arr, int n, int[][] dp){
        if(index==n)
            return 0;
        if( dp[index][prev + 1] != -1)
            return  dp[index][prev + 1];
        int len = 0+ function(index+1,prev,arr,n,dp);
        if(prev==-1 || arr[index]>arr[prev]){
            len = Math.max(len,1+function(index+1,index,arr,n,dp));
        }
        return dp[index][prev + 1] = len;
    }
}
