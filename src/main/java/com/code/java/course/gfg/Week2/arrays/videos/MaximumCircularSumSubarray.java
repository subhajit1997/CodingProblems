package com.code.java.course.gfg.Week2.arrays.videos;

public class MaximumCircularSumSubarray {
    public static void main(String[] args) {
        
    }

    int maxCircularSubArray(int arr[],int n){
        int res = arr[0];
        for(int i=0;i<n;i++){
            int current_max = arr[i];
            int current_sum = arr[i];
            for(int j=1;j<n;j++){
                int index = (i+j)%n;
                current_sum +=arr[index];
                current_max = Math.max(current_max,current_sum);
            }
            res = Math.max(res,current_max);
        }
        return res;
    }
    int maxCircularSubArrayEfficient(int arr[],int n){
        //normal sum
        int max_normal = normalMaxSumUsingKadensAlgo(arr,n);
        if(max_normal<0){
            return max_normal;
        }
        //circular sum
        int arr_sum =0;
        for(int i=0;i<n;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }
        int max_circular = arr_sum+normalMaxSumUsingKadensAlgo(arr, max_normal);
        return Math.max(max_normal, max_circular);
    }
    int normalMaxSumUsingKadensAlgo(int arr[],int n){
        int res=arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<n;i++){
            maxEnding = Math.max(arr[i],maxEnding+arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
