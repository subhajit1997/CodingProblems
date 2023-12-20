package com.code.java.course.striver.A2ZDSA.Step5.Step5_2;

import java.util.*;

/**
 * pactice:https://leetcode.com/problems/sort-characters-by-frequency/
 *
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
 *
 * Return the sorted string. If there are multiple answers, return any of them.
 */
public class _1SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    //Brute Force approach
    public static String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char val = s.charAt(i);
            if(!hm.containsKey(val))
                hm.put(val,1);
            else{
                int stored= hm.get(val);
                hm.put(val,stored+1);
            }
        }
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(hm.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        StringBuilder output= new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            for(int i=0;i<entry.getValue();i++)
                output.append(entry.getKey());
        }
        return output.toString();
    }

    //Better Solution
}
