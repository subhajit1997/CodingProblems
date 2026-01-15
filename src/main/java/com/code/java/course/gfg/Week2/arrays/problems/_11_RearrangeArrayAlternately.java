package com.code.java.course.gfg.Week2.arrays.problems;

import java.util.Arrays;
/**
 * Rearrange Array Alternately
Difficulty: MediumAccuracy: 35.15%Submissions: 250K+Points: 4
Given an array of positive integers. Your task is to rearrange the array elements alternatively i.e. first element should be the max value, the second should be the min value, the third should be the second max, the fourth should be the second min, and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [6, 1, 5, 2, 4, 3]
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... The modified array is: [6, 1, 5, 2, 4, 3]
 */
public class _11_RearrangeArrayAlternately {
    
    public static void main(String[] args) {

    }
    //my approach , Time: O(NlogN) , space:O(N)
    public static void rearrange(int arr[]) {
        int n = arr.length;
        int[] sorted = new int[n];
        sorted  = Arrays.copyOf(arr,n);
        Arrays.sort(sorted);
        int end = n-1;
        int start = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] = sorted[end--];
            }else{
                arr[i] = sorted[start++];
            }
        }
    }

    //optimised , Time - O(NlogN)  , space - O(1) 
    public static void rearrangeOptimised(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int maxIndex = n-1,minIndex =0;
        int maxVal = arr[maxIndex]+1;
        
        //endode
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxIndex]%maxVal)*maxVal;
                maxIndex--;
            }else{
                arr[i]=arr[i]+(arr[minIndex]%maxVal)*maxVal;
                minIndex++;
            }
        }
        
        //decode
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/maxVal;
        }
    }

}
