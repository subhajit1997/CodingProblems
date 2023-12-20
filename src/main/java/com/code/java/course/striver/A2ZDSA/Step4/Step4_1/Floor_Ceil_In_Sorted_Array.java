package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

import java.util.Arrays;

/**
 * learn:
 * practice:https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class Floor_Ceil_In_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ceilingInSortedArray(7, 13, new int[]{5, 8, 19, 24, 24, 28, 28})));

    }
    public static int[] ceilingInSortedArray(int n, int x, int[] arr) {
        int floor = findFloor(n,x,arr);
        int ceiling = findCeiling(n,x,arr);
        return new int[]{floor,ceiling};

    }
    public static int findCeiling(int n, int x, int[] arr){
        int low = 0;
        int high = n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans =  arr[ mid];
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int findFloor(int n, int x, int[] arr){
        int low = 0;
        int high = n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans =  arr[ mid];
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
