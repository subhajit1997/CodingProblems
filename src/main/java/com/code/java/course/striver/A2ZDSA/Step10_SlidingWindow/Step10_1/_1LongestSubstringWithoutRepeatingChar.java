package com.code.java.course.striver.A2ZDSA.Step10_SlidingWindow.Step10_1;

import java.util.HashSet;
import java.util.Set;

public class _1LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstringOptimised("abcabcbb"));
    }
    // Brute force approach , Time Complexity : O(N^2)
    public static int lengthOfLongestSubstring(String s){
        if(s.length()==0)
            return 0;
        int maxRes=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            Set<Character> set= new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
                maxRes = Math.max(maxRes,j-i+1);
            }
        }
        return maxRes;
    }

    //optimised brute force Time Complexity : O(2N)
    public static int lengthOfLongestSubstringOptimised(String s) {
        if (s.length() == 0)
            return 0;

        int max = 0;
        int l=0;
        int r=0;
        Set<Character> set = new HashSet<>();
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                while(l<r && set.contains(s.charAt(r)))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
}
