package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/single-number/
 * 136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class _12_SingleNumber {
    public static void main(String[] args) {
        
    }
    //Hashmap - time: O(nlog(m)), space: m
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int val = map.getOrDefault(num,0);
            map.put(num,val+1);
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()==1)
                return it.getKey();
        }
        return -1;
    }
    //optimised
    //using zor operator, Time : O(N), space - O(1)
    public int singleNumberOptimised(int[] nums) {
        int val=0;
        for(int num:nums){
            val = val^ num;
        }
        return val;
    }

    
}
