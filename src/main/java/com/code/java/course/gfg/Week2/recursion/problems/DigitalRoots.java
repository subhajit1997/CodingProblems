package com.code.java.course.gfg.Week2.recursion.problems;

public class DigitalRoots {
/**
 * You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

Example 1:

Input:
n = 1
Output:  1
Explanation: Digital root of 1 is 1
Example 2:

Input:
n = 99999
Output: 9
Explanation: Sum of digits of 99999 is 45
which is not a single digit number, hence
sum of digit of 45 is 9 which is a single
digit number.
Your Task:
You don't need to read input or print anything. Your task is to complete the function digitalRoot that takes n as parameter and returns the digital root of n. 

Expected Time Complexity: O(Num of Digits).
Expected Auxiliary Space: O(Num of Digits).


 * @param args
 */
    public static void main(String[] args) {
        System.out.println(digitalRoot(99999));
    }
    public static int digitalRoot(int n) {
        // Base case: If n is a single digit, return it
        if (n < 10) {
            return n;
        }
        // Calculate the sum of digits of n
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit
            n /= 10;       // Remove the last digit
        }
        // Recursively call digitalRoot with the sum of digits
        return digitalRoot(sum);
    }
    
}
