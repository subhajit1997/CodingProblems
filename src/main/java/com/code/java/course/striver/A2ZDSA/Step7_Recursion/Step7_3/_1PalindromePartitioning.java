package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_3;

import java.util.ArrayList;
import java.util.List;

/**practice: https://leetcode.com/problems/palindrome-partitioning/description/
 * learn: https://takeuforward.org/data-structure/palindrome-partitioning/
 *
 * Given a string s, partition s such that every
 * substring
 *  of the partition is a
 * palindrome
 * . Return all possible palindrome partitioning of s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 * Example 2:
 *
 * Input: s = "a"
 * Output: [["a"]]
 */
public class _1PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(partition("aabb"));
    }
    //function has to do again and again so recursion backtracking algorithms
    //Time complexity: Time Complexity: O( (2^n) *k*(n/2) )
    //
    //Reason: O(2^n) to generate every substring and O(n/2)  to check if the substring generated is a palindrome. O(k) is for inserting the palindromes in another data structure, where k  is the average length of the palindrome list.
    //Space Complexity: O(k * x)
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        palindromePartition(0,s,new ArrayList<String>(),result );
        return result;
    }
    public static void palindromePartition(int index,String str,List<String> path,List<List<String>> result ){
        if(index==str.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<str.length();++i){
            if(isPalindrome(str,index,i)){
                path.add(str.substring(index,i+1));
                palindromePartition(i+1,str,path,result );
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str,int start,int end){
        while(start<=end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }

}
