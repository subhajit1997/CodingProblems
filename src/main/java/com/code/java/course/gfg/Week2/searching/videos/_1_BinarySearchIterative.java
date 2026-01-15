package com.code.java.course.gfg.Week2.searching.videos;

public class _1_BinarySearchIterative {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9},9,5));
    }
    public static int binarySearch(int arr[],int n,int x){
        int low=0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x)
                high = mid -1;
            else
                low = mid+1;
        }
        return -1;
    }
}
