package com.code.java.course.striver.A2ZDSA.Step3.Step3_3;
/**
 * learn:https://takeuforward.org/data-structure/3-sum-find-triplets-that-add-up-to-a-zero/
 * practice:https://leetcode.com/problems/3sum/submissions/
 *Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 */

import java.util.*;

public class ThreeSum_3Sum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}).toString().toString());
        System.out.println(threeSumOptimised(new int[]{-1, 0, 1, 2, -1, -4}).toString().toString());
        System.out.println(threeSumBestApproach(new int[]{-1, 0, 1, 2, -1, -4}).toString().toString());


    }
    //Brute Force
    //O(N^3Log(K)) , where k - no of tuples
    //Using multiple data structures like Set, HashMap
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> out = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                for(int k=j+1;k<n;k++){
                    if((nums[k]+nums[j]+nums[i])==0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        out.add(temp);

                    }

                }

            }

        }
        List<List<Integer>> ans = new ArrayList<>(out);
        return ans;
    }

    //Optimised Brute Force
    //O(N^2Log(k)) , where k is no of tuples
    public static List<List<Integer>> threeSumOptimised(int[] nums) {
        Set<List<Integer>> out = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> temp = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(temp.contains(third)){
                    List<Integer> val = Arrays.asList(nums[i],nums[j],third);
                    val.sort(null);
                    out.add(val);
                }
                temp.add(nums[j]);

            }
        }
        List<List<Integer>> ans = new ArrayList<>(out);
        return ans;
    }


    //Best approach
    //O(Nlog(N)) + O(N^2)
    public static List<List<Integer>> threeSumBestApproach(int[] nums) {
        List<List<Integer>> output= new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int j= i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    output.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                        j++;
                    while(j<k && nums[k]==nums[k+1])
                        k--;
                }

            }
        }
        return output;
    }
}
