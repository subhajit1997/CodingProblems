package com.code.java.course.gfg.Week2.recursion.videos;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        System.out.println(ropeCuttingRecursive(5, 2, 5, 1));
    }

    private static int ropeCuttingRecursive(int n, int a,int b,int c) {

        if(n==0)
            return 0;
        if(n==-1)
            return -1;
        int res = Math.max(ropeCuttingRecursive(n-a,a,b,c),
                    Math.max(ropeCuttingRecursive(n-b, a, b, c), 
                    ropeCuttingRecursive(n-c, a, b, c)));
        if(res==-1)
            return -1;
        return res+1;
    }
}
