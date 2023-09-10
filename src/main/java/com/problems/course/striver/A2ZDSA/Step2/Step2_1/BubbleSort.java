package com.problems.course.striver.A2ZDSA.Step2.Step2_1;

import java.util.Arrays;

/**
 * Learn: https://takeuforward.org/data-structure/bubble-sort-algorithm/
 * Practise :https://www.codingninjas.com/studio/problems/bubble-sort_624380?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class BubbleSort {
    public static void main(String[] args) {

        sortOperation(new int[]{13,46,24,52,20,9});
        sortOperationOptimal(new int[]{13,46,24,52,20,9});
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        sortOperationRecursive(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    //not optimal time complexity - O(N^2) for worst, best and average
    private static void sortOperation(int[] val) {
        int n =val.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(val[j]>val[j+1]){
                    int temp = val[j];
                    val[j]=val[j+1];
                    val[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(val));
    }

    //Better approach only for best case - O(N) but for worst and average case O(N^2)
    private static void sortOperationOptimal(int[] val) {
        int n=val.length;
        for(int i=n-1;i>=0;i--){
            boolean didSwap = false;
            for(int j=0;j<=i-1;j++){
                if(val[j]>val[j+1]){
                    int temp = val[j];
                    val[j]=val[j+1];
                    val[j+1]=temp;
                    didSwap = true;
                }
            }
            if( !didSwap){
                break;
            }
        }
        System.out.println(Arrays.toString(val));
    }
    //Recursive bubble sort
    public static void sortOperationRecursive(int arr[], int n){
        if(n==1) return;
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        sortOperationRecursive(arr,n-1);
    }
}
