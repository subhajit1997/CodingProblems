package com.code.java.company.accolite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeFromGivenList {
    public static void main(String[] args) {
        String[] input = new String[]{"subhajit","abssba","alsa","pop"};
        List<String> sb = new ArrayList<>(Arrays.stream(input).toList());
        System.out.println(findPalindrome(sb).toString());

    }
    //brute force : time -O(n⋅m)
    private static List<String> findPalindrome(List<String> sb) {
        List<String> resul = new ArrayList<>();
        for(String str:sb){
            char[] chr = str.toCharArray();
            boolean palindrome = true;
            for(int i=0;i<chr.length/2;i++)
            {
                if(chr[i]!=chr[chr.length-i-1]){
                    palindrome = false;
                    break;
                }
            }
            if(palindrome){
                resul.add(str);
            }

        }
        return resul;
    }
}
