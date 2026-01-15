package com.code.java.course.striver.A2ZDSA.Step5_Strings.Step5_2;

import java.util.Arrays;

public class _8ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println("reverse words in a string: "+lect1_8_bruteforce("a good   example"));
    }
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
