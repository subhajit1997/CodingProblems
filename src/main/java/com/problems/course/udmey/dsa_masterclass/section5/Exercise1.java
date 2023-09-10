package com.problems.course.udmey.dsa_masterclass.section5;

//https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5106458#notes

public class Exercise1 {
    public static void main(String[] args) {
        middle(new int[]{1, 2, 3, 4});
    }
    public static int[] middle(int[] array) {
        int[] output = new int[array.length-2];
        int j=0;
        for (int i=0;i<array.length ;i++ ) {
            if(i==0 || i==array.length-1 ){
                continue;
            }
            output[j++]=array[i];
        }
        return output;
    }
}
