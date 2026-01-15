package com.code.java.company.AthenaHealth.Array;
/**
 * https://www.geeksforgeeks.org/minimum-and-maximum-of-all-subarrays-of-size-k-using-map/
 */

import java.util.ArrayList;
import java.util.List;

public class _9MaximumMinAllSubarraysofSize {
    public static void main(String[] args) {
        List<List<Integer>> res = minMaxSubarray(new int[]{5, 4, 3, 2, 1, 6, 3, 5, 4, 2, 1 }, 3);
        for(List<Integer> val: res){
            System.out.println("min: "+val.get(0)+" max:"+val.get(1));
        }
    }
    //Time complexiity : O(N^2)
    public static List<List<Integer>> minMaxSubarray(int[] arr,int k){
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            List<Integer> temp = new ArrayList<>();
            for(int j=i;j<i+k;j++){
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
            }
            temp.add(min);
            temp.add(max);
            result.add(temp);
        }
        return result;
    }


}
