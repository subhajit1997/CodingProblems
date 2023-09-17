package com.code.java.course.udmey.dsa_masterclass.section5;

/***
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5866966#overview
 *
 * Remove Duplicates from Sorted Array - LeetCode 26
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example:
 *
 * Input: nums = [1, 1, 2]
 * Output: 2
 */

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,3,4,4,4,4,4,5,999}));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length==0)
            return 0;

        int noduplicateNum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    break;
                }else {
                    noduplicateNum++;
                    break;
                }
            }
        }
        return noduplicateNum+1;
    }
}
