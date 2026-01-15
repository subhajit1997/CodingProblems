package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _7MergeOverlappingSubInternal {
    public static void main(String[] args) {
                System.out.println("Merge Overlapping Sub-intervals: "+ lect3_7_bruteforce(new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}})+
            "\n"+lect3_7_optimised(new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}}));

    }

    //Problem Statement :Merge Overlapping Sub-intervals
    public static List<List<Integer>> lect3_7_bruteforce(int[][]  arr){
        // time: O(N*logN) + O(2*N)
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for(int i=0;i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!result.isEmpty() && end <= result.get(result.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0] <= end){
                    end = Math.max(end, arr[j][1]);
                }else{
                    break;
                }
            }
            result.add(Arrays.asList(start,end));
        }
        return result;
    }
    
    public static List<List<Integer>> lect3_7_optimised(int[][]  arr){
        // time: O(N*logN) + O(N)
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
         Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for(int i=0;i<n;i++){

            //if current interval does not lie in last interval
            if(result.isEmpty() || arr[i][0] > result.get(result.size()-1).get(1)){
                result.add(Arrays.asList(arr[i][0],arr[i][1]));
            }

            //if current index lies in last interval
            else{
                result.get(result.size()-1).set(1, Math.max(result.get(result.size()-1).get(1), arr[i][1]));
            }
        }
        return result;
    }
}
