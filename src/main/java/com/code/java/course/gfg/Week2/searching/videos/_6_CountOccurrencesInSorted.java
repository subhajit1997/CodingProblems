package com.code.java.course.gfg.Week2.searching.videos;

public class _6_CountOccurrencesInSorted {
    public static void main(String[] args) {
        System.out.println(countOccuranceNiave(new int[]{1,2,3,4,5,5,5,5,6,7,8,9},13,5));
        System.out.println(countOccuranceBinary(new int[]{1,2,3,4,5,5,5,5,6,7,8,9},13,5));
    }

    //Niave -Time O(N) ,Space O(1)
    static int countOccuranceNiave(int arr[],int n,int x){
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                count++;
            if(count>0 && arr[i]!=x)
                return count;
        }
        return count;
    }
    //Using binarry search
    // using  two binnary search for first element and last element
    // Time - O(logN) , Space - O(1)
    static int countOccuranceBinary(int arr[] ,int n,int x){
        int first = findFirstOccourance(arr,n,x);
        if(first==-1)
            return 0;
        else
            return findLastOccourance(arr,n,x)-first+1;
    }
    static int findFirstOccourance(int arr[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low = mid+1;
            }else if(arr[mid]>x){
                high = mid-1;
            }else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    static int findLastOccourance(int arr[],int n,int x){
        int low =0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low = mid+1;
            }else if(arr[mid]>x){
                high = mid-1;
            }else{
                if(mid==n-1 || arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
}
