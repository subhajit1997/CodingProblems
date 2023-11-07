package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 * learn: https://takeuforward.org/data-structure/binary-search-explained/
 * practice:https://leetcode.com/problems/binary-search/description/
 */
public class BinarySearchFindXInSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low =0 ;
        int high= n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                low = mid+1;
            else
                high = mid -1;
        }
        return -1;
    }
}
