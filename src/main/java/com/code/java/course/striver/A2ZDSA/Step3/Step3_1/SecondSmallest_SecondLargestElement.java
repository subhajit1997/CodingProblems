package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.Arrays;

/**
 * learn : https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
 * practice: https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */
public class SecondSmallest_SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSecondOrderElements(7, new int[]{8, 2, 6, 3, 2, 7, 8})));
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int max=Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]>max){
                second_max = max;
                max = a[i];
            }else if(a[i]>second_max && a[i]<max){
                second_max = a[i];
            }
            if(a[i]<min){
                second_min = min;
                min = a[i];
            }else if(a[i]<second_min && a[i]>min){
                second_min = a[i];
            }
        }
        return new int[]{second_max,second_min};
    }
}
