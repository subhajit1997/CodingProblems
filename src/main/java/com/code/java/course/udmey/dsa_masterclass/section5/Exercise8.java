package com.code.java.course.udmey.dsa_masterclass.section5;

/**
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5867060#overview
 *
 * Two Sum - LeetCode 1
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Examples
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 *
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class Exercise8 {
    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        int[] output = twoSum(input,9);
        System.out.println(input[output[0]]+input[output[1]]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
