package com.code.java.company.WissenTech;

import java.util.Arrays;

/**
 * learn:https://takeuforward.org/data-structure/minimum-number-of-platforms-required-for-a-railway/
 * practice:https://www.codingninjas.com/studio/problems/minimum-number-of-platforms_799400?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class _4MinimumNumberOfPlatformsRequire {
    public static void main(String[] args) {
        System.out.println(calculateMinPatforms(new int[]{900 ,940 ,950 ,1100 ,1500,1800},new int[]{910 ,1200 ,1120 ,1130 ,1900 ,2000},6));
    }

    //sort both start and end time
    //using greedy approach
    public static int calculateMinPatforms (int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int plat_needed =1;
        int result=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                plat_needed++;
                i++;
            }
            else if(at[i]>dt[j]){
                plat_needed--;
                j++;
            }
            if(plat_needed>result)
                result = plat_needed;
        }
        return result;
    }
}
