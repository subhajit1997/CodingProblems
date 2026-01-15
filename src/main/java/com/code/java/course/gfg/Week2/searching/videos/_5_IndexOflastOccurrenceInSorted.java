package com.code.java.course.gfg.Week2.searching.videos;

public class _5_IndexOflastOccurrenceInSorted {
    public static void main(String[] args) {
        System.out.println(lastOccourance(new int[]{1,2,3,4,5,5,5,5,5,6,7,8,9},13,5));
        System.out.println(lastOccouranceRecursion(new int[]{1,2,3,4,5,5,5,5,5,6,7,8,9},0,13,5,13));
        System.out.println(lastOccouranceIterative(new int[]{1,2,3,4,5,5,5,5,5,6,7,8,9},13,5));
    }

    //easy - O(N) , O(1)
    static int lastOccourance(int arr[],int n,int x){
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }

    //recursive - O(logN) , O(logN)
    static int lastOccouranceRecursion(int arr[],int low,int high,int x,int n){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]>x){
            return lastOccouranceRecursion(arr,low,mid-1,x,n);
        }
        else if(arr[mid]<x){
            return lastOccouranceRecursion(arr,mid+1,high,x,n);
        }
        else{
            if(mid==n-1 || arr[mid+1]!=arr[mid])
                return mid;
            else
                return lastOccouranceRecursion(arr,mid+1,high,x,n);
        }
    }
    //iterative - O(logN) , O(1)
    static int lastOccouranceIterative(int arr[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x)
                low=mid+1;
            else if(arr[mid]>x)
                high=mid-1;
            else{
                if(mid==n-1 || arr[mid+1]!=arr[mid])
                    return mid;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
}
