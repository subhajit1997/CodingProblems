package com.code.java.course.gfg.Week2.arrays.problems;

public class _15_TrappingRainWater {
    /*
     * Trapping Rain Water
Difficulty: HardAccuracy: 33.14%Submissions: 465K+Points: 8Average Time: 20m
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

Examples:

Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.
     */
    public static void main(String[] args) {
        
    }
    // easy - Time - O(N^2) Space - O(1)
    //using two loops to find the trapped water at each index by finding the left max and right max
    public int maxWater(int arr[]) {
        int trapped =0;
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            int leftMax = arr[i];
            for(int j=0;j<i;j++){
                leftMax = Math.max(leftMax,arr[j]);
            }
            int rightMax = arr[i];
            for(int j=i+1;j<n;j++){
                rightMax = Math.max(rightMax,arr[j]);
            }
            trapped  +=Math.min(leftMax,rightMax) - arr[i];
        }
        return trapped;
    }

    //optimised using precalculated left and right max 
    // time : O(N) space : O(N)
    public int maxWaterOptimised(int arr[]) {
        int trapped =0;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        
        for(int i=0;i<n;i++){
            trapped +=Math.min(left[i],right[i])-arr[i];
        }
        return trapped;
    }
    
}
