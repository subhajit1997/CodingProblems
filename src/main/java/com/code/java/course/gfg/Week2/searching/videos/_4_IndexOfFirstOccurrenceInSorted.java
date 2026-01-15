package com.code.java.course.gfg.Week2.searching.videos;

public class _4_IndexOfFirstOccurrenceInSorted {
    public static void main(String[] args) {
        System.out.println(firstOccourance(new int[]{1,2,3,4,5,6,7,8,9},9,5));
        System.out.println(firstOccouranceRecursive(new int[]{1,2,3,4,5,5,5,5,5,6,7,8,9},0,12,5));
        System.out.println(firstOccouranceIterative(new int[]{1,2,3,4,5,5,5,5,5,6,7,8,9},13,5));
    }

    //easy , Time-O(N) , Space-O(1)
    static int firstOccourance(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    //recursive binary , Time - O(logN) , Space - O(logN)
    static int firstOccouranceRecursive(int arr[],int low,int high,int x){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(x>arr[mid])
            return firstOccouranceRecursive(arr,mid+1,high,x);
        else if(x<arr[mid])
            return firstOccouranceRecursive(arr,low,mid-1,x);
        else{
            if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
            else
                return firstOccouranceRecursive(arr,low,mid-1,x);
        }
    }

    //iterative binary , Time - O(logN) , Space - O(1)
    static int firstOccouranceIterative(int arr[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(x>arr[mid])
                low=mid+1;
            else if(x<arr[mid])
                high=mid-1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
