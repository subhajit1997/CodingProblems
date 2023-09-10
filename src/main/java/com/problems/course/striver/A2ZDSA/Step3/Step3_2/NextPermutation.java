package com.problems.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.Arrays;

/**
 * <IMPORTANT>
 * learn:https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/
 * practice:https://leetcode.com/problems/next-permutation/description/
 *
 *A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 *
 * For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 *
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 * Given an array of integers nums, find the next permutation of nums.
 *
 * The replacement must be in place and use only constant extra memory.
 *
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] n = new int[]{1,2,3};
        nextPermutation(n);
        System.out.println(Arrays.toString(n));
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind =i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n);
            System.out.println("index -1");
            return ;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[ind];
                nums[ind]=nums[i];
                nums[i]= temp;
                break;
            }
        }
        reverse(nums,ind+1,n);
    }
    public static void reverse(int[] nums,int m,int n){
        int k=0;
        for(int i=m;i<(m+n)/2;i++){
            int temp = nums[i];
            nums[i]= nums[n-k-1];
            nums[n-k-1]=temp;
            k++;
        }
        System.out.println((Arrays.toString(nums)));
    }
}
