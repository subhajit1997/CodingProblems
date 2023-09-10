package com.problems.course.striver.A2ZDSA.Step2.Step2_1;

import java.util.Arrays;

/**
 * Learn: https://takeuforward.org/sorting/selection-sort-algorithm/
 * Practise : https://www.codingninjas.com/studio/problems/selection-sort_624469?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class SelectionSort {
    public static void main(String[] args) {
        sortOperation(new int[]{13,46,24,52,20,9});
    }

    private static void sortOperation(int[] val) {
        int n=val.length;
        for (int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(val[j]<val[min]){
                    min = j;
                }
            }
            int temp = val[min];
            val[min]=val[i];
            val[i]=temp;
        }
        System.out.println(Arrays.toString(val));
    }
}
