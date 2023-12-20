package com.code.java.course.striver.A2ZDSA.Step5.Step5_1;

import java.util.Stack;

/**
 * learn:
 * practice:https://leetcode.com/problems/remove-outermost-parentheses/description/
 *
 * Remove Outermost Parentheses

 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
 *
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 *
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 */
public class _1RemoveOutermostParanthesis {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParenthesesEasy("(()())(())"));

    }

    //using stack O(N)
    public static String removeOuterParentheses(String s) {
        Stack<Character> bracket =  new Stack<>();

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                bracket.pop();
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    //Using count O(N)
    public static String removeOuterParenthesesEasy(String s) {
        int count =0;
        StringBuilder sb= new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(count >0){
                    sb.append(c);
                }
                count++;
            }else{
                count --;
                if(count>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
