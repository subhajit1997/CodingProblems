package com.code.java.course.gfg.Week2.searching.videos;

public class _11_FindAPeakElement {
    public static void main(String[] args) {
        System.out.println(getPeakNeive(new int[]{6,7,8,20,12},5));
    }
    //Naive - time- O(N), space -O(1)
    static int getPeakNeive(int arr[],int n){
        if(n==1)
            return arr[0];
        if(arr[0]>=arr[1])
            return arr[0];
        if(arr[n-1]>=arr[n-2])
            return arr[n-1];
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                return arr[i];
        }
        return -1;
    }

    //Binary Search - time - O(logN), space - O(1)
    int getPeakEfficient(int arr[],int n){
        int low = 0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
                return arr[mid];
            if(mid>0 && arr[mid-1]>=arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
