package com.code.java.course.gfg.Week2.arrays.problems;

public class _16_KadanesAlgorithm {
    /**
     * 
Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 1.1MPoints: 4Average Time: 20m
Given an integer array arr[]. You need to find the maximum sum of a subarray.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
     */
    public static void main(String[] args) {
        
    }
    // optimised , time : O(N) space : O(1)
    // using kedanes algo find endIndex & startIndex of max subarray sum
    int maxSubarraySum(int[] arr) {
        int endIndex =0;
        int currentMax = arr[0];
        int globalMax = arr[0];
        int n = arr.length;
        //find end index
        for(int i=1;i<n;i++){
            currentMax = Math.max(arr[i], currentMax +arr[i] );
            if(currentMax>globalMax){
                globalMax = currentMax;
                endIndex = i;
            }
        }
        //find start index
        int startIndex = endIndex;
        while(startIndex>=0){
            globalMax = globalMax - arr[startIndex];
            if(globalMax ==0)
                break;
            startIndex--;
        }
        int maxSum=0;
        for(int i=startIndex;i<=endIndex;i++){
            maxSum+=arr[i];
        }
        return maxSum;
    }
}
