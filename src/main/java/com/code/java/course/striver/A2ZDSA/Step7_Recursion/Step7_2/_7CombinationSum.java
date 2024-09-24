package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**learn:
 * practice:https://leetcode.com/problems/combination-sum/
 *Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 * frequency
 *  of at least one of the chosen numbers is different.
 *
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
public class _7CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7},7));
    }

    //Time complexity: O(2^T*K)
    //for pick scenario we do below format : method(index,target,array)
    //in case if we can choose distinct element we don't use same index
    //but if duplicate picking is allowed we check for same index
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        recursiveCheckCombination(0,candidates,target,result,new ArrayList<>());
        return result;
    }

    public static void recursiveCheckCombination(int i,int[] candidates,int target, List<List<Integer>> result,ArrayList<Integer> ds){
        if(i==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[i]<=target){
            ds.add(candidates[i]);
            recursiveCheckCombination(i,candidates,target-candidates[i],result,ds);
            ds.remove(ds.size()-1);
        }
        recursiveCheckCombination(i+1,candidates,target,result,ds);
    }
}
