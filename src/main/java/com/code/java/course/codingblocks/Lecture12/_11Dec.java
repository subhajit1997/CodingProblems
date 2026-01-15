package com.code.java.course.codingblocks.Lecture12;

import java.util.Arrays;

public class _11Dec {
    public static void main(String[] args) {
        // 10000 1
        // x^k=n
        // x^1 = 10,000

        /*
            x^4<= 696
            max, x = 5
        */
        System.out.println(findValueOfX(4,696));

        /*
            Agressive cows)
            You are given n stalls positioned at specifiuc distances along a straight line .your task is to place c cows in these stalls such that the min distance between two cows is maximum
        */
        System.out.println(findMaxMinAgressiveCows(new int[]{1,2,9,4,8},5,3));
       

    }

    private static int findMaxMinAgressiveCows(int[] stall, int noStall, int noCow) {
        Arrays.sort(stall);
        int low=1;
        int ans=0;
        int high = stall[stall.length-1]-stall[0];
        while (low<=high) {
            int mid = (low+high)/2;
            if(isItpossible(stall,mid,noStall,noCow)){
                ans = mid;
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static boolean isItpossible(int[] stall, int mid, int noStall, int noCow) {
        int place = stall[0];
        int cowPlaceSoFar = 1;
        for (int i = 0; i < stall.length; i++) {
            if(stall[i]-place>=mid){ //can place next cow on i
                place = stall[i];
                cowPlaceSoFar++;
            }
            if(cowPlaceSoFar==noCow){
                return true;
            }
        }
        return false;
    }

    private static long findValueOfX(int k, int n) {
        long low = 1;
        long high = n;
        long ans=0;
        while (low<=high) {
            long mid = (low+high)/2;
            if(Math.pow(mid, k)<=n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
