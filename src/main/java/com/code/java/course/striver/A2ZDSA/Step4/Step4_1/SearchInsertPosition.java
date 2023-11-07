package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 * learn:https://takeuforward.org/arrays/search-insert-position/
 * practice:https://leetcode.com/problems/search-insert-position/
 *
 * 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1 ,3,5,6},5));
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
