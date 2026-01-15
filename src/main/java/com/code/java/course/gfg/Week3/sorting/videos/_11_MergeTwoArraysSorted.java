package com.code.java.course.gfg.Week3.sorting.videos;

import java.util.Arrays;

public class _11_MergeTwoArraysSorted {
    public static void main(String[] args) {
        merge(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}, 4, 4);
        System.out.println();
        mergeEfficient(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}, 4, 4);
    }
    //naive solution Time: O((m+n)log(m+n)) Space: O(m+n)
    static void merge(int a[],int b[], int m,int n){
        int c[] = new int[m+n];
        for(int i=0;i<m;i++)
            c[i] = a[i];
        for(int i=0;i<n;i++)
            c[i+m] = b[i];
        Arrays.sort(c);
        for(int i=0;i<m+n;i++)
            System.out.print(c[i] + " ");
    }

    //efficient solution Time: O(m+n) Space: O(1)
    static void mergeEfficient(int a[],int b[],int m,int n){
         int i=0,j=0;
         while(i<m && j<n){
            if(a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else{
                System.out.print(b[j]+" ");
                j++;
            }
         }
         while(i<m){
            System.out.print(a[i]+" ");
            i++;
         }
         while(j<n){
            System.out.print(b[j]+" ");
            j++;
         }
    }
}
