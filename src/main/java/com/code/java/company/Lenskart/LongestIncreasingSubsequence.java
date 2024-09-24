package com.code.java.company.Lenskart;

import java.util.Arrays;

/**
 * learn:https://takeuforward.org/data-structure/longest-increasing-subsequence-dp-41/
 * practice:https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class LongestIncreasingSubsequence {
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
        int len = 0+ function(index+1,prev,arr,n); //not take
        if(prev==-1 || arr[index]>arr[prev]){
            len = Math.max(len,1+function(index+1,index,arr,n)); //take
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

    //another solution using binary search +DP
    private static int lowerBound(int[] a, int low, int high, int element)
    {
        while (low < high)
        {
            int middle = low + (high - low) / 2;
            if (element > a[middle])
            {
                low = middle + 1;
            } else
            {
                high = middle;
            }
        }

        return low;
    }
    public static int longestIncreasingSubsequence(int arr[])
    {
        int n = arr.length;

        // dp[i] represents i+1'th length LIS ending at minimum integer dp[i]
        int dp[] = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++)
        {
			/*
			    Since dp array stores elements in the sorted order therefore
			    we can use binary search to find the correct position for
			    arr[i] to be placed.
			    And elements are present in the dp array from 0 to ans-1 position
			    So we will be doing the binary search in this range.
			*/
            int position = lowerBound(dp, 0, ans, arr[i]);
            dp[position] = arr[i];

            if (position == ans)
            {
                ans++;
            }
        }

        return ans;
    }
}
