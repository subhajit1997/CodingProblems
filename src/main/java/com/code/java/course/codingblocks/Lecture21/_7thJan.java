package com.code.java.course.codingblocks.Lecture21;

public class _7thJan {
    public static void main(String[] args) {
        /*
            Q)Take as input N1 and N2 both numbers N 1 and N 2 is the number of rows and columns on a rectangular board our player starts in top left corner of the board and must reach bottom right corner in one move the player can move one step horizontally right or one step vertically down or one step diagonally southeast write a recursive function which returns the count of different ways the player can travel across the board and print moves for all valid paths across the board

            sub-problem: changing cell V and H
        */
        int n1=3;
        int m1=3;
        System.out.println("mazePath");
        mazePath(1,1,n1,m1,"");

        /*
            1D board, Take as input in a number N is the size of a snakes and ladders board without any snakes and ladders take as input MA number M is the number of faces of the dice write a recursive function which returns the count of different ways the board can be traversed using the device write a recursive function which prints dice values for all valid paths across the board

            repeated-subproblem: i take a step and recursion tell me all other ways to reach N.
        */
       int n2 = 3;
       int m2=3;
       if(m2>n2)
            m2=n2;
       System.out.println("boardProblem");
       boardProblem(0,n2,m2,"");

/*
        
     */
    System.out.println("findPermutation");
    findPermutation("abc","");

    //To-DO: find all distinct permutation for "aba"
        
    }

    private static void findPermutation(String input, String ans) {
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String rest = input.substring(0, i) + input.substring(i + 1);
            findPermutation(rest,ans+ch);
        }
    }

    private static void boardProblem(int i, int n,int m, String ans) {
        if(i==n){ //positive base case
            System.out.println(ans);
            return;
        }
        if(i>n){ //-ve base case
            return;
        }
        for (int j = 1; j <=m; j++) { //every frame in a board has m faced dice
            boardProblem(i+j,n,m,ans+j);
        }

    }

    private static void mazePath(int currentRow, int currentCol, int n, int m, String ans) {
        if(currentRow==n && currentCol==m){ //+ve base case
            System.out.println(ans);
            return;
        }
        if(currentRow>n || currentCol>m) //-negative base case
            return;
        mazePath(currentRow+1,currentCol,n,m,ans+"V");  //Vertical
        mazePath(currentRow,currentCol+1,n,m,ans+"H"); //horizonal
        mazePath(currentRow+1,currentCol+1,n,m,ans+"D"); //diagonal
    }
}
