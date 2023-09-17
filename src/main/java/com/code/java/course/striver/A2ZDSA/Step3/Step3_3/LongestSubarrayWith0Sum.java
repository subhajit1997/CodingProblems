package com.code.java.course.striver.A2ZDSA.Step3.Step3_3;

import java.util.HashMap;

/**
 * learn:https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum/
 * practice:https://www.codingninjas.com/studio/problems/longest-subarray-with-zero-sum_6783450?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */
public class LongestSubarrayWith0Sum {
    public static void main(String[] args) {
        System.out.println(getLongestZeroSumSubarrayLength(new int[]{1,-1,0,0,1}));
    }
    public static int getLongestZeroSumSubarrayLength(int []arr){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxLen=0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum ==0){
                maxLen = i+1;
            }else{
                if(mpp.get(sum)!=null){
                    maxLen = Math.max(maxLen, i- mpp.get(sum));
                }else{
                    mpp.put(sum, i);
                }
            }

        }
        return maxLen;
    }

}
