package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 * learn: https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/
 * practice:https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * 33. Search in Rotated Sorted Array
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */
public class SearchInRotatedSortedArrayI {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
    }

    //optimised using binary search O(logN)
    public static int search(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)
                return mid;
            // if left part is sorted
            if(nums[low]<= nums[mid]){
                if(nums[low]<=target && target<=nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }else{
                // if right part is sorted
                if(nums[mid]<=target && target<=nums[high])
                    low = mid +1;
                else
                    high = mid -1;
            }
        }
        return -1;
    }
}
