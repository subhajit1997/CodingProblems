package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _8MergeTwoSortedArray {
    public static void main(String[] args) {
                System.out.println("Merge two Sorted Arrays Without Extra Space: "+Arrays.toString(lect3_8_myapproach(new int[]{1,4,8,10},new int[]{2,3,9}))+
            "\n"+lect3_8_approach1_withoutspace_using_sorting(new int[]{1,4,8,10},new int[]{2,3,9}));

    }
        //Problem Statement :Merge two Sorted Arrays Without Extra Space
    public static int[] lect3_8_myapproach(int[]  arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n+m];
        int i=0,j=0;
        int k=0;
        while (i<n && j<m) {
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                res[k]= arr2[j];
                j++;
            }else{
                res[k]=arr1[i];
                i++;
                j++;
            }
            k++;
        }
        while (i < n) {
            res[k++] = arr1[i++];
        }

        while (j < m) {
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static List<List<Integer>> lect3_8_approach1_withoutspace_using_sorting(int[]  arr1,int[] arr2){
        //Time :  O(min(n, m)) + O(n*logn) + O(m*logm)
        int n = arr1.length;
        int m = arr2.length;

        //declare two pointers
        int left= n-1;
        int right =0;
        //swap elements until arr1[left] is smaller than arr2[right]
        while (left>=0 && right<m) {
            if(arr1[left]> arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        
        //sort arr1 and arr2
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<List<Integer>> lst= new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        for (int num : arr1) {
            val.add(num);
        }
        lst.add(val);
        List<Integer> val2 = new ArrayList<>();
        for (int num : arr2) {
            val2.add(num);
        }
        lst.add(val2);
        return lst;

    }
    //NOTE : Try using GAP METHOD

}
