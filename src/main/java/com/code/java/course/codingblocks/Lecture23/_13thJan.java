package com.code.java.course.codingblocks.Lecture23;

import java.util.Arrays;
import java.util.Scanner;

public class _13thJan {
    public static void main(String[] args) {
        //Q) we have a board 1D , and queen , find all posibilites of queen placeemnt in board
        //small sub-problem: i place once queen and n-1 recurssion will place
        int n=4;
        int q=2;
        boolean board[] = new boolean[n];
        recursionBoardQueenCombination(board,0,q,"");

        //for identical queens
        System.out.println("recursionBoardIdenticalQueen");
        recursionBoardIdenticalQueen(board,0,q,"",0);

        //i will go in 4 direction, recursion find the final path
        //base case: if cc==m && cr==n , then ans 
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        char arr[][] = new char[n1][m1];
        for (int i = 0; i < arr.length; i++) {
            String s = sc.next();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int ans [][] = new int[n1][m1];
        ratMaizeBlockedRecursion(arr,ans,0,0,n1-1,m1-1);

    }

    //NOT completed- rewatchvideo
    private static void ratMaizeBlockedRecursion(char[][] board, int[][] ans, int cr, int cc, int n, int m) {
        if(cr==n && cc==m){
            ans[cr][cc] = 1;
            display(ans);
        }
        if(cr<0 ||cc<0 || cr>n || cc>m || board[cr][cc]=='X'){
            return;
        }
        ans[cr][cc]=1;
        board[cr][cc]='X';
        ratMaizeBlockedRecursion(board,ans,cr+1,cc,n,m); //D
        ratMaizeBlockedRecursion(board,ans,cr-1,cc,n,m); //U
        ratMaizeBlockedRecursion(board,ans,cr,cc+1,n,m); //R
        ratMaizeBlockedRecursion(board,ans,cr,cc-1,n,m); //L
        ans[cr][cc]=0;
        board[cr][cc]='O';
    }

    private static void display(int[][] ans) {
        for (int[] is : ans) {
            System.out.println(Arrays.toString(is));
        }
    }

    private static void recursionBoardQueenCombination(boolean[] board, int qpsf, int noq, String ans) {
        if(qpsf==noq){//all queens placed
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){//empty
                board[i] =true; //queen placed on i
                recursionBoardQueenCombination(board,qpsf+1,noq,ans+"b"+i+"q"+qpsf);
                board[i] = false; //undo for backtrack
            }
        }
    }
    private static void recursionBoardIdenticalQueen(boolean[] board, int qpsf, int noq, String ans,int idx) {
        if(qpsf==noq){//all queens placed
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if(board[i]==false){//empty
                board[i] =true; //queen placed on i
                recursionBoardIdenticalQueen(board,qpsf+1,noq,ans+"b"+i+"q"+qpsf,i+1);
                board[i] = false; //undo for backtrack
            }
        }
    }
}
