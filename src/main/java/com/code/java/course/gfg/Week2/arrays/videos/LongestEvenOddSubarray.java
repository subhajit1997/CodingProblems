package com.code.java.course.gfg.Week2.arrays.videos;

public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        System.out.println(findLongestEvenOddSubArray(new int[]{10,12,14,7,8}));

        System.out.println(findLongestEvenOddSubArrayEfficient(new int[]{10,12,14,7,8}));
    }

    static int findLongestEvenOddSubArray(int[] arr){
        int resultLength = 1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr=1;
            for(int j=i+1;j<n;j++){
                if(arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0)
                    curr++;
                else
                    break;
            }
            resultLength = Math.max(resultLength,curr);
        }
        return resultLength;
    }
    static int findLongestEvenOddSubArrayEfficient(int[] arr){
        int n = arr.length;
        if(n==1){
            return 1;
        }
        int resultLength = 1;
        int maxRes = 1;
        for(int i=1;i<n;i++){
            if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0){
                resultLength++;
                maxRes = Math.max(maxRes,resultLength);
            }else{
                resultLength=1; 
            }
        }
        return maxRes;
    }
}
