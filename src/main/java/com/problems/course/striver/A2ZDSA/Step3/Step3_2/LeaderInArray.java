package com.problems.course.striver.A2ZDSA.Step3.Step3_2;

import java.util.ArrayList;
import java.util.List;

/**
 * learn:https://takeuforward.org/data-structure/leaders-in-an-array/
 * practice:https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */
public class LeaderInArray {
    public static void main(String[] args) {
        System.out.println(superiorElements(new int[]{10, 22, 12, 3, 0, 6}).toString());
    }
    public static List< Integer > superiorElements(int []a) {
        List<Integer> num = new ArrayList<>();
        int n = a.length;
        int currentMax = a[n-1];
        num.add(a[n-1]);
        for(int i=n-2;i>=0;i--){
            if(a[i] >currentMax){
                currentMax = a[i];
                num.add(currentMax);
            }
        }
        return num;
    }
}
