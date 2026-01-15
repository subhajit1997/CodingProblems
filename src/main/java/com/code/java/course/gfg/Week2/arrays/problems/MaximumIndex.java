package com.code.java.course.gfg.Week2.arrays.problems;

/**
 * Given an array arr of positive integers. The task is to return the maximum of j - i subjected to the constraint of arr[i] < arr[j] and i < j.

Examples:

Input: arr[] = [1, 10]
Output: 1
Explanation: arr[0] < arr[1] so (j-i) is 1-0 = 1.
Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
Output: 6
Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] < arr[j]) thus giving the maximum difference of j - i which is 6(7-1).
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ arr.size ≤ 106
0 ≤ arr[i] ≤ 109
Company
 */
public class MaximumIndex {
    public static void main(String[] args) {
        
    }
    
      // Function to find the maximum index difference.
      int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int[] left_min = new int[n];
        int[] right_max = new int[n];
        left_min[0]=arr[0];
        for(int i=1;i<n;i++){
            left_min[i]=Math.min(left_min[i-1],arr[i]);
        }
        right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],arr[i]);
        }
        int i=0,j=0,max_diff=0;
        while(i<n&&j<n){
            if(left_min[i]<=right_max[j]){
                max_diff = Math.max(max_diff, j-i);
                j++;
            }else{
                i++;
            }
            
        }
        return max_diff;
    }
}
