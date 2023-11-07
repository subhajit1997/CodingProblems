package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

import java.util.Arrays;

/**
 *learn:https://takeuforward.org/data-structure/last-occurrence-in-a-sorted-array/
 * practice: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 *
 *
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example
 */
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange( new int[]{5,7,7,8,8,10},8)));
        System.out.println(Arrays.toString(searchRangeOptimised( new int[]{5,7,7,8,8,10},8)));
    }

    //using binary search
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int floor = findLow(n,target,nums);
        int ceiling = findHigh(n,target,nums);
        return new int[]{floor,ceiling};
    }
    public static int findHigh(int n, int target, int[] nums){
        int left = 0, right = n - 1;
        int last = -1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
    public static int findLow(int n, int target, int[] nums){
        int left = 0, right = n - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    //using two pointers approach
    public static int[] searchRangeOptimised(int[] nums, int target) {
        int left =0, right = nums.length-1;
        int first =-1, last =-1;

        while(left<=right){
            int mid = (left + right ) / 2;
            if(nums[mid]==target){
                first = mid;
                last = mid;
                while(first>0 && nums[first-1]==target)
                    first--;
                while(last<nums.length-1 && nums[last+1]==target)
                    last++;
                break;
            }else if(nums[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }
        return new int[]{first,last};
    }
}
