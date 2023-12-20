package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**learn:https://takeuforward.org/data-structure/search-single-element-in-a-sorted-array/
 * practice:https://leetcode.com/problems/single-element-in-a-sorted-array/
 *
 *

 540. Single Element in a Sorted Array
 You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

 Return the single element that appears only once.

 Your solution must run in O(log n) time and O(1) space.



 Example 1:

 Input: nums = [1,1,2,3,3,4,4,8,8]
 Output: 2
 *
 */
public class SearchSingleElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicateBruteForce(new  int[]{1,1,2,3,3,4,4,8,8}));
        System.out.println(singleNonDuplicateXorOperator(new  int[]{1,1,2,3,3,4,4,8,8}));
        System.out.println(singleNonDuplicateOptimised(new  int[]{1,1,2,3,3,4,4,8,8}));

    }
    //using brute force approach O(N)-time
    public static int singleNonDuplicateBruteForce(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[i]!=nums[i+1])
                    return nums[i];
            }
            else if(i==n-1){
                if(nums[i]!=nums[i-1])
                    return nums[i];
            }else{
                if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1])
                    return nums[i];
            }

        }
        return -1;
    }

    //using xor operator time-O(N)
    public static int singleNonDuplicateXorOperator(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int val = 0;
        for(int i=0;i<n;i++){
            val = val ^ nums[i];
        }
        return val;
    }

    //optimised best approach O(logN)
    public static int singleNonDuplicateOptimised(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[n-1]!=nums[n-2])
            return nums[n-1];
        int low=1;
        int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                return nums[mid];
            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1]))
                low = mid +1;
            else
                high = mid-1;
        }
        return -1;
    }


}
