package com.code.java.course.codingblocks.Lecture24;

import java.util.ArrayList;
import java.util.List;

public class _14thJan {
    public static void main(String[] args) {
        //word search
        //sub-problem for recursion:We pass first char and rest recursion checks
        //require board as we need to keep track of target 
        int[][] arr={{'A','B','C','E'},{'S','F','C','C'},{'A','D','E','E'}};
        String target = "ABCCED";
        System.out.println(wordSearch(arr,target));

        //palindrome partioning
        //given a string s , partition s such that every substring of a partition is palindrome,return all posibble palindrome partitions of s 
        
        //sub-problem: i give a valid palindomre patition and recursion give me the rest of valid partitions
        palindromePalindrome("nitin","");


        //just return in list for leetcode
        _14thJan sol = new _14thJan();
         System.out.println(sol.partition("aab").toString());
    }
    List<List<String>> ans;
    public List<List<String>> partition(String s){
        ans = new ArrayList<>();
        palindromePalindromeList(s,new ArrayList<>());
        return ans;

    }
    private  void palindromePalindromeList(String s, List<String> list) {
        if(s.length()==0){
            List<String> temp = new ArrayList<>(list);
            ans.add(temp);
            return;
        }
        for (int i = 1; i <= s.length(); i++) {//all partition
            String l = s.substring(0, i);
            if(ispalindrome(l)){
                list.add(l);
                palindromePalindromeList(s.substring(i),list);
                list.remove(list.size()-1); //backtracking
            }
        }
    }

    private static void palindromePalindrome(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= s.length(); i++) {//all partition
            String l = s.substring(0, i);
            if(ispalindrome(l)){
                palindromePalindrome(s.substring(i),ans+l+ "|");
            }
        }
    }

    private static boolean ispalindrome(String l) {
        int i=0;
        int j = l.length()-1;
        while (i<j) {
            if(l.charAt(i)!=l.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean wordSearch(int[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==word.charAt(0)){
                    boolean ans = recursionCheckForWord(board,word,i,j,0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean recursionCheckForWord(int[][] board, String word, int cr, int cc, int indx) {
        if(indx == word.length()){ //word found +ve base case
            return true;
        }
        if(cr<0 || cc<0 || cr>=board.length || cc>=board[0].length || board[cr][cc]!=word.charAt(indx)){
            return false;
        }
        board[cr][cc] = '*'; //mark visted
        int r[] = {1,-1,0,0};
        int c[] = {0,0,-1,1};
        // recursionCheckForWord(board,word,cr,cc+1,indx+1);
        // recursionCheckForWord(board,word,cr,cc-1,indx+1);
        // recursionCheckForWord(board,word,cr+1,cc,indx+1);
        // recursionCheckForWord(board,word,cr-1,cc,indx+1);
        for (int i = 0; i < c.length; i++) {
            boolean ans = recursionCheckForWord(board,word,cr+r[i],cc+c[i],indx+1);
            if(ans){
                return true;
            }
        }
        board[cr][cc] = word.charAt(indx); //backtracking
        return false;
    }
}
