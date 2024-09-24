package com.code.java.company.WissenTech;

import java.util.Stack;
import java.util.function.Predicate;

/**
 * https://takeuforward.org/data-structure/check-for-balanced-parentheses/?amp=1
 */
public class ValidParenthetis {
    public static void main(String[] args) {
        String s="()[{}()]";
        Predicate<String> val = ValidParenthetis::isValidParenthesis;
        if(val.test(s))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('|| i=='{' || i=='[')
                st.push(i);
            else{
                if(st.isEmpty())
                    return false;
                char ch= st.pop();
                if((i==')'&& ch =='(')||(i=='}'&& ch =='{')||(i==']'&& ch =='['))
                    continue;
                else
                    return false;
            }

        }
        return st.isEmpty();
    }
}
