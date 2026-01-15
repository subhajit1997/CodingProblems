package com.code.java.course.gfg.Week2.recursion.videos;

public class SubsetSumProblem {
    public static void main(String[] args) {
        System.out.println(countSubset(new int[]{10,5,2,3,6}, 5, 8));
    }
    private static int countSubset(int arr[], int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return countSubset(arr, n-1, sum) + countSubset(arr, n-1, sum-arr[n-1]);
    }
}
