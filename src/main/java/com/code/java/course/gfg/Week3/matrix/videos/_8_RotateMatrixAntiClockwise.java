package com.code.java.course.gfg.Week3.matrix.videos;

public class _8_RotateMatrixAntiClockwise {
    public static void main(String[] args) {
        int [][]mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate90(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    //naive approach Time complexity O(n^2) and space complexity O(n^2)
    static void rotate90(int [][]mat){
        int n = mat.length;
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[n-j-1][i] = mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = temp[i][j];
            }
        }
    }

    //Efficient Time :O(N^2) and space :O(1)
    // 90 degree rotate = transpose + reverse
    static void rotate90Optimised(int [][]mat){
        int n = mat.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //reverse coloums
        for(int i=0;i<n;i++){
            int low =0,high = n-1;
            while(low<high){
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
    }
}
