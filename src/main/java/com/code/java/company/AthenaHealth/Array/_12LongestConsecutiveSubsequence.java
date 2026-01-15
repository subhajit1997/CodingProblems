package com.code.java.company.AthenaHealth.Array;


public class _12LongestConsecutiveSubsequence {
    public static void main(String[] args) {
    int[] arr = {100, 200, 1, 2,3, 4};
    int n = arr.length;
    int maxLength = 1, start =0,end =0;
    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
         boolean isIncreasing = true;
         for(int k=i+1;k<=j;k++){
            if(arr[k]<=arr[k-1]){
               isIncreasing =false;
               break;
            }
         }
         if(isIncreasing && (j-i+1)>maxLength){
            maxLength = j-i+1;
            start =i;
            end=j;
         }
      }
    }
    for(int i=0;i<maxLength;i++){
      System.out.print( arr[start+i]+" ");
    }
   }
}
