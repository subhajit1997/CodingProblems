package com.code.java.course.gfg.Week2.arrays.videos;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        System.out.println("maximumSumOfConsucutiveElemnts: "+maximumSumOfConsucutiveElemnts(new int[]{1,8,30,-5,20,7},3));
        System.out.println("maximumSumOfConsucutiveElemntsSlidingWindow: "+maximumSumOfConsucutiveElemntsSlidingWindow(new int[]{1,8,30,-5,20,7},3));
    }

    static int maximumSumOfConsucutiveElemnts(int arr[],int k){
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i+k-1<n;i++){
            int sum =0;
            for(int j=0;j<k;j++){
                sum+=arr[i+j];
            }
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
    static int maximumSumOfConsucutiveElemntsSlidingWindow(int arr[],int k){
        int curr=0;
        int n = arr.length;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        int res = curr;
        for(int i=k;i<n;i++){
            curr=curr+arr[i]-arr[i-k];
            res = Math.max(res, curr);
        }
        return res;
    }
}
