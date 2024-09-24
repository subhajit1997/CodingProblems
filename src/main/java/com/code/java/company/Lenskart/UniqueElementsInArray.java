package com.code.java.company.Lenskart;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueElementsInArray {
    public static void main(String[] args) {

    }static void printDistinct(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            while(i<n-1 && arr[i] ==arr[i+1])
                i++;
            System.out.println(arr[i]+" ");
        }
    }
}
