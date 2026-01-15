package com.code.java.course.gfg.Week4.Strings.videos;

import java.util.Arrays;

public class _6_CheckForAnagram {
    public static void main(String[] args) {
         System.out.println(isAnagram("aabbcc", "abcabc"));
         System.out.println(isAnagramEfficient("aabbcc", "abcabcc"));
    }
    //naive approach time:O(nlogn) space:O(1)
    static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        char a1[] =s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        return s1.equals(s2);
    }

    //optimised approach time:O(n) space:O(1)
    static boolean isAnagramEfficient(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        int count[] = new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
    
}
