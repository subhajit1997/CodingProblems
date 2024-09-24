package com.code.java.company.accolite;

/**
 * https://leetcode.com/problems/first-missing-positive/submissions/1310781810/
 */
public class MissingFirstPosistiveNumberArray {
    public static void main(String[] args) {
        System.out.println(operationPositive(new int[]{3,4,-1,1}));
    }

    private static int operationPositive(int[] val) {
        int n = val.length;
        // Step 1: Place each number in its right place
        for(int i=0;i<n;i++){
            while (val[i]>0 && val[i]<=n && val[val[i]-1]!=val[i]){
                int temp = val[val[i]-1];
                val[val[i]-1] = val[i];
                val[i] =temp;
            }
        }
        // Step 2: Identify the first missing positive number
        for(int i=0;i<n;i++){
            if(val[i]!=i+1){
                return i+1;
            }
        }
        // Step 3: If all positions are correct, return n + 1
        return n+1;
    }
}
