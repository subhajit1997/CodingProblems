package com.code.java.course.gfg.Week2.arrays.videos;

public class PrefixSum {
    int[] arr = new int[]{2,8,3,9,6,5,4};
    public static void main(String[] args) {
        
    }
    int getSum(int l,int r){
        int res = 0;
        for(int i=l;i<=r;i++){
            res+=arr[i];
        }
        return res;
    }
    
}
