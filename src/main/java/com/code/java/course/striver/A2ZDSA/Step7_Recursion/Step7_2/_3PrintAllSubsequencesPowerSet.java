package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_2;

import java.util.ArrayList;
import java.util.List;

/**
 * <IMPORTANT>
 * learn:https://takeuforward.org/data-structure/power-set-print-all-the-possible-subsequences-of-the-string/
 * prcatice: https://leetcode.com/problems/subsets/description/
 */
public class _3PrintAllSubsequencesPowerSet {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
       System.out.println( subsetsOptimised(new int[]{1,2,3}));
    }
    //Iterative Approach
    // Time complexity : O(2^N*N) - 2^N for outer loop & N for inner loop
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output= new ArrayList<>();
        int n = nums.length;
        List<Integer> val = new ArrayList<>();
        output.add(val);
        for(int i=0;i<(1<<n);i++){
            val = new ArrayList<>();
            for(int j=0;j<n;j++){
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

    //Recusive approach best
    public static List<List<Integer>> subsetsOptimised(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }
    public static void generateSubsets(int i, int[] nums, List<Integer> currentSubset, List<List<Integer>> result) {
        if (i == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        // Include the current element
        currentSubset.add(nums[i]);
        generateSubsets(i + 1, nums, currentSubset, result);

        // Exclude the current element (backtrack)
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(i + 1, nums, currentSubset, result);
    }

}
