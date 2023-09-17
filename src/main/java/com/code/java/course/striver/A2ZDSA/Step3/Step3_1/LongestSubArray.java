package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.HashMap;
import java.util.Map;

/**
 *  <IMPORTANT>
 *learn: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
 * practice:https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *
 */
public class LongestSubArray {
    public static void main(String[] args) {
        System.out.println(longestSubarrayWithSumK(new int[]{1,2,3 ,1, 1 ,1, 1},3));
        System.out.println(longestSubarrayWithSumKOptimised(new int[]{1,2,3 ,1, 1 ,1, 1},3));
        System.out.println(getLongestSubarrayBestApproach(new int[]{1,2,3 ,1, 1 ,1, 1},3));
        System.out.println(getLongestSubarrayHasing(new int[]{1,2,3 ,1, 1 ,1, 1},3));
    }

    // Time complexity : O(N^2) Brute Force
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length; // size of the array.

        int maxlen = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum = 0;
                for(int K = i;K<=j;K++){
                    sum +=a[K];
                }
                if(sum==k)
                    maxlen = Math.max(maxlen, j-i+1);

            }
        }
        return maxlen;

    }



    //O(N^2) Optimised brute force

    public static int longestSubarrayWithSumKOptimised(int []a, long k) {
        int n = a.length; // size of the array.

        int maxlen = 0;
        for(int i=0;i<n;i++){
            long sum = 0;
            for(int j=i;j<n;j++){
                sum +=a[j];

                if(sum==k)
                    maxlen = Math.max(maxlen, j-i+1);

            }
        }
        return maxlen;

    }

    // Optimal approach  O(N) using hashing and also  used for negative num
    public static int getLongestSubarrayHasing(int []a, int k) {
        int n = a.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }




    // Best approach 2 pointer O(N)

    public static int getLongestSubarrayBestApproach(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
}
