package com.code.java.course.gfg.Week2.recursion.problems;

public class TowerOfHanoi {
    /**
     * In the Tower of Hanoi puzzle, you are given n disks stacked in ascending order (smallest at the top) on the first of three rods. The goal is to move all disks to the third rod following two rules: only one disk can be moved at a time, and a disk can only be placed on top of a larger disk. Given the number of disks n and three rods labeled as from, to, and aux (starting rod, target rod, and auxiliary rod, respectively),  returns the total number of moves needed to transfer all disks from the starting rod to the target rod.

Examples:

Input: n = 2
Output: 3
Explanation: For n =2 , steps will be as follows in the example and total 3 steps will be taken.
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
Input: n = 3
Output: 7
Explanation: For N=3 , steps will be as follows in the example and total 7 steps will be taken.
move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3
Input: n = 0
Output: 0
Explanation: Total 0 steps will be taken.
Constraints:
0 <= n <= 16
     */
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3,1,2,3));
    }
    public int move =0;
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 0) {
            return 0; // Base case: No moves needed for 0 disks
        }
    
        // Recursive case: Calculate moves for n-1 disks and the nth disk
        return towerOfHanoi(n - 1, from, aux, to) // Move n-1 disks to auxiliary rod
             + 1                                  // Move the nth disk to the target rod
             + towerOfHanoi(n - 1, aux, to, from); // Move n-1 disks from auxiliary to target rod
    }

}
