package com.code.java.course.codingblocks.Lecture19;

import java.util.Arrays;
import java.util.Scanner;

public class Contest4 {
    public static void main(String[] args) {
        /*
         * 1) Arrays-Wave Print Row Wise
         * Sample Input
         * 4 4
         * 11 12 13 14
         * 21 22 23 24
         * 31 32 33 34
         * 41 42 43 44
         * Sample Output
         * 11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
         */
        int n1 = 4;
        int m1 = 4;
        int arr[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        arrayWave(n1, m1, arr);

        /*
         * Q) Arrays-Spiral Print Anticlockwise
         * Sample Input
         * 4 4
         * 11 12 13 14
         * 21 22 23 24
         * 31 32 33 34
         * 41 42 43 44
         * 
         * Sample Output
         * 11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
         */
        int n2 = 4;
        int m2 = 4;
        int arr2[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        arraySprialAntiClockWise(n2, m2, arr2);

        /*
         * Q)Arrays-Wave print Column Wise
         * Input :
         * 4 4
         * 11 12 13 14
         * 21 22 23 24
         * 31 32 33 34
         * 41 42 43 44
         * 
         * Sample Output: 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24,14, END
         */

        int n3 = 4;
        int m3 = 4;
        int arr3[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        arrayPrintColumnWise(arr3);

        /*
         * Q)Matrix Search
         * Given an n x m matrix, where every row and column is sorted in increasing
         * order, and a number x . Find if element x is present in the matrix or not.
         */

        int n4 = 3;
        int m4 = 3;
        int arr4[][] = { { 3, 30, 38 }, { 44, 52, 54 }, { 57, 60, 69 } };
        int k4 = 62;
        System.out.print(searchMatrix(arr4, k4));

        /*
            Q)Arrays-Spiral Print Clockwise

        */

        int n5 = 4;
        int m5 =4;
        int arr5[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        printSprialMatrixClockwise(arr5);

        /*
            Q)Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

            Sample Input:
            4
            1 2 3 4
            5 6 7 8
            9 10 11 12
            13 14 15 16

            Sample Output
            4 8 12 16 
            3 7 11 15 
            2 6 10 14 
            1 5 9 13 

            a[0][0] a[0][1] a[0][2]
            a[1][0] a[1][1] a[1][2]
            a[2][0] a[2][1] a[2][2]

            Transopose + row elelemt reverse > 90-degree anticlockwise

            a[0][2] a[1][2] a[2][2]
            a[0][1] a[1][1] a[2][1]
            a[0][0] a[1][0] a[2][0]
            
        */
        int n6 = 4;
        int arr6[][] = {{1, 2 ,3, 4},{5, 6 ,7 ,8},{9, 10 ,11 ,12},{13 ,14 ,15 ,16}};
        rotateMatrixAntiClockWise(arr6);
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[0].length; j++) {
                System.out.print(arr6[i][j]+" ");
            }
            System.out.println();
        }
        /*
            Q)
        */
        int n7 = 4;
        int m7=4;
        int k7 = 5;
        int s7 = 20;
        char arr7[][] = {{'.' ,'.' ,'*', '.'},{'.','#', '.','.'},{'*' ,'*' ,'.' ,'.'},{'.' ,'#' ,'*' ,'*'}};
        piyushAndMagicalPark(arr7,k7,s7);

        /*
            Q)Transpose of a square matrix
        */
        int n8 =5;
        int[][] arr8 = {{1,46, 4 ,60 ,100 },{28 ,52,97 ,80 ,59 },{6 ,33 ,62, 42, 12 },{57, 31,56 ,89 ,47 },{1 ,50, 73, 53 ,99 }};
        transposeSquarematrix(arr8);
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[0].length; j++) {
                System.out.print(arr8[i][j]+" ");
            }
            System.out.println();
        }

        /*
            Q)Rowwise sort matrix
        */
       System.out.println("Rowwise sort matrix");
        int r9 = 4;
        int c9 = 5;
        int[][] arr9 = {{13, 5 ,13 ,9 ,11 },{5 ,10 ,11 ,4 ,6 },{6, 10 ,17, 12 ,16 },{8, 11, 7, 18, 5 }};
        sortEachRowMatrix(arr9);
        for (int i = 0; i < arr9.length; i++) {
            for (int j = 0; j < arr9[0].length; j++) {
                System.out.print(arr9[i][j]+" ");
            }
            System.out.println();
        }
        /*
            Q)Mummy's motivational speech- find if zero above the main diagonal

        */
       System.out.println("checkIfLowertriangularMatrixIsSquare");
        int n10 = 4;
        int[][] arr10 = {{374 ,0 ,0 ,0},{761 ,60 ,0 ,0},{578 ,531 ,878, 0 },{75 ,10 ,197 ,198}};
        System.out.println(checkIfLowertriangularMatrixIsSquare(arr10));
        /*
            Q)KTH ROOT 
            You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

        */
        int t11=1;
        for (int i = 0; i < t11; i++) {
            long n11 = 1000000000000000l;
            long k11 = 10;
            System.out.println(findKthRoot(n11,k11));          
        }

        /*
            13 Q)Find Square Root
                Implement squareroot(x).
                Compute and return the square root of x.
                If x is not a perfect square, return floor(sqrt(x)).
                Note: DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
        */
        
        long a13 = 25;
        System.out.println(findSquareRoot(a13));
        /*
            14 Q)Aggressive Cows-You are given n stalls positioned at specific distances along a straight line.Your task is to place c cows in these stalls such that the minimum distance betweeany two cows is maximized.
            stalls  |1   2   4   8   9
            cows    |

        */
        
        int n14 = 5;
        int c14 = 3;
        int arr14[] = {1,2,9,4,8};
        Arrays.sort(arr14);
        System.out.println(aggressiveCowsFindMinDistance(n14,c14,arr14));

        /*
            15 Q)Painter's Partition Problem-
                Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.
        */
        
        int k15 = 2;//num of painters
        int n15 =2;//no of boards
        int lengthOfBoard[] = {1,10};
        System.out.println(findMinAmountTimePaintAllBoards(k15,n15,lengthOfBoard));

        /*
            16 Q)Book Allocation Problem-You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
        */
        
        int t16 = 1;
        for (int i = 0; i < t16; i++) {
            int n16 = 4; //no of pages
            int m16 =2; //number of students
            int pages[] = {12,34,67,90};
            System.out.println(findMaxNumPagesAssignedToStudentIsMin(n16,m16,pages));
        }
        /*
            17 Q)Column with maximum sum in a Matrix
        */
       System.out.println("findMaxiumSumOfColumn");
        
        int n17 =3;
        int[][] arr17 = {{90 ,40 ,1},{48 ,72, 67},{22 ,37 ,47}};
        int[] val = findMaxiumSumOfColumn(arr17);
        System.out.print(val[0]+" ");
        System.out.print(val[1]);

        /*
            Q)A Boolean Matrix
                -Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
        */
        
        int n18 = 2;
        int m18 = 2;
        int[][] arr18 = {{1,1},{1,0}};
        booleanMatrixUpdate(arr18);

        /*
            Q)  Print Upper Triangular Matrix
                -   You are given a 2-D array and you have to print the elements of upper triangle as it is and zero in the lower triangle.
        */
        
        int n19 = 3;
        int arr19[][] = {{1 ,2 ,3},{4 ,5 ,6},{7, 8 ,9}};
        printUpperTriangleMatrix(arr19);

        /*
            12 Q)Murthal Parantha:
            The coding blocks members went to the success party of their first ever online boot-camp at Murthal. They ordered P number of paranthas. The stall has L cooks and each cook has a rank R. A cook with a rank R can cook 1 parantha in the first R minutes 1 more parantha in the next 2R minutes, 1 more parantha in 3R minutes and so on(he can only cook a complete parantha) ( For example if a cook is ranked 2.. he will cook one parantha in 2 minutes one more parantha in the next 4 mins and one more in the next 6 minutes hence in total 12 minutes he cooks 3 paranthas. In 13 minutes also he can cook only 3 paranthas as he does not have enough time for the 4th parantha). Calculate the minimum time needed to cook all the paranthas.
        */
        Scanner sc = new Scanner(System.in);
        int numOfParatha = sc.nextInt();
        int numOfCooks = sc.nextInt();
        int[] rankOfCook = new int[numOfCooks];
        for (int i = 0; i < rankOfCook.length; i++) {
            rankOfCook[i] =sc.nextInt();
        }
        System.out.println(minTimeNeededToCookAllParathas(numOfParatha,numOfCooks,rankOfCook));

    }

