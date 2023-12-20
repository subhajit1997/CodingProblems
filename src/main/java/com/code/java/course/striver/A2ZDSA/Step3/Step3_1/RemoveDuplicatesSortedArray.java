package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.Arrays;
import java.util.HashMap;

/** <IMPORTANT>
 * learn : https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
 * optimised solution : https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/3676877/best-method-100-c-java-python-beginner-friendly/
 *
 * practice: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        System.out.println((removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})));

    }
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }

        return j;
    }
}

