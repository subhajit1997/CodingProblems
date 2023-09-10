package com.problems.course.striver.A2ZDSA.Step1.Step1_5;

/**
 * https://leetcode.com/problems/valid-palindrome/
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s) {
        char[] strChar= s.toCharArray();
        String  newStr ="";
        for(char c:strChar){
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                newStr= "%s%s".formatted(newStr, Character.toLowerCase(c));
            }
        }
        return checkPalindrome(newStr.toCharArray(),0,newStr.length()-1);
    }
    public static boolean checkPalindrome(char[] str,int start,int end){
        if(start>=end || str.length<=1) {
            return true;
        }
        if(str[start]==str[end]){
            System.out.println("start "+str[start]+" end:"+str[end] );
            return checkPalindrome(str,++start,--end);
        }
        return false;
    }
}
