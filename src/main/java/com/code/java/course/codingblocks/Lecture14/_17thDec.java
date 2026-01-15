package com.code.java.course.codingblocks.Lecture14;

import java.util.Arrays;
import java.util.Scanner;

public class _17thDec {
    public static void main(String[] args) {
        /*
            2D Array -> Array of Arrays
        */
        int arr_one[] = new int[5];
        System.out.println(arr_one); //-> [I@7ad041f3      This is address of 1st elememnt of array

        int arr1[][] = new int[4][4];
        System.out.println(arr1);   // -> [[I@251a69d7     This is address of 1st elememnt of 2D array
        System.out.println(arr1[0]); //-> [I@7344699f       This is address of 1st arrays's addr

        int[] g=arr1[0] ;           // compatable type match 
        System.out.println(g[0]); //->0
        System.out.println(arr1[0][0]); //->0

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        for(int i=0;i<arr.length;i++){ //row
            for(int j=0;j<arr[0].length;j++){ //column
                arr[i][j] = sc.nextInt();
            }
        }

        //number of array created (m+1) 

        System.out.println(max(arr));
        System.out.println(find(arr,12));
        //Transpose
        transponse2DArray(arr);

        for(int i=0;i<arr.length;i++){ //row
            for(int j=0;j<arr[0].length;j++){ //column
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //print wave 
        printWave2DArray(arr);


    }

    private static void printWave2DArray(int[][] arr) {
        System.out.println("printWave2DArray");
        for(int col=0;col<arr[0].length;col++){ 
            if(col%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][col]+" ");
                }
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][col]+" ");
                }
            }
        }
        System.out.println();
    }

    private static void transponse2DArray(int[][] arr) {
        //need to swap half way , as if we run swap for all then it will be wrong as we reswap again
        for(int i=0;i<arr.length;i++){ 
            for(int j=i+1;j<arr[0].length;j++){ //we do j=i+1 as we need only 1st half swap
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
    }

    private static boolean find(int[][] arr, int val) {
        for(int i=0;i<arr.length;i++){ //row
            for(int j=0;j<arr[0].length;j++){ //column
               if(arr[i][j]==val)
                    return true;
            }
        }
        return false;
    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ //row
            for(int j=0;j<arr[0].length;j++){ //column
               max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }
}
