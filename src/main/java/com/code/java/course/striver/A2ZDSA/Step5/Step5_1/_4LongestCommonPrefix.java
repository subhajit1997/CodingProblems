package com.code.java.course.striver.A2ZDSA.Step5.Step5_1;

/**
 *
 * practice: https://leetcode.com/problems/longest-common-prefix/description/
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class _4LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for(int i=1;i<strs.length;i++){
            int l1= common.length();
            int l2= strs[i].length();
            if(l1>l2)
                common = commonElement(common,strs[i]);
            else
                common = commonElement(strs[i],common);
        }
        return common;
    }
    public static String commonElement(String s1, String s2){
        String same="";
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                same +=s2.charAt(i);
            }else{
                return same;
            }
        }
        return same;
    }
}
