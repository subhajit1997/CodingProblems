package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

import java.util.Arrays;

/**https://takeuforward.org/recursion/introduction-to-recursion-understand-recursion-by-printing-something-n-times/
 *
 */
public class Recursion1toN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNos(5)));
    }
    public static int[] printNos(int x) {
        int[] arr= new int[x];
        helper(arr,x,0);
        return arr;
    }
    public static void helper(int[] arr,int x,int i){
        if(i>=x)
            return;
        arr[i]=i+1;
        helper(arr,x,i+1);
    }
}
