package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_3;

import java.util.ArrayList;

/** learn:https://takeuforward.org/data-structure/rat-in-a-maze/
 * practice: https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
 *
 *Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
 * Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell
 *
 */
public class _4RatInAMaze {
    public static void main(String[] args) {
        System.out.println(findPath(new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}},4));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        int[][] visit = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                visit[i][j]=0;
            }
        }
        ArrayList<String> result = new ArrayList<>();
        if(m[0][0]==1)
            solve(0,0,m,n,result,"",visit);
        return result;
    }
    public static void solve(int i, int j, int[][] m, int n, ArrayList<String> result, String move, int[][] visit){
        if(i==n-1 && j==n-1){
            result.add(move);
            return;
        }
        //down
        if(i+1<n && visit[i+1][j]==0 && m[i+1][j] ==1){
            visit[i][j] = 1;
            solve(i+1,j,m,n,result,move+"D",visit);
            visit[i][j] = 0;
        }

        //left
        if(j-1>=0 && visit[i][j-1]==0 && m[i][j-1] ==1){
            visit[i][j] = 1;
            solve(i,j-1,m,n,result,move+"L",visit);
            visit[i][j] = 0;
        }
        //right
        if(j+1<n && visit[i][j+1]==0 && m[i][j+1] ==1){
            visit[i][j] = 1;
            solve(i,j+1,m,n,result,move+"R",visit);
            visit[i][j] = 0;
        }
        //up
        if(i-1>=0 && visit[i-1][j]==0 && m[i-1][j] ==1){
            visit[i][j] = 1;
            solve(i-1,j,m,n,result,move+"U",visit);
            visit[i][j] = 0;
        }
    }
}
