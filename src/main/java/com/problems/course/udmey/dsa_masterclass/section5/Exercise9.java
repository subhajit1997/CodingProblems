package com.problems.course.udmey.dsa_masterclass.section5;

/**
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5106936#overview
 *
 * Finding a Number in an Array
 * Write a program to to check if an array contains a number in Java.
 *
 * int[] intArray = {1,2,3,4,5,6};
 * searchInArray(intArray, 6); // 5
 */
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(searchInArray(new int[]{1,2,3,4,5,6},6));
    }
    public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i=0;i<intArray.length ;i++ ) {
            if(intArray[i]==valueToSearch){
                return i;
            }
        }
        return 0;
    }
}
