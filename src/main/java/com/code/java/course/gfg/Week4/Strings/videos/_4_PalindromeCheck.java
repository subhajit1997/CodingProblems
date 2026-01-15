package com.code.java.course.gfg.Week4.Strings.videos;

public class _4_PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPal("geeks"));
        System.out.println(isPalOptimised("geeks"));
    }

    // naive method, Time - O(n), Space - O(N)
    static boolean isPal(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    // optimal method, Time - O(n), Space - O(1)
    static boolean isPalOptimised(String str) {
        int begin = 0;
        int end = str.length() - 1;
        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
