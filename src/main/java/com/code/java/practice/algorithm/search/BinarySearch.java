package com.code.java.practice.algorithm.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int x=3;
        int result = search(arr,x);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Found at index: "+result);
        }
        int resultRecursive = searchRecursive(arr,0,arr.length,x);
        if(resultRecursive==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Found at index: "+resultRecursive);
        }

    }

    private static int searchRecursive(int[] arr, int left,int right,int x) {
        if(right>=left){
            int mid = left+(right-left)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return searchRecursive(arr,left,mid-1,x);
            }
            return searchRecursive(arr,mid+1,right,x);
        }
        return -1;
    }

    private static int search(int[] arr, int x) {
       int left =0;
       int right=arr.length-1;
       while (left<right){
           int mid =left+(right-left)/2;
           if(arr[mid]==x){
               return mid;
           }
           if(arr[mid]<x){
               left=mid+1;
           }
           else{
               right = mid-1;
           }
       }
       return -1;
    }
}
