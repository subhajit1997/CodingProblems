package com.problems.course.striver.A2ZDSA.Step1.Step1_6;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *
 * https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
 */
public class CountFrequesncyInRange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countFrequency(6,9,new int[]{1,3,1,9,2,7})));
    }
    public static int[] countFrequency(int n,int x,int []nums){
        int[] val = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<=n){
                val[nums[i]-1]+=1;
            }
        }
        return val;
    }
}
