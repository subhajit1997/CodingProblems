package com.code.java.company.Lenskart;

import java.util.HashMap;

/**
 * practice: https://www.codingninjas.com/studio/problems/bit-set_973054?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
 * Problem statement
 * You are given a sequence of only digits in the form of a string 'DIGIT_PATTERN', your task is to find the first repeating digit. If no digit is repeating you should return -1.
 *
 * Example:
 *
 * Given string of digits is 123456325. Now starting from the left, the first digit which is repeating is 3 as till 2nd 3 every digit is encountered 1st time and thus our answer for this input will be 3.
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints:
 * 1 <= T <= 10
 * 1 <= |DIGIT_PATTERN| <= 10^5
 * 0 <= DIGIT_PATTERN[ i ] <= 9
 *
 *
 * Where ‘DIGIT_PATTERN[i]' denotes the digit at ‘i’th index in the string ‘DIGIT_PATTERN’.
 *
 * Time Limit: 1 sec
 */
public class BitSetRepeatingDigit {
    public static void main(String[] args) {

    }
// using bit operations
    public static int findFirstRepeatingDigit(String digitPattern) {
        int res =0;
        int repeatElement = -1;
        for(char c: digitPattern.toCharArray()){
            int val = c - '0'; // The subtraction by '0' works because in the ASCII encoding, the characters '0' to '9' are consecutive, so subtracting '0' converts the character to its numeric equivalent.
            int mask = 1 << val; //bitwise left shift  eg., 1<<3 -> 0001<<3 = 1000
            if((res&mask)!=0){ //This checks if the bitwise AND operation between res and mask is not equal to zero. If it's not zero, it means that the bit represented by mask is already set in res, indicating a repeated element.
                repeatElement = val;
                break;
            }
            res =res | mask; // This line updates the res variable by performing a bitwise OR operation with mask. This sets the bit in res corresponding to the current digit in digitPattern.
        }
        return repeatElement;
    }
    //using HashMap
    public static int findFirstRepeatingDigitHashMap(String digitPattern) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<digitPattern.length();i++){
            if(mpp.containsKey(digitPattern.charAt(i))){
                return Integer.parseInt(String.valueOf(digitPattern.charAt(i)));
            }else{
                mpp.put(digitPattern.charAt(i), 1);
            }
        }
        return -1;
    }
}
