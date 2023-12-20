package com.code.java.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.Arrays;

/**You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

 You should rearrange the elements of nums such that the modified array follows the given conditions:

 Every consecutive pair of integers have opposite signs.
 For all integers with the same sign, the order in which they were present in nums is preserved.
 The rearranged array begins with a positive integer.
 Return the modified array after rearranging the elements to satisfy the aforementioned conditions.



 Example 1:

 Input: nums = [3,1,-2,-5,2,-4]
 Output: [3,-2,1,-5,2,-4]



 practice:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/s
 *
 */
public class RearrangeArrayBySign {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{3,1,-2,-5,2,-4})));
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] val = new int[nums.length];
        int c=0,c1=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                val[c]=nums[i];
                c+=2;
            }else if(nums[i]<0){
                val[c1]=nums[i];
                c1+=2;
            }
        }

        return val;

    }
}
