package com.code.java.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.ArrayList;
import java.util.List;

/**
 * learn: https://takeuforward.org/data-structure/spiral-traversal-of-matrix/
 * practice:https://leetcode.com/problems/spiral-matrix/description/
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(spiralOrder(mat).toString());

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> val = new ArrayList<>();
        int m = matrix.length; // row
        int n = matrix[0].length; //coloumn

        int top =0, bottom = m-1, left =0, right =n-1;
        while(top<=bottom && left <= right){
            // left to right
            for(int i=left;i<= right ;i++){
                val.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for(int i=top;i<=bottom;i++){
                val.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                //right to left
                for(int i=right;i>=left;i--){
                    val.add(matrix[bottom][i]);
                }
                bottom --;
            }
            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    val.add(matrix[i][left]);

                left++;
            }
        }
        return val;
    }
}
