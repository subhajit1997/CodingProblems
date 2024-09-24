package com.code.java.company.accolite;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));

        rotateArray(nums, k);

        System.out.println("Rotated Array by " + k + " positions: " + Arrays.toString(nums));

    }

    private static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //reverse entire array
        reverseArrayRotarte(nums,0,n-1);
        //reverse fiorst k elements
        reverseArrayRotarte(nums,0,k-1);
        //reverse remianing elements
        reverseArrayRotarte(nums,k,n-1);
    }

    private static void reverseArrayRotarte(int[] nums, int start, int end) {
        while (start<end){
            int temp = nums[start];
            nums[start] =nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
