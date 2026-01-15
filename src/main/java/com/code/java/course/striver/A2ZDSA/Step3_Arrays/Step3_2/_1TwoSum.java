package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_2;

import java.util.Arrays;
import java.util.HashMap;

/**
 *  <IMPORTANT>
 *
 *      learn:https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
 *      practice: https://leetcode.com/problems/two-sum/description/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class _1TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumHashMap(new int[]{2, 7, 11, 15}, 9)));
    }
    //O(n^2) Brute Force approach
    public static int[] twoSum(int[] nums, int target) {
        int[] val = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    val[0]=i;
                    val[1]=j;
                    return val;
                }
            }
        }
        return val;
    }
    //O(N) Best is Hash Map
    public static int[] twoSumHashMap(int[] nums, int target) {
        int[] val = new int[2];
        val[0]=val[1]=-1;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num =nums[i];
            int remaining = target - num;
            if(mapp.containsKey(remaining)){
                val[0]= mapp.get(remaining);
                val[1]=i;
                return val;
            }
            mapp.put(nums[i],i);
        }
        return val;
    }

    // using two pointer 
    public int[] twoSumOptimised(int[] nums, int target) {
        int length = nums.length;
        int start = 0, end = length - 1;

        int[] output = new int[2];
        output[0] = -1;
        output[1] = -1;
        while (start < length - 1) {

            if (nums[start] + nums[end] == target) {
                output[0] = start;
                output[1] = end;
                return output;
            } else
                --end;
            if (end == start) {
                end = length - 1;
                ++start;
            }
        }
        return output;
    }



}
