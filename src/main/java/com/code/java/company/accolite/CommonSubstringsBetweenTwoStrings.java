package com.code.java.company.accolite;

public class CommonSubstringsBetweenTwoStrings {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "ababcde";

        String longestCommonSubstr = longestCommonSubstring(str1, str2);
        System.out.println("Longest common substring: " + longestCommonSubstr); // Output: "abc"

    }
    //time - O(n*m)
    public static String longestCommonSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Edge case: if either string is empty, no common substring
        if (m == 0 || n == 0)
            return "";

        // Initialize DP table and variables
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1; // or j - 1, since both are same
                    }
                } else {
                    dp[i][j] = 0; // reset if characters do not match
                }
            }
        }

        // Extract the longest common substring
        if (maxLength == 0)
            return ""; // no common substring found
        System.out.println("endIndex: "+endIndex+" , maxlen:"+maxLength);
        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}
