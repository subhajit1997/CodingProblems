package com.code.java.company.AthenaHealth.Array;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/degree-of-an-array/description/
 * 
 * Calculate Frequency and Track Indices:

Use a HashMap<Integer, int[]> where:
The key is the array value.
The value is an array of size 3:
arr[0] → First occurrence index.
arr[1] → Last occurrence index.
arr[2] → Frequency count.
Find the Degree of the Array:

Traverse the array:
If the value is seen for the first time, store its starting index, ending index (same as starting), and frequency (1).
If the value is seen again, update its ending index and increment the frequency.
Track the maximum frequency (degree) encountered.
Find the Shortest Subarray:

Traverse the map entries:
For each entry with a frequency equal to the degree, calculate the subarray length using:
length = last index-first index +1
Track the smallest length among these subarrays.
Return the Shortest Length.
 */
public class _4DegreeOfAnArray {
    public static void main(String[] args) {
        System.out.println(findDegree(new int[] {1,2,2,3,1,4,2}));   
    }
    public static int findDegree(int[] nums){
        HashMap<Integer,int[]> freq = new HashMap<>();
        int deg=0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(!freq.containsKey(val)){
                freq.put(val, new int[]{i,i,1});
            }else{
                int[] arr = freq.get(val);
                arr[1]=i;
                arr[2]++;
            }
            deg = Math.max(deg, freq.get(val)[2]);
        }
        int len = nums.length;
        for(int key:freq.keySet()){
            int[] arr = freq.get(key);
            if(arr[2] == deg){
                len = Math.min(len, arr[1]-arr[0]+1);
            }
        }
        return len;
    }

}
