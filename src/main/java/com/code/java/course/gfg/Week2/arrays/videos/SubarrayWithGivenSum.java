package com.code.java.course.gfg.Week2.arrays.videos;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println(isSubSum(new int[]{2,4},3));
        System.out.println(isSubSumEfficient(new int[]{4,8,12,5},17));
    }
    static boolean isSubSum(int[] arr,int sum){
        int n =arr.length;
        for(int i=0;i<n;i++){
            int currentSum =0;
            for(int j=i;j<n;j++){
                currentSum+=arr[j];
                if(currentSum==sum){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isSubSumEfficient(int[] arr,int sum){
        int n = arr.length;
        int currentSum =0;
        int start =0;
        for(int end =0 ; end<n;end++){
            currentSum += arr[end];
            while(sum<currentSum){
                currentSum -=arr[start];
                start++;
            }
            if(currentSum==sum){
                return true;
            }
        }
        return false;
    }
}
