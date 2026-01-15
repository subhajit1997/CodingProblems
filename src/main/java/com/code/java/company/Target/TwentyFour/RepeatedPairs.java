package com.code.java.company.Target;

import java.util.HashSet;

/**
 * 	• Given an array with pairs of numbers, how would you determine how many repeated pairs are in the array?
 */
public class RepeatedPairs {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 2}, {3, 4}, {1, 2}, {5, 6}, {3, 4},{3,4}};
        int count = countRepeatedPairs(input);
        System.out.println("Number of repeated pairs: " + count);
        int count1 = countRepeatedPairsWithArray(input);
        System.out.println("Number of repeated pairs: " + count1);
    }

    private static int countRepeatedPairsWithArray(int[][] input) {
        int count=0;
        int n =input.length;
        boolean[] visited=  new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(visited[j])
                    continue;
                if(input[i][0]==input[j][0] && input[i][1]==input[j][1]){
                    count++;
                    visited[j]=true;
                    break;
                }
            }
            visited[i]=true;
        }
        return count;
    }

    private static int countRepeatedPairs(int[][] input) {
        int count=0;
        HashSet<String> pairSet = new HashSet<String>();
        for(int[] pair:input){
            String value= pair[0]+"-"+pair[1];
            if(pairSet.contains(value)){
                count++;
            }else
                pairSet.add(value);
        }
        return count;
    }

}
