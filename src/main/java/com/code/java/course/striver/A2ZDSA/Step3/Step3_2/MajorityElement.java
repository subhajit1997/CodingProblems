package com.code.java.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.HashMap;
import java.util.Map;

/**
 * learn:
 * practice:https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElementOptimised(new int[]{2,2,1,1,1,2,2}));

    }
    //sing hashmap
    // O(n*log(n)) - as insertion in hashmap takes log(n)
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i: nums){
            if(mpp.containsKey(i)){
                mpp.put(i,mpp.get(i)+1);
            }else{
                mpp.put(i,1);
            }
        }
        int maxKey =0;
        int maxValue=0;
        for(Map.Entry<Integer,Integer> e: mpp.entrySet()){
            if(e.getValue()>maxValue){
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }
        return maxKey;
    }

    //Optimal approach
//Moore’s Voting Algorithm
// O(n)
    public static int majorityElementOptimised(int[] nums) {
        int n = nums.length;
        int count  =0,element=0;
        for(int i=0;i<n;i++){
            if(count ==0){
                count=1;
                element = nums[i];
            }else if(element == nums[i])
                count ++;
            else
                count --;
        }

        int c1 =0;
        for(int i=0;i<n;i++){
            if(nums[i]==element)
                c1++;
        }
        if(c1>(n/2))
            return element;
        return -1;
    }

    
}
