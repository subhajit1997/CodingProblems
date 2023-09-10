package com.problems.practice.algorithm.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,4,7,22,0};
        bubbleSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    swapped =true;
                }
            }
            if(swapped ==false){
                break;
            }
        }
    }
}
