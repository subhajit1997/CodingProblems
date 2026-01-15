package com.code.java.company.Target.TwentyFive.Array;

import java.util.Arrays;
/**
 * Given an array and number ‘n’, return the first n highest numbers without sorting it. 
 */
public class _3FirstNHighestNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstNHeight(new int[]{ 2, 1,8, 9, 7, 3, 4, 5, 6}, 3)));
    }
    static int[] firstNHeight(int[] arr,int n){
        int[] res = new int[n];
        Arrays.fill(res, Integer.MIN_VALUE);

        for(int num:arr){
            int minvalue=0;
            for(int i=1;i<n;i++){
                if(res[i]<res[minvalue]){
                    minvalue=i;
                }
            }

            if(num>res[minvalue])
                res[minvalue]=num;

            System.out.println("arr:"+Arrays.toString(arr));
            System.out.println("res:"+Arrays.toString(res));
        }
        return res;
    }
}
