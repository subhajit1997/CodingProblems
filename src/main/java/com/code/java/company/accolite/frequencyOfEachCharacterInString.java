package com.code.java.company.accolite;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfEachCharacterInString {
    public static void main(String[] args) {
        findOperation("aaaabbbccdd");
    }

    //brute force approach - O(N)
    private static void findOperation(String input) {
        Map<Character,Integer> mpp = new HashMap<>();
        for(char c : input.toCharArray()){
            if(!mpp.containsKey(c)){
                mpp.put(c,1);
            }else {
                mpp.replace(c,mpp.get(c)+1);
            }
        }
        System.out.println(mpp.toString());
    }
    public static void findOperationsWithoutMap(String[] args) {
        String str = "Hello, world!";
        int[] frequency = new int[26]; // Array size for English alphabet (assuming lowercase only)

        // Count frequency of each letter in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) { // Consider only letters (ignore case)
                char lowerCaseC = Character.toLowerCase(c);
                frequency[lowerCaseC - 'a']++; // Adjust index based on 'a' (ASCII 97)
            }
        }

        // Print the frequency of each letter
        System.out.println("Letter frequencies:");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println("'" + letter + "' : " + frequency[i]);
            }
        }
    }
}
