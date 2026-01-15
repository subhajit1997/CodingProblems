package com.code.java.company.AthenaHealth.Others;
/**
 * https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _2mergeIntervals {
    public static void main(String[] args) {
         int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
         System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
    }
    //Time Complexity: O(N*logN) + O(2*N), 
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
         List<List<Integer>> ans = new ArrayList<>();
         for(int i=0;i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];

            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0] <=end){
                    end = Math.max(end, arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
         }
         return ans;
    }
}
