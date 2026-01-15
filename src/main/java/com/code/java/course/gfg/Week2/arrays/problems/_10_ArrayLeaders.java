package com.code.java.course.gfg.Week2.arrays.problems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Array Leaders
Difficulty: EasyAccuracy: 29.94%Submissions: 833K+Points: 2Average Time: 15m
You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

Examples:

Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
 */
public class _10_ArrayLeaders {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }

    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int maxVal=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxVal){
                maxVal=arr[i];
                res.add(maxVal);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
