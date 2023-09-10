package com.problems.course.striver.A2ZDSA.Step2.Step2_2;

import java.util.Arrays;

/**
 * Learn:https://takeuforward.org/data-structure/quick-sort-algorithm/
 *
 * https://www.geeksforgeeks.org/quick-sort/
 *
 * Practise : https://www.codingninjas.com/studio/problems/quick-sort_5844?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{13,46,24,52,20,9};
        int n =arr.length;
        quickSortOperation(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    //https://www.geeksforgeeks.org/quick-sort/
    private static void quickSortOperation(int[] arr, int low, int high) {
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSortOperation(arr,low,partitionIndex-1);
            quickSortOperation(arr,partitionIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
