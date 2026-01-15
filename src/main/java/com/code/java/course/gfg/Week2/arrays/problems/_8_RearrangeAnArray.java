package com.code.java.course.gfg.Week2.arrays.problems;

public class _8_RearrangeAnArray {
    /**
     * Rearrange an array with O(1) extra space
Difficulty: MediumAccuracy: 56.34%Submissions: 118K+Points: 4
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].

NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.

Example 1:

Input:
N = 2
arr[] = [1,0]
Output: 0 1
Explanation: 
arr[arr[0]] = arr[1] = 0
arr[arr[1]] = arr[0] = 1
So, arrT becomes {0, 1}
     * @param args
     */
    public static void main(String[] args) {
        
    }
    //own approach - Time:O(N) space: O(N)
    static void arrange(long arr[], int n)
    {
        long[] arr1 = new long[n];
        for(int i=0;i<n;i++){
            long val = arr[i];
            arr1[i]=(int)arr[(int)val];
        }
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
    }
    //better apooproach , time = O(N) space: O(1)
    static void arrangeEffieceint(long arr[], int n)
    {
        for(int i=0;i<n;i++){
            //step1: encode 
            //(arr[arr[i]]%n) extracts new value at i
            //multiplying by n ensoures new value is encoded without loosing pression
            
            arr[i] = arr[i] + (arr[(int)arr[i]]%n)*n;
        }
        
        for(int i=0;i<n;i++){
            //step2: decode 
            arr[i]=arr[i]/n;
        }
    }

}
