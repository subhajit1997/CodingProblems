package com.code.java.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.HashSet;
import java.util.Set;

/**
 * <IMPORTANT>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 *
 * learn:
 * practice:https://leetcode.com/problems/longest-consecutive-sequence/description/
 */
public class LongestConsecutiveSequenceArray {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println(longestConsecutiveOptimised(new int[]{0,3,7,2,5,8,4,6,0,1}));

    }

    //Option 1 - Brute Force O(N^2)
    public static int longestConsecutive(int[] nums) {
        int maxCount=0;
        for (int num : nums) {
            int val = num;
            int ct = 1;
            while (find(nums, val + 1)) {
                val++;
                ct++;
            }
            maxCount = Math.max(ct, maxCount);
        }
        return maxCount;
    }

    public static boolean find(int[] nums,int a){
        for (int num : nums) {
            if (num == a)
                return true;
        }
        return false;
    }


    //Optimised using Set
    // O(N) + O(2*N) ~ O(3*N) == O(N)
    //Though we are using nested loops, the set will be traversed at most twice in the worst case. So, the time complexity is O(2*N) instead of O(N2).
    public static int longestConsecutiveOptimised(int[] nums) {
        if(nums.length==0)
            return 0;
        int maxCount=1;
        Set<Integer> val = new HashSet<>();
        for(int i: nums){
            val.add(i);
        }
        for(int it: val){
            if(!val.contains(it-1)){
                int ct=1;
                int x = it;
                while(val.contains(x+1)){
                    ct++;
                    x++;
                }
                maxCount = Math.max(ct,maxCount);
            }
        }
        return maxCount;
    }

}
