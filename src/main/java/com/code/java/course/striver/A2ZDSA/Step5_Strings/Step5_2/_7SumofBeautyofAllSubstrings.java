package com.code.java.course.striver.A2ZDSA.Step5_Strings.Step5_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _7SumofBeautyofAllSubstrings {
    public static void main(String[] args) {
        
        System.out.println("Sum of beauty of all substring: "+lect1_7_bruteforce("aabcbaa"));
    }
    //Time : O(N^3)
    // Problem Statement :1781. Sum of Beauty of All Substrings
    public static int lect1_7_bruteforce(String s) {
        char[] input =s.toCharArray();
        int totalSum=0;
        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length;j++){
                int freq = getfrequency(input,i,j+1);
                totalSum+=freq;
            }
        }
        return totalSum;
    }
    public static int getfrequency(char[] input,int i,int j){
        Map<Character,Integer> mpp = new HashMap<>();
        for(int k=i;k<j;k++){
            char c = input[k];
            int val = mpp.getOrDefault(c, 0);
            mpp.put(c,val+1);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> m: mpp.entrySet()){
            min = Math.min(min, m.getValue());
            max = Math.max(max, m.getValue());
        }
        System.out.println("char: "+Arrays.toString(input)+" mapp: "+mpp.toString());
        return max-min;
    }

}
