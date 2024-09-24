package com.code.java.course.striver.A2ZDSA.Step8_BitManipulation.Step8_2;

import java.util.ArrayList;
import java.util.List;

/**<IMPORTANT>
 *practice: https://leetcode.com/problems/subsets/description/
 *
 * Given an integer array nums of unique elements, return all possible
 * subsets
 *  (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */
public class _3PowerSet {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    //Iterative Approach
    // Time complexity : O(2^N*N) - 2^N for outer loop & N for inner loop
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output= new ArrayList<>();
        int n = nums.length;
        List<Integer> val = new ArrayList<>();
        output.add(val);
        // we will check for 2^n-1 if nums.length = 3 we will check for
        // 2^3-1 = 7
        // which is nothing but (1<<n)
        for(int i=0;i<(1<<n);i++){
            val = new ArrayList<>();
            for(int j=0;j<n;j++){
                // main part to check if that particular value if 1
                if((i & (1<< j))!=0){
                    val.add(nums[j]);
                }
            }
            if(val.size()>0){
                output.add(val);
            }
        }
        return output;
    }

    //There is better optimised approach in recursion part
}
