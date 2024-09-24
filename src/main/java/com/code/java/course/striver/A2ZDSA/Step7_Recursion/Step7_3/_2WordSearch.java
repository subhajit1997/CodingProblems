package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_3;

/**practice:https://leetcode.com/problems/word-search/description/
 * learn: https://takeuforward.org/data-structure/word-search-leetcode/
 *<IMPORTANT>
 *
 *     Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */
public class _2WordSearch {
    public static void   main(String[] args) {
        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
    }
    public static boolean exist(char[][] board, String word) {
        int m= board.length;
        int n = board[0].length;
        int index =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(index)){
                    if(recursiveStringExist(index,word,board,m,n,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean recursiveStringExist(int index,String word,char[][] board,int m,int n,int row,int coloumn){
        if(index == word.length())
            return true;
        if(row<0 || coloumn<0 ||row ==m || coloumn ==n || board[row][coloumn]!=word.charAt(index) || board[row][coloumn]=='!')
            return false;
        char c = board[row][coloumn];
        board[row][coloumn] = '!';
        //top direction
        boolean top = recursiveStringExist(index+1,word,board,m,n,row-1,coloumn);
        //right
        boolean right = recursiveStringExist(index+1,word,board,m,n,row,coloumn+1);
        //bottom
        boolean bottom = recursiveStringExist(index+1,word,board,m,n,row+1,coloumn);

        //left
        boolean left = recursiveStringExist(index+1,word,board,m,n,row,coloumn-1);
        board[row][coloumn] =c;

        return top || right || bottom|| left;

    }
}
