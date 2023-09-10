package com.problems.course.udmey.dsa_masterclass.section5;
//https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5196616#overview
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new  int[]{1,2,3,4,6}));
    }
    static int findMissingNumberInArray(int[] arr) {
        int givenSum = 0;
        for(int data : arr){
            givenSum +=data;
        }
        int expectedSum = ((arr.length+1)*(arr.length+2))/2;
        return expectedSum-givenSum;
    }
}
