package com.code.java.course.striver.A2ZDSA.Step4.Step4_2;

public class _3KokoEatingBananas {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11},8));
        System.out.println(minEatingSpeedOptimised(new int[]{3,6,7,11},8));

    }

    //brute force approach may result in time limit exceed
    public static int minEatingSpeed(int[] piles, int h) {
        int max = findMax(piles);
        for(int i=1;i<=max;i++){
            int val = calculateMin(piles,i);
            if(val<=h)
                return i;
        }
        return -1;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
    public static int calculateMin(int[] arr,int n){
        int total =0;
        for(int i=0;i<arr.length;i++){
            total +=Math.ceil((double)arr[i]/(double)n);
        }
        return total;
    }

    //using optimised binary search approach
    public static int minEatingSpeedOptimised(int[] piles, int h) {
        int high = findMax(piles);
        int low=0;
        while(low<=high){
            int mid = (low+high)/2;
            int total = calculateMin (piles,mid);
            if(total<=h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

}
