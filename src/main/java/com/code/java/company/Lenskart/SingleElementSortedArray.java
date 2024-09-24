package com.code.java.company.Lenskart;
/**
 * practice: https://www.codingninjas.com/studio/problems/unique-element-in-sorted-array_1112654?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleElementSortedArray {
    public static void main(String[] args) {

    }
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int val=0;
        for(Integer data: arr){
            val = val^ data;
        }
        return val;
    }
}
