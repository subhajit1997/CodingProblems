package com.problems.company.Target;


/**
 * Input:
 * 1 1 0 0 0
 * 1 0 0 1 1
 * 0 0 0 0 0
 * 1 0 1 0 1
 *
 * Output:
 * The expected output for this input matrix is 5, indicating that there are 5 islands present in the matrix.
 *
 * Explanation:
 *
 * The first island is located at (0, 0) and is connected to the adjacent cell at (0, 1).
 * The second island is located at (1, 0) and is connected to the adjacent cells at (1, 3) and (1, 4).
 * The third island is located at (3, 0) and is connected to the adjacent cell at (2, 0).
 * The fourth island is located at (3, 2) and is connected to the adjacent cell at (2, 2).
 * The fifth island is located at (3, 4).
 * By performing the "Connected Components" or "Flood Fill" algorithm on this input matrix, we can count and identify these 5 islands.
 */
public class IslandCounter {
    public int countIslands(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                    dfs(matrix, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] != 1) {
            return;
        }

        // Mark the current cell as visited by changing its value to -1
        matrix[row][col] = -1;

        // Explore the neighboring cells
        dfs(matrix, row - 1, col); // Up
        dfs(matrix, row + 1, col); // Down
        dfs(matrix, row, col - 1); // Left
        dfs(matrix, row, col + 1); // Right
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        IslandCounter counter = new IslandCounter();
        int islandCount = counter.countIslands(matrix);
        System.out.println("Number of islands: " + islandCount);
    }
}
