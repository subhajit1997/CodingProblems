package com.problems.course.udmey.dsa_masterclass.section5;

/**https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5108884#overview
 * Permutation
 * Your are given two integer arrays. Write a program to check if they are permutation of each other.
 *
 * Example
 *
 * int[] array1 = {1,2,3,4,5};
 * int[] array2 = {5,1,2,3,4};
 * permutation(array1, array2)
 * Output
 *
 * true
 */
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(permutation(new int[]{1,2,3,4,5},new  int[]{5,1,2,3,4}));
    }
//  O(n^2)
//    public static boolean permutation(int[] array1, int[] array2){
//        if(array1.length!=array2.length)
//            return false;
//        for(int i=0;i<array1.length;i++){
//            for(int j=0;i<array1.length;j++){
//                if(array1[i]==array2[j])
//                    break;
//                if(j==(array1.length-1))
//                    return false;
//            }
//        }
//        return true;
//    }
    public static boolean permutation(int[] array1, int[] array2){
        int sum1=0,sum2=0;
        int mul1=1,mul2=1;
        for (int val:array1) {
            sum1+=val;
            mul1*=val;
        }
        for (int val:array2) {
            sum2+=val;
            mul2*=val;
        }
        if(sum1==sum2 && mul1==mul2)
            return true;
        return false;
    }
}
