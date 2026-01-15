package com.code.java.course.gfg.Week2.arrays.videos;

public class Maximumsubarraysum {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumFind(new int[]{2,3,-8,7,-1,2,3}));
    }
    static int maxSubarraySumFind(int[] arr){
        int n = arr.length;
        int resultSum = arr[0];
        for(int i=0;i<n;i++){
            int currentSum = 0;
            for(int j=i;j<n;j++){
                currentSum+=arr[j];
                resultSum = Math.max(resultSum,currentSum);
            }
        }
        return resultSum;
    }

    static int maxSubarraySumFindEfficient(int[] arr){
        int n = arr.length;
        int resultSum = arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<n;i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            resultSum = Math.max(resultSum,maxEnding);
        }
        return resultSum;
    }
}
