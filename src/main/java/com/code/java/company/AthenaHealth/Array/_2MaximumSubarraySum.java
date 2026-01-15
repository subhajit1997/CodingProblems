package com.code.java.company.AthenaHealth.Array;
/*
 * https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
 */
public class _2MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSumKadenceAlgo(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    //Time: O(N^2)
    public static int maxSubarraySum(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i+1;j<n;j++){
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    //Time :O(N)
    public static int maxSumKadenceAlgo(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; 
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
