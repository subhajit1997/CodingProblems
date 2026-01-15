package com.code.java.company.AthenaHealth.Array;
/**
 * https://leetcode.com/problems/first-missing-positive/description/
 */
import java.util.Arrays;

public class _8FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1,2,0}));
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }
    //time :O(nlogN)
    public static int findMissing(int[] nums){
        Arrays.sort(nums);
        int target=1;
        for(int n:nums){
            if(n>0&& n==target)
                target++;
            else if(n>target)
                return target;
        }
        return target;
    }
    //optimised O(N)
    //Positioning Elements at correct index
        private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Place each positive integer i at index i-1 if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all positive integers from 1 to n are present, return n + 1
        return n + 1;
    }

}
