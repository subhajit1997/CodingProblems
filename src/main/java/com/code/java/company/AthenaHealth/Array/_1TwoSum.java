package com.code.java.company.AthenaHealth.Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * * **Two Sum**
  Given an array of integers and a target, return indices of the two numbers that add up to the target. Solve in linear time using a hash map
 */
public class _1TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,6,5,8,11}, 14)));
        System.out.println(Arrays.toString(twoSumHashing(new int[]{2,6,5,8,11}, 14)));
    }

    //Time: O(N^2)
    public static int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    //Time : O(N)
    public static int[] twoSumHashing(int[] nums,int target){
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target -nums[i];
            if(mpp.containsKey(remaining)){
                return new int[]{mpp.get(remaining),i};
            }
            mpp.put(nums[i], i);
        }
        return null;
    }

}
