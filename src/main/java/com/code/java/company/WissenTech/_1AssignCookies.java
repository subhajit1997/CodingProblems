package com.code.java.company.WissenTech;

import java.util.Arrays;

/**
 * learn:
 * practice: https://leetcode.com/problems/assign-cookies/description/
 */
public class _1AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3},new int[]{1,1}));
    }


    /**
     * Approach
     * The solution sorts children's greed and cookie sizes, then iterates through them. It assigns the smallest cookie to the least greedy child, maximizing content children. Increment counts when a match is found and move both pointers. Return the count of content children.
     *
     * Complexity
     * Time complexity:
     * O(n log n) - Due to sorting the arrays of children's greed and cookie sizes.
     *
     * Space complexity:
     * O(1) - The algorithm uses only a constant amount of extra space
     */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int noOfStudents = g.length;
        int noOfCookies=s.length;
        int pt1=0,pt2=0;
        int count =0;
        while(pt2<noOfCookies && pt1<noOfStudents){
            if(g[pt1]<=s[pt2]){
                count++;
                pt1++;
                pt2++;
            }else{
                pt2++;
            }
        }
        return count;
    }
}
