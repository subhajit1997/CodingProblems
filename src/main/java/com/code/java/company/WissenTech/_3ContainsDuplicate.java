package com.code.java.company.WissenTech;

import java.util.HashSet;

/**
 * https://takeuforward.org/data-structure/contains-duplicate-check-if-a-value-appears-atleast-twice/
 * https://leetcode.com/problems/contains-duplicate/submissions/1307409520/
 */
public class _3ContainsDuplicate {
    public static void main(String[] args) {

    }
    //approach - 3 using hashset
    //Time - O(N)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(nums.length>set.size())
            return true;
        return false;
    }
}
