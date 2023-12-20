package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.Arrays;

/**<IMPORTANT>
 * learn: https://takeuforward.org/data-structure/rotate-array-by-k-elements/
 * practice: https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
        int[] nums1 = new int[]{1,2,3,4,5,6,7};
        rotate1(nums1,3);
        System.out.println(Arrays.toString(nums1));
        int[] nums2 = new int[]{1,2,3,4,5,6,7};
        rotateOptimised(nums2,3);
        System.out.println(Arrays.toString(nums2));
    }

    //My approach
    public static void rotate(int[] nums, int k) {
        //1,2,3,4,5,6,7 , k=3
        // temp = 7 ,  1,2,3,4,5,6,6 , 1,2,3,4,5,5,6  1,2,3,4,4,5,6 .. 1,1,2,3,4,4,5,6 , 7,1,2,3,4,4,5,6
        if(k==0 || k==nums.length)
            return;
        int n = nums.length-1;
        while(k!=0){
            int temp = nums[n];
            for(int i=n;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }
    //Striver brute force approach
    // time - O(n)
    //space - O(k)
    public static void rotate1(int[] nums, int k) {
        int n=nums.length;
        if (n==0)
            return;
        k = k%n;
        if(k>n)
            return;
       int[] temp = new int[k];
       for(int i=n-k;i<n;i++){
           temp[i-n+k]=nums[i];
       }
       for(int i=n-k-1;i>=0;i--){
           nums[i+k]=nums[i];
       }
       for(int i=0;i<k;i++){
           nums[i]=temp[i];
       }

    }

    //Using Reversal Algorithm Most optimised
    //time - O(n) , space -O(1)
    // 1,2,3,4,5,6,7   k=3  ->   4,3,2,1,5,6,7  ->   4,3,2,1,7,6,5  ->  5,6,7,1,2,3,4
    public static void rotateOptimised(int[] nums, int k) {
        int n=nums.length;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }

}
