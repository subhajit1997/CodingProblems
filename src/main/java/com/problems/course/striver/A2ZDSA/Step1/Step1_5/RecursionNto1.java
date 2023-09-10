package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

import java.util.Arrays;

/**https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 *
 */
public class RecursionNto1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNos(5)));
    }
    public static int[] printNos(int x) {
        int[] val = new int[x];
        recursion(val,x,0);
        return val;
    }
    public static void recursion(int[] val,int i,int j){
        if(i==0)
            return;
        val[j]=i;
        recursion(val, --i, ++j);
    }

}
