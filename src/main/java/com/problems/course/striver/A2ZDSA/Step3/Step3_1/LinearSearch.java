package com.problems.course.striver.A2ZDSA.Step3.Step3_1;

/**
 * practice: https://www.codingninjas.com/studio/problems/linear-search_6922070?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 *
 * learn: https://takeuforward.org/data-structure/linear-search-in-c/
 */
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(5,4,new int[]{6,7,8, 4, 1}));
    }
    public static int linearSearch(int n, int num, int []arr){
        if(n<=0)
            return -1;
        int val=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                val=i;
                break;
            }
        }
        return val;
    }
}
