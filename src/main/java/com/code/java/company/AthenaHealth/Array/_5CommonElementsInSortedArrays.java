package com.code.java.company.AthenaHealth.Array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/find-common-elements-between-two-arrays/description/
 */
public class _5CommonElementsInSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findCommonElements(new int[]{2,3,2},new int[]{1,2})));
    }
    //using hashset
    public static int[] findCommonElements(int[] num1,int[] num2){
        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();

        for(int num:num1){
            hset1.add(num);
        }
        for(int num:num2){
            hset2.add(num);
        }
        int ans1=0,ans2=0;
        for(int num:num1){
            if(hset2.contains(num)){
                ans1++;
            }
        }
        for(int num:num2){
            if(hset1.contains(num)){
                ans2++;
            }
        }
        return new int[]{ans1,ans2};
    }
}
