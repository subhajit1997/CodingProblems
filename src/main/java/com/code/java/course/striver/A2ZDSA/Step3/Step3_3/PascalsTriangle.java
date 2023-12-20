package com.code.java.course.striver.A2ZDSA.Step3.Step3_3;

import java.util.ArrayList;
import java.util.List;

/**
 * <IMPORTANT>
 * learn:       https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/
 * practice:    https://leetcode.com/problems/pascals-triangle/submissions/
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> val1= new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            java.util.List<Integer> tempLst = new ArrayList<>();
            for(int col =1;col<=row;col++){
                tempLst.add(nCr(row-1,col-1));
            }
            val1.add(tempLst);
        }
        return val1;
    }
    public static int nCr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res= res *(n-i);
            res = res/(i+1);
        }
        return res;
    }
}
