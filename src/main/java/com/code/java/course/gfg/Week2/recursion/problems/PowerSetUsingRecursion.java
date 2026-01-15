package com.code.java.course.gfg.Week2.recursion.problems;

import java.util.ArrayList;

public class PowerSetUsingRecursion {
    /**
     * You are given a string. You need to return the power-set (in any order) of the string.
Note: The string s contains lowercase letter of alphabet.

Example 1:

Input:
s = a
Output: a
Explanation: empty string and a 
are only sets.
Example 2:

Input:
s = abc
Output: a ab abc ac b bc c
Explanation: empty string, 
a, ab, abc, ac, b, bc, c 
are the sets.
Your Task:
You don't need to read input or print anything. You only need to complete the function powerSet that takes string s as parameter and returns a list of subsets. The lexicographic-sorting and printing is done automatically by the driver code.

Expected Time Complexity: O(2|s|).
Expected Auxiliary Space: O(|s|). 

Constraints:
1 <= |s| <= 10

     */
    public static void main(String[] args) {
        powerSet("abc").forEach(System.out::println);
    }
    public static ArrayList<String> powerSet(String s)
    {
       return powerSetRecursion(s,"",0, new ArrayList<String>());
    }
    public static ArrayList<String> powerSetRecursion(String s, String current, int i, ArrayList<String> al){
        if(i==s.length()){
            al.add(current);
            return al;
        }
        powerSetRecursion(s,current,i+1,al);
        powerSetRecursion(s,current+s.charAt(i),i+1,al);
        return al;
    }
}
