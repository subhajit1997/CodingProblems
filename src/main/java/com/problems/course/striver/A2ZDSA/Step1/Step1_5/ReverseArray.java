package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/studio/problems/reverse-an-array_8365444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(6, new int[]{5, 7, 8, 1, 6, 3})));
    }
    public static int[] reverseArray(int n, int []nums) {
         reverse(nums,0,nums.length-1);
         return nums;
    }
    public static void reverse(int []nums,int left,int right){
        if(left>=right){
            return;
        }
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        reverse(nums,left+1,right-1);
    }
}
