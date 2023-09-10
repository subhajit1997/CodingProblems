package com.problems.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.Arrays;

/**
 * learn:https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/
 * practice:https://leetcode.com/problems/sort-colors/
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 */
public class SortColor0s1s2s {
    public static void main(String[] args) {
        int[] val = new int[]{2,0,2,1,1,0};
        sortColors(val);
        System.out.println(Arrays.toString(val));
        int[] val1 = new int[]{2,0,2,1,1,0};
        sortColorsBestApproach(val1);
        System.out.println(Arrays.toString(val1));
    }
    //Brute Force
    public static void sortColors(int[] nums) {
        int a=0,b=0;
        for (int num : nums) {
            if (num == 0)
                a++;
            else if (num == 1)
                b++;
        }
        for(int i=0;i<a;i++)
            nums[i]=0;
        for(int i=a;i<b+a;i++)
            nums[i]=1;
        for(int i=b+a;i<nums.length;i++)
            nums[i]=2;
    }
    //Dutch National flag algorithm
    //O(N)
    public static void sortColorsBestApproach(int[] nums) {
        int low=0,mid=0,high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}
