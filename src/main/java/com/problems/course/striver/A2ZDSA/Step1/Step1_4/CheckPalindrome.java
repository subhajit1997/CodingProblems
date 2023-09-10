package com.problems.course.striver.A2ZDSA.Step1.Step1_4;

/**
 *
 * https://leetcode.com/problems/palindrome-number/
 *
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome1(121));
    }

    //converting to string
    public static boolean isPalindrome(int x) {
        if(x>=0){
            String val = String.valueOf(x);
            char[] data = val.toCharArray();
            int len = data.length;
            for(int i=0;i<len;i++){
                if(data[i]==data[len-i-1]){
                    continue;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
    //without converting to String
    public static boolean isPalindrome1(int x) {
        if(x>=0){
            if(x==reverseValue(x)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static int reverseValue(int x){
        int finalval = 0;
        while(x!=0){
            int val = (int)(x%10);
            finalval = finalval*10+val;
            x/=10;
        }

        return finalval;
    }
}
