package com.code.java.course.gfg.Week3.sorting.videos;

import java.util.Arrays;

public class _7_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 7, 8, 9,3, 4, 5};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

        int arr1[] = {1, 2, 6, 7, 8, 9,3, 4, 5};
        bubbleOptimised(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));
    }
    //Time - O(N^2), Space - O(1)
    static void bubbleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //Time - O(N^2), Space - O(1)
    static void bubbleOptimised(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }

}
