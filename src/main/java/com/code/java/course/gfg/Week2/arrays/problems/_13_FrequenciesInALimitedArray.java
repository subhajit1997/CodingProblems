package com.code.java.course.gfg.Week2.arrays.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _13_FrequenciesInALimitedArray {
    public static void main(String[] args) {
        System.out.println(frequencyCount(new int[]{2, 3, 2, 3, 5}));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
       List<Integer> res = new ArrayList<>(Collections.nCopies(n,0));
       for(int val : arr){
           if(val>=1 && val<=arr.length)
           {
               res.set(val-1,res.get(val-1)+1);
           }
       }
       return res;
    }
}
