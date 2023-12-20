package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 *learn:https://takeuforward.org/data-structure/minimum-in-rotated-sorted-array/
 * practice:https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *
 * 153. Find Minimum in Rotated Sorted Array
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 *
 */
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
    }

    //using binary search for optimised search, also checking nums[low]<=nums[high] as we can directly see if full array
    // is sorted
    public static int findMin(int[] nums) {
        int n = nums.length;
        int low= 0;
        int high = n-1;
        int min =Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;

            if(nums[low]<=nums[high]){
                min = Math.min(min,nums[low]);
                break;
            }

            if(nums[low]<=nums[mid]){
                min = Math.min(nums[low],min);
                low = mid+1;
            }else{
                min = Math.min(nums[mid],min);
                high = mid-1;
            }
        }
        return min;
    }


}
