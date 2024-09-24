package com.code.java.course.striver.Blind_75_Sheet.Day8_Strings;

import java.util.HashMap;

public class _LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    //aproach - 1 sliding window technique
    //time - O(N)
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        int left =0,right = 0;
        int n = s.length();
        int result =0;
        while(right<n){
            if(mpp.containsKey(s.charAt(right))){
                left = Math.max(mpp.get(s.charAt(right))+1,left);
            }
            mpp.put(s.charAt(right),right);
            result = Math.max(result,right-left+1);
            right++;
        }
        return result;
    }
}
