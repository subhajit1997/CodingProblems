package com.code.java.course.gfg.Week2.arrays.problems;

public class _9_RotateArray {
    /**
     * 
     Rotate Array
Difficulty: MediumAccuracy: 37.06%Submissions: 454K+Points: 4Average Time: 20m
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
Constraints:
1 <= arr.size(), d <= 105
0 <= arr[i] <= 105
     */
    public static void main(String[] args) {
        
    }
    // easy approach - Time: O(N^2) , space:O(1)
    // move 1 element at a time
    static void rotateArr(int arr[], int d) {
        for(int i=0;i<d;i++){
            int first = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
    }

    static void rotateArrEfficient(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        rotateArray(arr,0,d-1);
        rotateArray(arr,d,n-1);
        rotateArray(arr,0,n-1);
    }
    static void rotateArray(int arr[] ,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
