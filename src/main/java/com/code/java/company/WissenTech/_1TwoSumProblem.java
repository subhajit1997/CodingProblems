package com.code.java.company.WissenTech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1TwoSumProblem {
    public static void main(String[] args) {


    }

    // approach 1- brute force
    //Time- O(N^2)
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    //approach 2- Better Approach using hashing
    //Time- O(N),
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(mpp.containsKey(moreNeeded)){
                return new int[]{mpp.get(moreNeeded),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }

    //approach 3 - Best approach two pointers
    public int[] twoSumOptimised(int[] arr, int target) {
        int n = arr.length;
        int[][] valueIndexPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            valueIndexPairs[i][0] = arr[i]; // value
            valueIndexPairs[i][1] = i;      // original index
        }

        // Sort the array based on the values
        Arrays.sort(valueIndexPairs, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = valueIndexPairs[left][0] + valueIndexPairs[right][0];
            if (sum == target) {
                // Return the original indices of the two numbers
                return new int[]{valueIndexPairs[left][1], valueIndexPairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};  // Return -1, -1 if no such pair is found
    }
}
