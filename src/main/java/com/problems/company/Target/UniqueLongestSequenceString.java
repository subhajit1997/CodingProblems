package com.problems.company.Target;

import java.util.HashMap;

/**
 * 	• Longest Substring Without Repeating Characters
 */
public class UniqueLongestSequenceString {
    public static void main(String[] args) {
        System.out.println(lengthLongest("geeksforgeeks")); //O(n^3)
        System.out.println(lengthLongestSubstring("abcaabcdba")); //O(n^1)
    }

    private static int lengthLongestSubstring(String s) {
        HashMap<Character,Integer> mpp = new HashMap<Character,Integer>();
        int left=0,right=0;
        int n=s.length();
        int len=0;
        while (right<n){
            if(mpp.containsKey(s.charAt(right))){
                System.out.println("max : 1: "+mpp.get(s.charAt(right))+"   2: "+left);
                left = Math.max(mpp.get(s.charAt(right))+1,left);
                System.out.println("left: "+left );

            }
            System.out.println("right: "+right);
            mpp.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            System.out.println(mpp.toString());
            right++;
        }return len;

    }

    private static int lengthLongest(String str) {
        int n = str.length();

        // Result
        int res = 0;

        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);

        return res;
    }

    private static boolean areDistinct(String str, int i, int j) {
        boolean[] visited = new boolean[26];

        for(int k = i; k <= j; k++)
        {
            if (visited[str.charAt(k) - 'a'])
                return false;

            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
}
