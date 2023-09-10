package com.problems.course.striver.A2ZDSA.Step2.Step2_2;

import java.util.Arrays;

/**
 * Learn: https://takeuforward.org/data-structure/merge-sort-algorithm/
 * Practise : https://www.codingninjas.com/studio/problems/merge-sort_5846?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        int n=arr.length;
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int low,int high) {
        if(low< high) {
            int mid = low+ ( high- low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid -low+1;
        int n2= high-mid;
        int[] left =new int[n1];
        int[] right = new int[n2];

        System.arraycopy(arr, low, left, 0, n1);
        System.arraycopy(arr,mid+1,right,0,n2);

        int i=0,j=0,k=low;
        while (i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }

    }
}
