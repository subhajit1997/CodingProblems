package com.code.java.course.gfg.Week2.searching.videos;

public class _7_Count1sInASortedBinaryArray {
    public static void main(String[] args) {
        System.out.println(count1sBinnarySearch(new int[]{0,0,0,1,1,1,1},7,1));
    }
    //Using binary search first occourance 
    //Time - O(logN) , Space - O(1)
    static int count1sBinnarySearch(int[] arr,int n,int x){
        int low= 0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low = mid+1;
            }else if(arr[mid]>x){
                high = mid-1;
            }else{
                if(mid ==0 || arr[mid]!=arr[mid-1])
                    return (n-mid);
                else
                    high = mid-1;
            }
        }
        return 0;
    }
}
