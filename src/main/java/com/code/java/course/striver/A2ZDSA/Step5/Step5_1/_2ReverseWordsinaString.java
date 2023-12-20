package com.code.java.course.striver.A2ZDSA.Step5.Step5_1;

import java.util.Stack;

/**
 * <IMPORTANT>
 * learn:https://takeuforward.org/data-structure/reverse-words-in-a-string/
 * practice:https://leetcode.com/problems/reverse-words-in-a-string/description/
 *
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */
public class _2ReverseWordsinaString {
    public static void main(String[] args)
    {
        String s = "TUF is great for interview preparation";
        reverseWords(s);

        //Incomplete
    }
//O(N) not totally correct
    private static void reverseWords(String s) {
        System.out.println("After reversing words: ");
        System.out.println(s);
        s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);
    }
    //
}
