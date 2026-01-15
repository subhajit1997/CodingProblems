package com.code.java.company.Target.TwentyFive.Array;
/**
 *  Find the average of elements in an array. (Simple iteration in Java)
 */
public class _1FindTheAverageOfElements {
    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1,2,3,4,5}));
    }
    static int findAverage(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum/arr.length  ;
    }

    
    
}
