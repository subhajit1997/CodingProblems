package com.code.java.course.udmey.dsa_masterclass.section5;

//https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5196576#overview

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(sumDiagonalElements(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    public static int sumDiagonalElements(int[][] array) {
        int size = array.length;
        int sum=0;
        for(int i=0;i<size;i++){
            sum = sum + array[i][i];
        }
        return sum;
    }
}
