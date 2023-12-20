package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 * learn: https://takeuforward.org/arrays/search-element-in-rotated-sorted-array-ii/
 * practice:https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
 *
 81. Search in Rotated Sorted Array II
 There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

 Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

 Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

 You must decrease the overall operation steps as much as possible.



 Example 1:

 Input: nums = [2,5,6,0,0,1,2], target = 0
 Output: true
 Example 2:

 Input: nums = [2,5,6,0,0,1,2], target = 3
 Output: false
 */
public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
    }

    //optimised using binary search O(logN) & may contain duplicates
    public static boolean search(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(nums[mid]==target)
                return true;

            //edge case to handle duplicates
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid])
                    high = mid-1;
                else
                    low = mid +1;
            }else{
                if(nums[mid]<=target && target<=nums[high])
                    low = mid +1;
                else
                    high = mid-1;
            }
        }
        return false;
    }
}
