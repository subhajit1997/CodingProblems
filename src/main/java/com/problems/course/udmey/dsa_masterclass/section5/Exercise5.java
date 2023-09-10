package com.problems.course.udmey.dsa_masterclass.section5;

import java.util.Arrays;

//https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5196626#overview
public class Exercise5 {
    public static void main(String[] args) {
        int[] output = removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5});
        for (int i :output){
            System.out.println(i);
        }
    }
    public static int[] removeDuplicates(int[] arr) {
        int sizeInitalArray = arr.length;
        int[] nonDuplicateArray = new  int[sizeInitalArray];
        int index = 0;

        for(int val :arr){
            boolean checkdublicate= false;
            for(int i=0;i<nonDuplicateArray.length;i++){
                if(nonDuplicateArray[i]==val){
                    checkdublicate = true;
                    break;
                }else{
                    continue;
                }
            }
            if(!checkdublicate){
                nonDuplicateArray[index++]=val;
            }
        }

        return Arrays.copyOf(nonDuplicateArray,index);
    }
}
