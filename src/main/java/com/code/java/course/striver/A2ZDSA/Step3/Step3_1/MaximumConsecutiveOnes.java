package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

/**
 * practice: https://leetcode.com/problems/max-consecutive-ones/submissions/
 */
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempMax =0;
        for (int num : nums) {
            if (num == 1) {
                tempMax++;
            } else {
                if (tempMax > max)
                    max = tempMax;
                tempMax = 0;
            }
        }
        if(tempMax > max)
            max = tempMax;
        return max;
    }
}
