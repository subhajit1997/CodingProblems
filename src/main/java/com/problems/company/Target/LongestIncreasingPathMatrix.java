package com.problems.company.Target;

// Java program to find the longest path in a matrix
// with given constraints

class LongestIncreasingPathMatrix {
    static int findLongestFromACell(int i, int j,int n,int m,
                                    int matrix[][], int dp[][],int prev)
    {
        // Base case
        if (i < 0 || i >= n || j < 0 || j >= m || matrix[i][j]<=prev)
            return 0;

        // If this subproblem is already solved
        if (dp[i][j] != -1)
            return dp[i][j];


        int result=0;
        // Since all numbers are unique and in range from 1
        // to n*n, there is atmost one possible direction
        // from any cell

        int choice1  =  findLongestFromACell(i, j + 1,n,m, matrix, dp,matrix[i][j]); //right

        int choice2= findLongestFromACell(i, j - 1, n,m,matrix, dp,matrix[i][j]);  //left

        int choice3=  findLongestFromACell(i - 1, j, n,m,matrix, dp,matrix[i][j]); //up

        int choice4=  findLongestFromACell(i + 1, j, n,m, matrix, dp,matrix[i][j]); //down

        // If none of the adjacent fours is one greater we
        // will take 1 otherwise we will pick maximum from
        // all the four directions
        result=Math.max(choice1, Math.max(choice2, Math.max(choice3, Math.max(choice4, result))));
        dp[i][j]=result+1;
        return dp[i][j];
    }

    // Function that returns length of the longest path
    // beginning with any cell
    static int longestIncreasingPath(int mat[][])
    {
        int n =mat.length;
        int m = mat[0].length;
        // Initialize result
        int result = 0;

        // Create a lookup table and fill all entries in it
        // as -1
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                dp[i][j] = -1;

        // Compute longest path beginning from all cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == -1) {
                    findLongestFromACell(i, j, n, m, mat, dp, -1);
                }
                // Update result if needed
                result = Math.max(result, dp[i][j]);
            }
        }

        return result;
    }
    // driver program
    public static void main(String[] args)
    {
        int matrix[][] = {{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println("Length of the longest path is " + longestIncreasingPath(matrix));
    }

}


