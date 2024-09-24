package com.code.java.company.WissenTech;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 * https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {

    }

    //approach -1 , time-O(m+n)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // pointer for nums1
        int p2 = n - 1; // pointer for nums2
        int p = m + n - 1; // pointer for the merged array in nums1

        // While there are elements to examine in both arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
