package com.problems.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.HashMap;
import java.util.Map;

/**<IMPORTANT>
 * learn:https://takeuforward.org/arrays/count-subarray-sum-equals-k/
 * practice:https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class CountSubArrayGivenSum {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
        System.out.println(subarraySumOptimised(new int[]{1,1,1},2));
        System.out.println(subarraySumOptimal(new int[]{1,1,1},2));

    }
    // Brute force
    //O(N^3)
    public static int subarraySum(int[] nums, int K) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++)
                    sum+=nums[k];
                if(sum==K)
                    count++;
            }
        }
        return count;
    }

    //Optimised Brute force
    // O(N^2)
    public static int subarraySumOptimised(int[] nums, int K) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==K)
                    count++;

            }
        }
        return count;
    }

    // Optimal Approach
    // Prefix Sum approach
    // O(NlogN)
    public static int subarraySumOptimal(int[] arr, int k) {
        int n = arr.length; // size of the given array.
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int j : arr) {
            // add current element to prefix Sum:
            preSum += j;

            // Calculate x-k:
            int remove = preSum - k;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}
