package com.code.java.company.Others;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        int[] val = {23,6,3,8,1,78};
        mergeSort(val,0,val.length-1);
        System.out.println(Arrays.toString(val));
        System.out.println(longestSubstrings("ABCDEFBCDEFGHKABCDEFGH"));
        int[][] intervals = {{1, 14}, {2, 4}, {5, 9}, {10, 11}};
        for (int[] interval : mergeOverlapping(intervals)) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
        addDiagonals(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }
    public static void mergeSort(int[] val,int low,int high){
        if(low<high){
            int mid = low +(high-low)/2;
            mergeSort(val,low,mid);
            mergeSort(val,mid+1,high);
            mergeSortVal(val,low,mid,high);
        }

    }
    public static void mergeSortVal(int[] val,int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i=0,j=0, k=low;
        System.arraycopy(val,low,left,0,n1);
        System.arraycopy(val,mid+1,right,0,n2);
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j]){
                val[k] = left[i];
                i++;
            }else{
                val[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            val[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            val[k]= right[j];
            j++;
            k++;
        }


    }
    public static int lengthOfLongestSubstringOptimised(String s) {
        if (s.length() == 0)
            return 0;

        int max = 0;
        int l=0;
        int r=0;
        Set<Character> set = new HashSet<>();
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                while(l<r && set.contains(s.charAt(r)))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
    public static List<String> longestSubstrings(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() == 0)
            return result;

        int maxLen = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                start = l;
                end = r;
                result.clear(); // Clear previous results since we found a longer substring
                result.add(s.substring(start, end + 1));
            } else if (r - l + 1 == maxLen) {
                result.add(s.substring(l, r + 1));
            }
            r++;
        }

        return result;
    }
    public static List<int[]> mergeOverlapping(int[][] intervals){
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        for(int[] interval:intervals){
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if(currentEnd>=nextStart){
                currentInterval[1] = Math.max(currentEnd,nextEnd);

            }else{
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged;
    }

    public static void addDiagonals(int[][] matrix){
        int n = matrix.length;
        int leftDiagonal = calculateLeft(matrix,n);
        int rightDiagonal = calculateRight(matrix,n);
        System.out.println(leftDiagonal-rightDiagonal);
    }
    public static int calculateLeft(int[][] matrix,int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=matrix[i][i];
        }
        return sum;
    }
    public static int calculateRight(int[][] matrix,int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=matrix[i][n-i-1];
        }
        return sum;
    }
}
