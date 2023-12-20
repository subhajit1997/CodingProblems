package com.code.java.practice.leetcode.randomSolution;
/*
1678. Goal Parser Interpretation

https://leetcode.com/problems/goal-parser-interpretation/

You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

 

Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"
 */

public class Solution1678 {
	public static void main(String[] args) {
		Solution1678 solution=new Solution1678();
		int[] n={1,2,3,4};
		System.out.println(solution.interpret("(al)G(al)()()G"));
	}

    public String interpret(String command) {
        StringBuffer sb =new StringBuffer();
        char[] c=command.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='('&& c[i+1]==')')
                sb.append("o");
            else if(c[i]=='('||c[i]==')')
                continue;
            else
                sb.append(c[i]);
        }
        return sb.toString();
    }

}