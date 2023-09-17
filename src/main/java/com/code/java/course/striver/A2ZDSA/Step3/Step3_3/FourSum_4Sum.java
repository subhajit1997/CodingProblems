package com.code.java.course.striver.A2ZDSA.Step3.Step3_3;

import java.util.*;

/**
 * learn:
 * practice: https://leetcode.com/problems/4sum/
 */
public class FourSum_4Sum {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2},0).toString().toString());
        System.out.println(fourSumBetter(new int[]{1,0,-1,0,-2,2},0).toString().toString());
        System.out.println(fourSumOptimised(new int[]{1,0,-1,0,-2,2},0).toString().toString());

    }

    //Brute Force
    //Time - O(N^4), Space- O(2* no of quadruples)
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> output = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if((nums[i]+nums[j]+nums[k]+nums[l])==target){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            output.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(output);
    }
    // using 3 loops
    // time- O(N^3*log(M)) where M = no of elements in set
    // space - O(2 *no of quadruples) +O(N)

    public static List<List<Integer>> fourSumBetter(int[] nums, int target) {
        Set<List<Integer>> output = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> set = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k]; // Separate because type casting might exceed length
                    long fourth = target - sum;
                    if(set.contains(fourth)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        temp.sort(null);
                        output.add(temp);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        return  new ArrayList<>(output) ;
    }

    // Optimal best approach:
    // time - O(N^3)
    // space - no extra space only store answers O(no of quadruples)
    public static List<List<Integer>> fourSumOptimised(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;

                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i]+nums[j];
                    sum +=nums[k];
                    sum += nums[l];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        output.add(temp);
                        k++;
                        l--;

                        while(k<l && nums[k]== nums[k-1])
                            k++;
                        while(k<l&& nums[l]==nums[l+1])
                            l--;
                    }else if(sum < target)
                        k++;
                    else
                        l--;

                }
            }
        }
        return output;
    }
}
