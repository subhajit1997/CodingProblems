package com.code.java.course.gfg.Week2.recursion.problems;

public class LuckyNumbers {
    /**
     * 
     * Lucky numbers are subset of integers. Process of arriving at lucky numbers is:
Take the set of integers 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.

You are given a number N, you need to tell whether the number is lucky or not. If the number is lucky return 1 otherwise 0.

Example 1:

Input:
N = 5
Output: 0
Explanation: 5 is not a lucky number as it gets 
deleted in the second iteration.
Example 2:

Input:
N = 19
Output: 1
Explanation: 19 is a lucky number because 
it does not get deleted throughout the process.
     */
    public static void main(String[] args) {
        System.out.println(isLucky(5));
    }
    public static int isLucky(int n) {
        return isLuckyHelper(n, 2) ? 1 : 0;
    }

    private static boolean isLuckyHelper(int n, int step) {
        // Base case: If the step exceeds the number, it means the number survived.
        if (step > n) {
            return true;
        }
        
        // If the number is at a position that gets removed in this step, it is not lucky.
        if (n % step == 0) {
            return false;
        }
        
        // Update the position of the number for the next step
        n = n - (n / step);
        
        // Recursive call for the next step
        return isLuckyHelper(n, step + 1);
    }
}
