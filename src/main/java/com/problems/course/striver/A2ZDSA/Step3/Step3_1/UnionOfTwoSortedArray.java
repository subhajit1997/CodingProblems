package com.problems.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * <IMPORTANT>
 * learn: https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
 * practice:codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        System.out.println(sortedArray(new int[]{1,4,7,9},new int[]{5,7,8,9}).toString());
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> val = new ArrayList<>();
        int i=0,j=0;
        int n=a.length;
        int m=b.length;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                if(val.size()==0 || val.get(val.size()-1)!=a[i]){
                    val.add(a[i]);
                }
                i++;
            }else{
                if(val.size()==0 || val.get(val.size()-1)!=b[j]){
                    val.add(b[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(val.get(val.size()-1)!=a[i]){
                val.add(a[i]);
            }
            i++;
        }
        while(j<m){
            if(val.get(val.size()-1)!=b[j]){
                val.add(b[j]);
            }
            j++;
        }
        return val;
    }
}
