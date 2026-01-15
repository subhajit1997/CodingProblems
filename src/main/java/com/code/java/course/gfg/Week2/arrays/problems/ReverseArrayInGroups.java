package com.code.java.course.gfg.Week2.arrays.problems;

import java.util.ArrayList;
import java.util.List;
/**
 * Reverse array in groups
Difficulty: BasicAccuracy: 37.48%Submissions: 344K+Points: 1Average Time: 15m
Given an array arr of positive integers. Reverse every sub-array group of size k.

Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't return any array, modify the given array in place.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than array size, the entire array is reversed.
Constraints:
1 ≤ arr.size(), k ≤ 107
1 ≤ arr[i] ≤ 1018
 */
public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(4L);
        arr.add(5L);
        arr.add(6L);
        arr.add(7L);
        arr.add(8L);
        arr.add(9L);
        arr.add(10L);
        int k = 3;
        reverseInGroups(arr,k);
        for (Long aLong : arr) {
            System.out.print(aLong+" ");
        }

    }
    //own solution , O(N)
    static void  reverseInGroups(ArrayList<Long> arr, int k) {
        for(int i=0;i<arr.size();i+=k){
            int start =i;
            int end = Math.min(i+k-1,arr.size()-1);
            while(start<end){
                long val = arr.get(end);
                arr.set(end,arr.get(start));
                arr.set(start,val);
                start++;
                end--;
            }
        }
    }
    
}
