package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_3;

import java.util.Arrays;

public class _9FindRepeatingMissingNumbers {
    public static void main(String[] args) {
                System.out.println(Arrays.toString(lect3_9_bruteforce(new int[]{3, 1, 2, 5, 4, 6, 7, 5}))+
            "\n"+Arrays.toString(lect3_9_hash(new int[]{3, 1, 2, 5, 4, 6, 7, 5})));

    }
    //Problem Statement :Find the repeating and missing numbers
    public static int[] lect3_9_bruteforce(int[]  arr){
        //Time :O(N^2)
        int repeating =-1,missing=-1;
        int n = arr.length;
        for(int i=1;i<=n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }
                if(count==2)
                    repeating = i;
                else if(count ==0)
                    missing = i;
                if(repeating!=-1 && missing!=-1)
                    break;
            }
        }
        return new int[]{repeating,missing};
    }
    public static int[] lect3_9_hash(int[]  arr){
        //Time :O(N^2)
        int repeating =-1,missing=-1;
        int n = arr.length;
        int hash[] = new int[n+1];

        for(int i=0;i<n;i++){
            hash[arr[i]]++; // each array number will go based on there value to an index , for non repeating it will be 1 , for repeating will be 2 and missing 0
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==2)
                repeating = i;
            else if(hash[i]==0)
                missing = i;
            if(repeating!=-1 && missing!=-1)
                break;
        }
        return new int[]{repeating,missing};
    }

}
