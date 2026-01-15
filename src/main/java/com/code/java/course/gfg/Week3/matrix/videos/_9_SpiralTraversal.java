package com.code.java.course.gfg.Week3.matrix.videos;

public class _9_SpiralTraversal {
    public static void main(String[] args) {
        int [][]mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        spiralTraversal(mat);
    }
    static void spiralTraversal(int [][] mat){
        int R = mat.length;
        int C = mat[0].length;
        int top = 0, left =0,bottom = R-1 , right = C-1;
        while(top<=bottom && left<=right){
            for(int i=left ; i<=right;i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for(int i=top ; i<=bottom;i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if(top<=bottom){
                for(int i=right ; i>=left;i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom ; i>=top;i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }

}