    private static int minTimeNeededToCookAllParathas(int numOfParatha, int numOfCooks, int[] rankOfCook) {
        int low =0;
        int maxRank = Integer.MIN_VALUE;
        for (int r : rankOfCook) {
            maxRank = Math.max(r, maxRank);
        }
        int high = maxRank *(numOfParatha * (numOfParatha+1))/2; //we need total time 
        int ans =-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(isPossible(rankOfCook,mid,numOfParatha)){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] rankOfCook, int mid, int numOfParatha) {
        int cookedParathas = 0;
        for (int i = 0; i < rankOfCook.length; i++) {
            int currentTime =0;
            int j=1; //paratha nuymber
            while (true) {
                currentTime+=rankOfCook[i]*j;
                if(currentTime>mid){
                    break;
                }
                cookedParathas++;
                j++;
            }
            if(cookedParathas>=numOfParatha){
                return true;
            }
        }
        return false;
    }

    private static void printUpperTriangleMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void booleanMatrixUpdate(int[][] arr) {
    int rows = arr.length;
    int cols = arr[0].length;

    boolean firstRowHasOne = false;
    boolean firstColHasOne = false;

    for (int j = 0; j < cols; j++) {
        if (arr[0][j] == 1) {
            firstRowHasOne = true;
            break;
        }
    }

    for (int i = 0; i < rows; i++) {
        if (arr[i][0] == 1) {
            firstColHasOne = true;
            break;
        }
    }

    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (arr[i][j] == 1) {
                arr[i][0] = 1;
                arr[0][j] = 1;
            }
        }
    }

    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (arr[i][0] == 1 || arr[0][j] == 1) {
                arr[i][j] = 1;
            }
        }
    }

    if (firstRowHasOne) {
        for (int j = 0; j < cols; j++) arr[0][j] = 1;
    }

    if (firstColHasOne) {
        for (int i = 0; i < rows; i++) arr[i][0] = 1;
    }

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    }

    private static int[] findMaxiumSumOfColumn(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxcol = 0;
        for (int c = 0; c < arr.length; c++) {
            int sum=0;
            for (int r = 0; r < arr.length; r++) {
                sum += arr[r][c];
                System.out.print(arr[r][c]+" ");
            }
            if(sum>maxSum){
                maxSum = sum;
                maxcol = c;
            }
            System.out.println();
        }
        return new int[]{maxcol+1,maxSum};
    }

    private static int findMaxNumPagesAssignedToStudentIsMin(int n, int m, int[] pages) {
        int low=0;
        int high=0;
        for (int i = 0; i < pages.length; i++) {
            high+=pages[i];
        }
        int ans =-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(isPossibleAssignBook(n,m,mid,pages)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossibleAssignBook(int n, int m, int mid, int[] pages) {
        int currentStudent =1;
        int pages_read  =0;
        for (int i = 0; i < pages.length;) {
            if(pages_read+pages[i]<=mid){
                pages_read +=pages[i];
                i++;
            }else{
                currentStudent++;
                pages_read=0;
            }
            if(currentStudent>m){
                return false;
            }
        }
        return true;
    }

    private static int findMinAmountTimePaintAllBoards(int numPainter, int numBoard, int[] lengthOfBoard) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < lengthOfBoard.length; i++) {
            high+=lengthOfBoard[i];
        }
        int ans =-1; //as 0 can be part of ans
        while (low<=high) {
            int mid = (low+high)/2;
            if(isPossibleToPaint(numPainter,mid,lengthOfBoard)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossibleToPaint(int numPainter, int mid, int[] lengthOfBoard) {
        int currentpainter =1;
        int boardpainted =0;
        for (int i = 0; i < lengthOfBoard.length;) {

            if(boardpainted+lengthOfBoard[i]<=mid){
                boardpainted  += lengthOfBoard[i];
                i++;
            }else{
                currentpainter++;
                boardpainted =0;
            }
            if(currentpainter>numPainter){
                return false;
            }
        }
        return true;
    }

    private static int aggressiveCowsFindMinDistance(int n, int c, int[] arr) {
        int low = 1;
        int high = arr[arr.length-1]-arr[0];
        int ans=0;
        while (low<=high) {
            int mid = (low+high)/2;
            if(isItPossible(n,c,mid,arr)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static boolean isItPossible(int n, int c, int mid, int[] arr) {
        int place = arr[0];
        int cowPlacedSoFar = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-place>=mid){//i can place next cow on i
                place=arr[i];
                cowPlacedSoFar++;
            }
            if(cowPlacedSoFar==c){
                return true;
            }
        }
        return false;

    }

    private static long findSquareRoot(long a) {
        long low = 0;
        long high = a;
        long ans =0;
        while (low<=high) {
            long mid = (low+high)/2;
            if(mid*mid<=a){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static long findKthRoot(long n, long k) {
        // x^k <= n.
        long low =0;
        long high = n;
        long ans = 0;
        while (low<=high) {
            long mid = (low+high)/2;
            if(Math.pow(mid, k)<=n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;

    }

    private static boolean checkIfLowertriangularMatrixIsSquare(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i][j]!=0)
                    return false;
            }
        }
        return true;
    }

    private static void sortEachRowMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length-j-1; k++) {
                    if(arr[i][k]>arr[i][k+1]){
                        int temp = arr[i][k];
                        arr[i][k] =arr[i][k+1];
                        arr[i][k+1]=temp;
                    }
                }
            }
        }
    }

    private static void transposeSquarematrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] =arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    private static void piyushAndMagicalPark(char[][] arr, int finalK, int startStrength) {
        int strength=startStrength;
        for (int i = 0; i < arr.length; i++) {
            if(strength<finalK){
                System.out.println("No");
                return;
            }
            for (int j = 0; j < arr[0].length; j++) {
                char ch = arr[i][j] ;
                if(ch=='.')
                    strength=strength-2;
                else if(ch=='*')
                    strength = strength+5;
                else if(ch=='#')
                    break;
                if(j!=arr[0].length-1)
                    strength = strength-1;
                //System.out.println("char: "+ch+" strength:"+strength+" row: "+i+" strp: "+j);
                
            }
            //System.out.println("strength "+i+" row "+" is: "+strength);
        }
        if(strength>finalK){
            System.out.println("Yes");
            System.out.println(strength);
        }else{
            System.out.println("No");
        }
    }

    private static void rotateMatrixAntiClockWise(int[][] arr) {
        //Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;
            }
        }
        //reverse elements in each row
        for (int i = 0; i < arr.length; i++) {
            int start =0;
            int end = arr.length-1;
            while (start<end) {
                int temp = arr[start][i];
                arr[start][i] = arr[end][i];
                arr[end][i] = temp;
                start++;
                end--;
            }
        }
    }

    private static void printSprialMatrixClockwise(int[][] arr) {
        int minCol =0;
        int maxCol = arr[0].length-1;
        int minRow=0;
        int maxRow = arr.length-1;
        int count=0;
        int total = arr[0].length*arr.length;
        while (count<total) {
            for (int c = minCol; c <=maxCol && count<total; c++) {
                System.out.print(arr[minRow][c]+", ");
                count++;
            }
            minRow++;
            for (int r = minRow; r <=maxRow && count<total; r++) {
                System.out.print(arr[r][maxCol]+", ");
                count++;
            }
            maxCol--;
            for (int c = maxCol; c>=minCol && count<total; c--) {
                System.out.print(arr[maxRow][c]+", ");
                count++;
            }
            maxRow--;
            for (int r = maxRow; r>=minRow && count<total; r--) {
                System.out.print(arr[r][minCol]+", ");
                count++;
            }
            minCol++;
        }
        System.out.print("END");
    }

    private static int searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return 1;
                } else if (matrix[i][j] > target) {
                    break;
                }
            }
        }
        return 0;
    }

    private static void arrayPrintColumnWise(int[][] arr) {
        for (int c = 0; c < arr[0].length; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + ", ");
                }
            } else {
                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + ", ");
                }
            }
        }
        System.out.print("END");
    }

    private static void arraySprialAntiClockWise(int n, int m, int[][] arr) {
        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int count = 0;
        while (count < total) {
            // left column: top -> bottom
            for (int r = minRow; r <= maxRow && count < total; r++) {
                System.out.print(arr[r][minCol] + ", ");
                count++;
            }
            minCol++;
            // bottom row: left -> right
            for (int c = minCol; c <= maxCol && count < total; c++) {
                System.out.print(arr[maxRow][c] + ", ");
                count++;
            }
            maxRow--;
            // right column: bottom -> top
            for (int r = maxRow; r >= minRow && count < total; r--) {
                System.out.print(arr[r][maxCol] + ", ");
                count++;
            }
            maxCol--;
            for (int c = maxCol; c >= minCol && count < total; c--) {
                System.out.print(arr[minRow][c] + ", ");
                count++;
            }
            minRow++;
        }
        System.out.print("END");
    }

    private static void arrayWave(int n, int m, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}
