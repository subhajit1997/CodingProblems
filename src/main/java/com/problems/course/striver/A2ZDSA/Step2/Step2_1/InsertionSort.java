package com.problems.course.striver.A2ZDSA.Step2.Step2_1;

import java.util.Arrays;

/**
 * Learn:https://takeuforward.org/data-structure/insertion-sort-algorithm/
 * Practise : https://www.codingninjas.com/studio/problems/insertion-sort_624381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class InsertionSort {
    public static void main(String[] args) {
        sortOperation(new int[]{13,46,24,52,20,9});
        int arr[] = {12, 11, 13, 5, 6};

        sortRecursively(arr, arr.length);

        System.out.println(Arrays.toString(arr));    }

    private static void sortOperation(int[] val) {
        int n=val.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && val[j-1]>val[j]){
                int temp = val[j];
                val[j]= val[j-1];
                val[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(val));
    }

    //https://www.geeksforgeeks.org/recursive-insertion-sort/
    private static void sortRecursively(int[] val,int n){
        if(n<=1)
            return;
        sortRecursively(val,n-1);;
        int j=n-2;
        int last= val[n-1];
        while (j>=0 && val[j]>last){
            val[j+1]=val[j];
            j--;
        }
        val[j+1]=last;
    }
}
