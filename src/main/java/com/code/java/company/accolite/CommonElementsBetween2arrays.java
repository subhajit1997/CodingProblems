package com.code.java.company.accolite;

import java.util.*;

public class CommonElementsBetween2arrays {
    public static void main(String[] args) {
        int[] input1= new int[]{1,3,7,9,5,17};
        int[] input2= new int[]{9,10,14,17};
        System.out.println(Arrays.toString(findCommonElements(input1, input2)));
        System.out.println(Arrays.toString(findCommonElementstwopointer(input1, input2)));
    }
    //brute force approach -Time - O(n)
    private static int[] findCommonElements(int[] input1, int[] input2) {
        Set<Integer> st = new HashSet<>();
        int[] output = new int[input1.length+input2.length];
        for (int i:input1){
            st.add(i);
        }
        int k=0;
        for (int num:input2){
            if(st.contains(num)){
                output[k]=num;
                k++;
            }
        }
        return Arrays.copyOf(output,k);

    }

    //using two pointer approach , Time complexity - O(n(logN))
    private static int[] findCommonElementstwopointer(int[] input1, int[] input2){
        Arrays.sort(input1);
        Arrays.sort(input2);
        int i=0,j=0;
        int[] output = new int[input1.length+input2.length];
        int k=0;
        while (i<input1.length && j<input2.length){
            if(input1[i]==input2[j]){
                output[k]= input1[i];
                i++;
                j++;
                k++;
            }else if(input1[i]<input2[j]){
                i++;
            }else {
                j++;

            }

        }
        return Arrays.copyOf(output,k);
    }
}
