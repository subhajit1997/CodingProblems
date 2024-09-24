package com.code.java.company.accolite;

/**
 * https://leetcode.com/problems/replace-the-substring-for-balanced-string/
 */
public class ReplacetheSubstringforBalancedString {
    public static void main(String[] args) {
        String input = "HBBBUBBB";
        int result = minReplacementLength(input);
        System.out.println("Minimum replacement length: " + result); // Output: 5
    }

    //time complexity -  O(n)
    private static int minReplacementLength(String s) {
        int n = s.length();
        int targetCount = n / 4; // Target count of each character

        // Count occurrences of each character in the string
        int[] count = new int[4]; // B, D, U, H
        for (char c : s.toCharArray()) {
            if (c == 'B') count[0]++;
            else if (c == 'D') count[1]++;
            else if (c == 'U') count[2]++;
            else if (c == 'H') count[3]++;
        }

        // Sliding window to find minimum length of substring to replace
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            // Expand window
            count[charIndex(s.charAt(right))]--;

            // Check if current window is valid (all counts <= targetCount)
            while (left < n && count[0] <= targetCount && count[1] <= targetCount &&
                    count[2] <= targetCount && count[3] <= targetCount) {
                // Update minimum length
                minLen = Math.min(minLen, right - left + 1);

                // Shrink window from left
                count[charIndex(s.charAt(left))]++;
                left++;
            }
        }

        return minLen;
    }
    // Helper function to map character to index (B=0, D=1, U=2, H=3)
    private static int charIndex(char c) {
        switch (c) {
            case 'B': return 0;
            case 'D': return 1;
            case 'U': return 2;
            case 'H': return 3;
            default: return -1; // Should not happen as per problem statement
        }
    }
}
