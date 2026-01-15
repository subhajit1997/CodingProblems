package com.learning.JAVA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String s) {
        // Step 1: Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Step 2: Count occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Find the first character with count 1
        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c; // Found the first non-repeating character
            }
        }

        // Step 4: Return a default value (assuming there's no non-repeating character)
        return '\0'; // '\0' represents null character in Java
    }

    public static void main(String[] args) {

        String s1 = "John";
        String s2 = new String ("John");
        Map<String, Integer> map = new HashMap<>();
        map.put(s1,20);
        map.put(s2,30);
        System.out.println(map.size());
        String input = "abaccdeff";
        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    public static Optional<Character> findFirstNonRepeatingChar1(String s) {
        // Step 1: Create a LinkedHashMap to preserve insertion order
        Map<Character, Long> charCountMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Step 2: Find the first character with count 1
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }
}
