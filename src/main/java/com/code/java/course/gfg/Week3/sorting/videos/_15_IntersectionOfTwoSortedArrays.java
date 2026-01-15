package com.code.java.course.gfg.Week3.sorting.videos;

public class _15_IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        printIntersection(new int[]{1, 2, 3,3,3, 4, 5}, new int[]{2, 3,3, 5,5,5,6}, 7, 7);
        System.out.println();
        printIntersectionEfficient(new int[]{1, 2, 3,3,3, 4, 5}, new int[]{2, 3,3, 5,5,5,6}, 7, 7);
    }
    //naive , time - O(m*n)
    static void printIntersection(int a[],int b[],int n,int m){
        for(int i=0;i<m;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        
    }

    //efficioent space , using merge sort functionality 
    static void printIntersectionEfficient(int a[],int b[],int n,int m){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
    
}
