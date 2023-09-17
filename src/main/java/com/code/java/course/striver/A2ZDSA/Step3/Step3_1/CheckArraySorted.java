package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

/**
 * learn:
 * practice: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */
public class CheckArraySorted {
    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2})); //true
        System.out.println(check(new int[]{2,1,3,4})); //false
    }
    // rotation is allowed one time
    public static boolean check(int[] nums) {
        int breakStep=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i] ){
                breakStep++;
            }
        }
        if(breakStep==1){
            if(nums[0]<nums[nums.length-1]){
                return false;
            }
        }
        return breakStep <= 1;
    }
}
