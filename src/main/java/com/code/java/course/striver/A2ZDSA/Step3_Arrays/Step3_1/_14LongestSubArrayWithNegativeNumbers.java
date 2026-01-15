package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/
 */
public class _14LongestSubArrayWithNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(getLongestSubarray(new int[]{-1,1,1},1));
        System.out.println(getLongestSubarrayHasing(new int[]{-1,1,1},1));
    }

    //Tiem : O(N^2)
    public static int getLongestSubarray(int[] a,int k){
        int n = a.length;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(sum==k)
                    maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }

    //Time : O(N*logN), space : O(N)
    public static int getLongestSubarrayHasing(int[] a,int k){
        int n=a.length;
        Map<Integer,Integer> preSum = new HashMap<>();
        int sum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            sum +=a[i];
            if(sum == k)
                maxSum= Math.max(maxSum, i+1);
            
            int rem =k-sum;
            if(preSum.containsKey(rem)){
                int len = i - preSum.get(rem);
                maxSum = Math.max(maxSum, len);
            }
            if(!preSum.containsKey(sum)){
                preSum.put(sum, i);
            }
            //preSum.putIfAbsent(sum, i);
        }
        return maxSum;
    }
}
