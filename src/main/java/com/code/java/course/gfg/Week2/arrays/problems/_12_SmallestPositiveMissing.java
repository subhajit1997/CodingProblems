package com.code.java.course.gfg.Week2.arrays.problems;

import java.util.Arrays;
/**
 * https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
 * Smallest Positive Missing
Difficulty: MediumAccuracy: 25.13%Submissions: 398K+Points: 4
You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.

 * 
 */
public class _12_SmallestPositiveMissing {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{2, -3, 4, 1, 1, 7}));
    }
     //Easy visted array concept , Time :O(N) , space - O(N)
    public static int missingNumber(int[] arr) {
        
        //using visted array concept
        int n = arr.length;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            //mark each elemnt into array
            if(arr[i]>0 && arr[i]<=n)
                vis[arr[i]-1]=true;
        }
        
        //check which is not marked
        for(int i=1;i<=n;i++){
            if(!vis[i-1])
                return i;
        }
        return n+1;
    }

    //optimised  Using Cycle Sort – O(n) Time and O(1) Space
    public int missingNumberEfficient(int[] arr) {
        
        //uisng cycle sort
        int n = arr.length;
        for(int i=0;i<n;i++){
            // if arr[i] is within the range [1, n] and arr[i]
            // is not placed at (arr[i]-1)th index in arr
            while(arr[i]>=1 && arr[i]<=n && arr[i]!= arr[arr[i] -1]){
                int temp = arr[i];
                arr[i] = arr[arr[i] -1];
                arr[temp -1] = temp;
            }
        }
        //If any number is not at its corresponding index 
        // then it is the missing number
        for(int i=1;i<=n;i++){
            if(i != arr[i-1]){
                return i;
            }
        }
        return n+1;
    }

}
