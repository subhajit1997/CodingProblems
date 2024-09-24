package com.code.java.company.Lenskart;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/studio/problems/minimize-the-maximum_696194?interviewProblemRedirection=true
 */
public class MinimiseTheMaxmimum {
    public static void main(String[] args) {

    }
    public static int minimizeMaximum(int []arr, int n, int k)
    {
        //this if is used to optimise
        if(n==1)
            return 0;
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int max,min;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)
                continue;
            max = Math.max(arr[i-1]+k,arr[n-1]-k); //current & last adjusted by k
            min = Math.min(arr[0]+k,arr[i]-k); //first and current adjusted by k
            ans = Math.min(ans,max-min);
        }
        return ans;

    }
}
