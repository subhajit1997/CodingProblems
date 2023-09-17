package com.code.java.course.udmey.dsa_masterclass.section5;

/**https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5108876#overview
 *
 * IsUnique / Contains Duplicate - LeetCode 217
 * Write a program to check if an array is unique or not.
 *
 * Example
 *
 * int[] intArray = {1,2,3,4,5,6};
 * isUnique(intArray) // true
 */
public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(isUnique(new int[]{1,2,3,4,5,6}));
    }
    public static boolean isUnique(int[] intArray) {
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[j]==intArray[i]){
                    return false;
                }
            }
        }
        return true;
    }

}
