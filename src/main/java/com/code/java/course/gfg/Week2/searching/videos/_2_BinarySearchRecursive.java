package com.code.java.course.gfg.Week2.searching.videos;

public class _2_BinarySearchRecursive {
    public static void main(String[] args) {
        System.out.println(bSearch(new int[]{1,2,3,4,5,6,7,8,9},0,8,5));
    }
    static int bSearch(int arr[],int low,int high,int x){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            return bSearch(arr,low,mid-1,x);
        else
            return bSearch(arr,mid+1,high,x);
    }
}
