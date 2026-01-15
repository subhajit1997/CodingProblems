package com.code.java.course.gfg.Week2.arrays.problems;

/**
 * Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Example 1:

Input:
N = 4
arr[] = {3,4,1,2}
Output: Yes
Explanation: The array is sorted 
(1, 2, 3, 4) and rotated twice 
(3, 4, 1, 2).
Example 2:

Input:
N = 3
arr[] = {1,2,3}
Output: No
Explanation: The array is sorted 
(1, 2, 3) is not rotated.
Your Task:
The task is to complete the function checkRotatedAndSorted() which returns true if an array is sorted and rotated clockwise otherwise false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= A[i] <= 106
 */
public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        System.out.println(checkRotatedAndSorted(new int[]{3,4,1,2}, 4));
    }
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        int incCount=0,decCount=0,minIndex=0,maxIndex=0;
        for(int i=0;i<num;i++){
            if(arr[i]>arr[(i+1)%num]){
                incCount++;
                minIndex=i+1;
            }
        }
        for(int i=0;i<num;i++){
            if(arr[i]<arr[(i+1)%num]){
                decCount++;
                maxIndex=i+1;
            }
        }
        
        boolean incCheck= (incCount==1 && minIndex!=0);
        boolean decCheck = (decCount==1 && maxIndex!=0);
        return incCheck || decCheck;
        
    }

    /**
     *Increasing Order Rotation Check:
We count how many times arr[i] > arr[i+1] (i.e., a drop occurs).
If there's exactly one drop, and the rotation is valid, it means the array was sorted in increasing order and rotated.

    Decreasing Order Rotation Check:
We count how many times arr[i] < arr[i+1] (i.e., an increase occurs).
If there's exactly one increase, and the rotation is valid, it means the array was sorted in decreasing order and rotated.

    Final Condition:
If either increasing sorted or decreasing sorted conditions hold with rotation, return true.
Otherwise, return false.
     */
}
