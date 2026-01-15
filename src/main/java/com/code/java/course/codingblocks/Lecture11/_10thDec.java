package com.code.java.course.codingblocks.Lecture11;

import java.util.Arrays;

public class _10thDec {
    public static void main(String[] args) {
        //Find max subarray sum
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){ //starting point
            int sum=arr[i];
            max = Math.max(max, sum);
            for(int j=i+1;j<n;j++){ //ending point
                sum +=arr[j];
                max = Math.max(max, sum);
            }

        }
        System.out.println(max);

        //kadens algo
        int sum=0;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxValue = Math.max(maxValue, sum);
            if(sum<0){ //cumulative sum till now becomes negative
                sum=0;
            }
        }
        System.out.println(maxValue);

        //binary search
        int arr1[] = {-1,3,6,11,102,111,124,200};
        int ans = binarySearch(arr1,3);
        System.out.println(ans);

        //
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high= arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    //https://leetcode.com/problems/first-bad-version/

    // public int firstBadVersion(int n) {
    //     int low=1;
    //     int high = n;
    //     int ans=0;
    //     while(low<=high){
    //         int mid = low+(high-low)/2;
    //         if(isBadVersion(mid)){
    //             ans = mid;
    //             high = mid-1;
    //         }else{
    //             low = mid+1;
    //         }
    //     }
    //     return ans;
    // }   
}
