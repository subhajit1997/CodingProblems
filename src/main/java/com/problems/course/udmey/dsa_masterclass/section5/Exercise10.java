package com.problems.course.udmey.dsa_masterclass.section5;

/**
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5106942#overview
 *
 * Max Product of Two Integers
 * How to find maximum product of two integers in the array where all elements are positive.
 *
 * Example
 *
 * int[] intArray = {10,20,30,40,50};
 * maxProduct(intArray) // (40,50)
 */
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10,20,30,40,50}));
    }
    public static String maxProduct(int[] intArray) {
        int maxResult=0;
        String pair=null;
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if((intArray[j]*intArray[i])>maxResult){
                    maxResult = intArray[j]*intArray[i];
                    pair = Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
                }else
                    continue;
            }
        }
        return pair;
    }
}
