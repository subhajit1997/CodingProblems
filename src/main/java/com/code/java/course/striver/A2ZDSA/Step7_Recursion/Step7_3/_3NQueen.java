package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_3;

import java.util.ArrayList;
import java.util.List;

/**<IMPORTANT>
 * practice: https://leetcode.com/problems/n-queens/description/
 * learn: https://takeuforward.org/data-structure/n-queen-problem-return-all-distinct-solutions-to-the-n-queens-puzzle/
 */
public class _3NQueen {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    /*
    Every row have 1 Queen
    Every column have 1 Queen
    None of the Queen attack each other
    Time - O(N!*N)
    Space: O(N^2)
     */
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        dfs(0,board,result);
        return result;
    }
    public static void dfs(int col ,char[][] board,List<List<String>> result){
        if(col==board.length){
            result.add(constructedBoard(board));
            return;
        }
        for(int row =0;row<board.length;row++){
            if(validate(row,col,board)){
                board[row][col] = 'Q';
                dfs(col+1,board,result);
                board[row][col] = '.';
            }
        }
    }
    public static List<String> constructedBoard(char[][] board){
        List<String> res= new ArrayList<>();
        for (char[] chars : board) {
            String s = new String(chars);
            res.add(s);
        }
        return res;
    }

    //time - O(N)
    public static boolean validate(int row,int col,char[][] board){
        int tempRow= row;
        int tempCol=col;

        //diagonal check ie top-left
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }
        row= tempRow;
        col = tempCol;
        //left check
        while(col>=0){
            if(board[row][col] =='Q')
                return false;
            col--;
        }
        row= tempRow;
        col = tempCol;

        //diagonal check ie bottom-left
        while(col>=0 && row<board.length){
            if(board[row][col] =='Q')
                return false;
            row++;
            col--;
        }
        return true;
    }
}
