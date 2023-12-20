package com.code.java.course.striver.A2ZDSA.Step1.Step1_6;

import java.util.Arrays;

/**
 *<IMPORTANT>
 * https://leetcode.com/problems/frequency-of-the-most-frequent-element/submissions/
 * The frequency of an element is the number of times it occurs in an array.
 *
 * You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
 *
 * Return the maximum possible frequency of an element after performing at most k operations.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4], k = 5
 * Output: 3
 * Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
 * 4 has a frequency of 3.
 *
 *
 * Solution Explanation: https://www.youtube.com/watch?v=vgBrQ0NM5vE
 */
public class FrequencyOfMstFrequentElement {
    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[]{6,2,4,8,3}, 5));
    }
    public static int maxFrequency(int[] A, int k) {
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(A);
        for (j = 0; j < A.length; ++j) {
            sum += A[j];
            while (sum + k < (long)A[j] * (j - i + 1)) {
                sum -= A[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
