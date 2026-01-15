package com.code.java.course.gfg.Week3.matrix.videos;

public class _7_TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        transpose(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int[][] mat1 = {
            {1 ,1},
            {2 ,2}
        };
        transposeEfficient(mat1);
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
    }
    //naive solution , Time : O(N^2), Space : O(N^2)
    static void transpose(int mat[][]){
        int n = mat.length;
        int[][] temp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = mat[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = temp[i][j];
            }
        }
    }
    //efficient solution , Time : O(N^2), Space : O(1)
    //in place
    static void transposeEfficient(int mat[][]){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j =i+1 ;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
