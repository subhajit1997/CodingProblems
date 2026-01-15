package com.code.java.course.codingblocks.Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class _9thDec {
    public static void main(String[] args) {
        //take input array ,make function pass array and n
        // retrun whether n present in array or not return index else -1.
        int arr[] = {1,2,-3,4,-5,11,12};
        int target = 11;
        int ans = ls(arr,target);
        System.out.println(ans);

        //bubble sort
        sortBubbleSort(arr);
        int arr1[] = {1,2,-3,4,-5,11,12};
        //selection sort
        selectionSort(arr1);

        /*
            Insertion sort:
                1) we sort from 0 to n-1
                2) every elemenst finds the lowest index possible
                3) shifts all other towards right
                4) Insert the element
        */
        int arr2[] = {1,2,-3,4,-5,11,12};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // every i finds lowest possible index
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] =arr[j]; //shifting j towards right
                j--;
            }
            j++;
            arr[j] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void sortBubbleSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static int ls(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
