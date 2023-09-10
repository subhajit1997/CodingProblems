package com.problems.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.Arrays;

/**
 * learn:
 * practice: https://leetcode.com/problems/rotate-image/submissions/
 */
public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] val = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("input:");
        for (int[] ints : val) {
            System.out.println(Arrays.toString(ints));
        }
        rotate(val);
        System.out.println("output:");
        for (int[] ints : val) {
            System.out.println(Arrays.toString(ints));
        }
        int[][] val1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateOptimised(val1);

    }
    //Brute force
    //using extra array
    //O(N*N)
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] dummy = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dummy[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=dummy[i][j];
            }
        }
    }
    // Optimal
    //Without using memory in place
    public static void rotateOptimised(int[][] matrix) {
        System.out.println("Input");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        System.out.println("output");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
