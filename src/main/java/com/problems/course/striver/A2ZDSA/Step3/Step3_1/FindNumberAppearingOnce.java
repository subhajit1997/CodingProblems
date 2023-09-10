package com.problems.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * learn: https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
 * practice: https://leetcode.com/problems/single-number/submissions/
 *
 * linear runtime complexity and use only constant extra space
 */
public class FindNumberAppearingOnce {
    public static void main(String[] args) {
        System.out.println(singleNumberHahMap(new int[]{4, 1, 2, 1, 2}));;
        System.out.println(singleNumberOptimised(new int[]{4, 1, 2, 1, 2}));;

    }
    //Using hashmap
    public static int singleNumberHahMap(int[] nums) {
        int n =nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            int val = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],val+1);
        }

        for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }

    //Optimised
    public static int singleNumberOptimised(int[] nums) {
        int result =0;
        for(int i : nums){
            result ^=i;
        }
        return result;
    }
}
