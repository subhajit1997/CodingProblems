package com.code.java.course.gfg.Week2.recursion.problems;

public class Josephusproblem {
    /**
     * 
     * A total of n people are standing in a circle, and you are one of them playing a game. Starting from a person, k persons will be counted in order along the circle, and the kth person will be killed. Then the next k persons will be counted along the circle, and again the kth person will be killed. This cycle will continue until only a single person is left in the circle.

If there are 5 people in the circle in the order A, B, C, D, and E, you will choose k=3. Starting from A, you will count A, B and C. C will be the 3rd person and will be killed. Then you will continue counting from D, E and then A. A will be third person and will be killed. 

You will be given an array where the first element is the first person from whom the counting will start and the subsequent order of the people. You want to be the last one standing. Determine the index at which you should stand to survive the game. Return an integer denoting safe position. 

Examples :

Input: n = 3, k = 2
Output: 3
Explanation: There are 3 persons so skipping 1 person i.e 1st person 2nd person will be killed. Thus the safe position is 3.
Input: n = 5, k = 3
Output: 4
Explanation: There are 5 persons so skipping 2 person i.e 3rd person will be killed. Thus the safe position is 4.

     */
    public static void main(String[] args) {
        System.out.println(josephus(3,2));
    }
    public static int josephus(int n, int k)
    {
        if(n==1)
            return 1;
        return (josephus(n-1,k)+k-1)%n+1;
    }

}
