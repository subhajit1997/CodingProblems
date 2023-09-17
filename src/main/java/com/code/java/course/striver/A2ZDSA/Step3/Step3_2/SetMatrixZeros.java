package com.code.java.course.striver.A2ZDSA.Step3.Step3_2;
/**
 * learn:https://takeuforward.org/data-structure/set-matrix-zero/
 * practice:https://leetcode.com/problems/set-matrix-zeroes/submissions/
 */

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] val = new int[][]{{1,1,1},{1,0,1},{1,1,1,}};
        setZeroes(val);
        for (int[] ints : val) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        int[][] val1 = new int[][]{{1,1,1},{1,0,1},{1,1,1,}};
        setZeroesOptimised(val1);
        for (int[] ints : val1) {
            System.out.print(Arrays.toString(ints));
        }


    }

    //Time complexity - O(M*N)
    // Brute force
    // Using extra space
    public static void setZeroes(int[][] matrix){
        int m= matrix.length; //row
        int n = matrix[0].length; //coloum

        boolean[] checkRow = new boolean[m];
        boolean[] checkCol = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    checkRow[i]= true;
                    checkCol[j]=true;
                }
            }
        }

        // Set rows and coloumn to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkRow[i] || checkCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    //OPTIMISED
    //no extra space is used in place
    public static void setZeroesOptimised(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Identify rows and columns with zeros
        int col1=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0]=0;
                    if(j==0)
                        col1=0;
                    else
                        matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        if(matrix[0][0]==0){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(col1==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }

}
