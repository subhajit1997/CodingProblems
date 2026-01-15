package com.code.java.course.gfg.Week3.sorting.videos;

public class _12_MergeFunctionOfMergeSort {
    public static void main(String[] args) {
        int a[] = {10,20,40,20,30};
        merge(a,0,2,4);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void merge(int a[],int low,int mid,int high){
        int n1= mid-low+1;
        int n2= high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = a[low+i];
        for(int i=0;i<n2;i++)
            right[i] = a[mid+i+1];
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k] = left[i];
                i++;
            }else{
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
