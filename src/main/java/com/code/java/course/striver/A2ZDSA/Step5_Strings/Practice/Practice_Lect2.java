package com.code.java.course.striver.A2ZDSA.Step5_Strings.Practice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice_Lect2 {
    public static void main(String[] args) {
        System.out.println(" Sort Characters By Frequency: " + lect1_1_bruteforce("tree"));
        System.out.println("Maximum Nesting Depth of the Parentheses: " + lect1_2_bruteforce("()(())((()()))"));
        System.out.println("Roman to Integer: " + lect1_3_bruteforce("MCMXCIV"));
        System.out.println("String to Integer (atoi): " + lect1_4_bruteforce("-042"));
        System.out.println("Longest palindrome Substring: " + lect1_6_bruteforce("cbbd") + "  " +
                lect1_6_another_approach("babad"));
        System.out.println("Sum of beauty of all substring: "+lect1_7_bruteforce("aabcbaa"));
        System.out.println("reverse words in a string: "+lect1_8_bruteforce("a good   example"));
    }

    // Problem Statement :451. Sort Characters By Frequency
    public static String lect1_1_bruteforce(String s) {
        // Time: O(N^2)
        // space: O(N)
        Map<Character, Integer> mpp = new HashMap<>();
        for (char c : s.toCharArray()) {
            int val = mpp.getOrDefault(c, 0);
            mpp.put(c, val + 1);
        }

        Character maxChar = null;
        StringBuilder sb = new StringBuilder();
        while (sb.length() != s.length()) {
            int max = Integer.MIN_VALUE;
            for (char ch : mpp.keySet()) {
                if (mpp.get(ch) > max) {
                    max = mpp.get(ch);
                    maxChar = ch;
                }
            }
            for (int i = 0; i < max; i++) {
                sb.append(maxChar);
            }
            mpp.remove(maxChar);
        }
        return sb.toString();
    }

    // Problem Statement :1614. Maximum Nesting Depth of the Parentheses
    public static int lect1_2_bruteforce(String s) {
        // Time : O(N)
        // space: O(1)
        int maxCount = 0;
        int count = 0;
        for (int c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                maxCount = Math.max(maxCount, count);
                count--;
            }
        }
        return maxCount;
    }

    // Problem Statement :13. Roman to Integer
    public static int lect1_3_bruteforce(String s) {
        // Time : O(N)
        // space :O(1)
        int value = 0;
        char[] chr = s.toCharArray();
        int n = chr.length;
        for (int i = 0; i < n; i++) {
            char c = chr[i];
            if (c == 'I') {
                if (i < n - 1 && chr[i + 1] == 'V') {
                    value += 4;
                    i++;
                } else if (i < n - 1 && chr[i + 1] == 'X') {
                    value += 9;
                    i++;
                } else {
                    value += 1;
                }
            } else if (c == 'V')
                value += 5;
            else if (c == 'X') {
                if (i < n - 1 && chr[i + 1] == 'L') {
                    value += 40;
                    i++;
                } else if (i < n - 1 && chr[i + 1] == 'C') {
                    value += 90;
                    i++;
                } else {
                    value += 10;
                }
            } else if (c == 'L')
                value += 50;
            else if (c == 'C') {
                if (i < n - 1 && chr[i + 1] == 'D') {
                    value += 400;
                    i++;
                } else if (i < n - 1 && chr[i + 1] == 'M') {
                    value += 900;
                    i++;
                } else {
                    value += 100;
                }
            } else if (c == 'D')
                value += 500;
            else if (c == 'M')
                value += 1000;
        }
        return value;
    }

    // Problem Statement :8. String to Integer (atoi)
    public static int lect1_4_bruteforce(String s) {
        // remove leading space
        s = s.trim();
        int sign = 1, i = 0;
        long result = 0;
        if (s.length() == 0)
            return 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        // process numerical char
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }
            result = result * 10 + Character.getNumericValue(ch);
            if (sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * result);

    }

    // Time : O(N^2)
    // Space: O(N)
    // Problem Statement :5. Longest Palindromic Substring
    public static String lect1_6_bruteforce(String s) {
        int maxLongest = 1;
        String maxString = s.substring(0, 1);
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String tempString = s.substring(i, j);
                StringBuilder sb = new StringBuilder(tempString);
                if (tempString.equals(sb.reverse().toString())) {
                    int length = j - i;
                    if (length > maxLongest) {
                        maxLongest = length;
                        maxString = tempString;
                    }
                }
            }
        }
        return maxString;
    }

    public static String lect1_6_another_approach(String s) {
        int maxLength = 1;
        int low = 0;
        char[] input = s.toCharArray();
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < input.length; i++) {
            int[] res1 = expandPalindromeTwoSidesCheck(input, i, i);
            if (res1[0] > maxLength) {
                maxLength = res1[0];
                low = res1[1];
            }
            int[] res2 = expandPalindromeTwoSidesCheck(input, i, i + 1);
            if (res2[0] > maxLength) {
                maxLength = res2[0];
                low = res2[1];
            }
        }
        return s.substring(low, low + maxLength);
    }

    public static int[] expandPalindromeTwoSidesCheck(char[] input, int j, int k) {
        while (j >= 0 && k < input.length && input[j] == input[k]) {
            j--;
            k++;
        }
        int length = k - j - 1;
        int start = j + 1;
        return new int[] { length, start };
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

    // Problem Statement :151. Reverse Words in a String
    public static String lect1_8_bruteforce(String s) {
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(int i=str.length-1;i>=0;i--){
            System.out.println("str: "+str[i]);
            if(!str[i].isEmpty() && !str.equals(" ")){
                if(!first)
                    sb.append(" ");
                sb.append(str[i]);
                first = false;
            }
        }
        return sb.toString();
    }
}
