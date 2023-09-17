package com.code.java.course.udmey.dsa_masterclass.section5;

import java.util.Arrays;

/***
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5108886#overview
 *
 * Rotate Matrix
 * Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
 */
public class EXERCISE13 {
    public static void main(String[] args) {
        rotateMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
//    public static int[][] rotateMatrix(int[][] matrix) {
//        int size= matrix.length;
//        int[][] outputMatrix= new int[size][size];
//        int row=0;
//        for(int i=size-1;i>=0;i--){
//            for(int j=0;j<size;j++){
//                outputMatrix[j][row]=matrix[i][j];
//            }
//            row++;
//        }
//        System.out.println(Arrays.deepToString(outputMatrix));
//        return outputMatrix;
//    }
    // Using without any 2nd matrix
    public static boolean  rotateMatrix(int[][] matrix) {
        if(matrix.length==0 || matrix.length!=matrix[0].length) return false;
        int n =matrix.length;
        for(int layer=0;layer<n/2;layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i=first;i<last;i++){
                int offset = i-first;
                int top= matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first]= matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }

        }
        System.out.println(Arrays.deepToString(matrix));
        return true;
    }
}
