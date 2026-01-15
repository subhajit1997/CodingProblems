package com.code.java.company.Target.TwentyFive.Array;

import java.util.HashSet;

/**
 * - Find & count unique elements in an integer array.
 */
public class _2FindUniqueElementsInArray {
    public static void main(String[] args) {
        System.out.println(countEachUniqueNumbers(new int[]{ 12, 10, 9, 45, 2, 10, 10, 45 }));
        System.out.println(countEachUniqueNumbersHashSet(new int[]{ 12, 10, 9, 45, 2, 10, 10, 45 }));
    }
    //using loop  , time : O(N^2)
    static int countEachUniqueNumbers(int[] arr){
        int res = 1;
        for(int i=1;i<arr.length;i++){
            int j=0;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j])
                    break;
            }
            if(i==j)
                res++;
        }
        return res;
    }
    //using hashset , time : O(N), space : O(N)
    static int countEachUniqueNumbersHashSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
