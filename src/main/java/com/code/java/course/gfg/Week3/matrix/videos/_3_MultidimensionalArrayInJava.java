package com.code.java.course.gfg.Week3.matrix.videos;

public class _3_MultidimensionalArrayInJava
{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},
                       {2,3,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
