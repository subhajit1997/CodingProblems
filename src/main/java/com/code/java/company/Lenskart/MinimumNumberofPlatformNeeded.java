package com.code.java.company.Lenskart;

import java.util.Arrays;

/**
 * practice: https://www.codingninjas.com/studio/problems/minimum-number-of-platform-needed_696322?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
 * learn: https://www.youtube.com/watch?v=dxVcMDI7vyI
 */
public class MinimumNumberofPlatformNeeded {
    public static void main(String[] args) {

    }
    public static int platformsNeeded(int[] arrival, int[] departure, int n) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform=1,result=1;

        int i=1,j=0;
        while(i<n && j<n){
            if(arrival[i]<=departure[j]){
                i++;
                platform++;
            }else if(arrival[i]>departure[j]){
                platform--;
                j++;
            }
            result = Math.max(result,platform);
        }
        return result;

    }

}
