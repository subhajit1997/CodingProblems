package com.code.java.course.gfg.Week3.matrix.videos;

public class _5_MatrixInSnakeProblem {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12}};
        printSnake(mat);
    }
    static void printSnake(int mat[][]){
        int R = mat.length;
        int C = mat[0].length;
        for(int i=0;i<R;i++){
            if(i%2==0){
                for(int j=0;j<C;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int j=C-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }

        }
    }
}
