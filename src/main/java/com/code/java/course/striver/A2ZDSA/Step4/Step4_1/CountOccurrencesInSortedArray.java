package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 *
 */
public class CountOccurrencesInSortedArray {
    public static void main(String[] args) {
        System.out.println(count(new int[]{1,1,1,2,2,3,3},7,3));
    }
    public static int count(int[] arr, int n, int x) {
        int low = findLow(n,x,arr);
        int high = findHigh(n,x,arr);
        if(low==-1)
            return 0;
        else if(high ==-1)
            return 1;
        else
            return high-low+1;
    }
    public static int findHigh(int n, int target, int[] nums){
        int left = 0, right = n - 1;
        int last = -1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
    public static int findLow(int n, int target, int[] nums){
        int left = 0, right = n - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }
}
