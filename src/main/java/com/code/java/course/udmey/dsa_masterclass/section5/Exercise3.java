package com.code.java.course.udmey.dsa_masterclass.section5;


//https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5196578#overview

public class Exercise3 {
    public static void main(String[] args) {
        int[] ans = findTopTwoScores(new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0});
        for(int i :ans){
            System.out.print(i+" ");
        }
    }
    public static int[] findTopTwoScores(int[] array){
        int[] array1 = new int[2];
        int max =0;
        for (int i=0;i<array.length ;i++ ) {
            if(max<=array[i]){
                array1[1]=max;
                max = array[i];
                array1[0]=max;
            }
        }
        return array1;
    }
}
