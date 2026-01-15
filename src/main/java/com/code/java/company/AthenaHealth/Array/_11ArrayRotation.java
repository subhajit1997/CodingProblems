package com.code.java.company.AthenaHealth.Array;
/*
 * https://takeuforward.org/data-structure/rotate-array-by-k-elements/
 */
import java.util.Arrays;

public class _11ArrayRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n =7;
        int k=2;
        RotateArray(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void RotateArray(int[] arr,int n,int k){
        Reverse(arr,0,n-k-1);
        Reverse(arr,n-k,n-1);
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int[] arr,int start,int end){
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
