package com.code.java.course.striver.A2ZDSA.Step3.Step3_3;
/**
 * learn:https://takeuforward.org/data-structure/count-the-number-of-subarrays-with-given-xor-k/
 * practice:https://www.interviewbit.com/problems/subarray-with-given-xor/
 */

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenXOR {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 2, 2, 6, 4},6));
        System.out.println(solveBest(new int[]{4, 2, 2, 6, 4},6));

    }

    //O(N^2)
    public static int solve(int[] A, int B) {
        int count=0;
        for(int i=0;i<A.length;i++){
            int xor =0;
            for(int j =i;j<A.length;j++){
                xor = xor ^ A[j];
                if(xor==B){
                    count++;
                }
            }
        }
        return count;
    }
    public static int solveBest(int[] A, int B) {
        int n = A.length;
        int xr =0;
        int count =0;
        Map<Integer,Integer> mpp= new HashMap<>();
        mpp.put(xr,1);
        for(int i=0;i<n;i++){
            xr = xr^A[i];
            int x = xr ^B;
            if(mpp.containsKey(x)){
                count +=mpp.get(x);
            }
            if(mpp.containsKey(xr)){
                mpp.put(xr,mpp.get(xr)+1) ;
            }else{
                mpp.put(xr,1);
            }
        }
        return count;

    }


}
