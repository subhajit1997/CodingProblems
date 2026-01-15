package com.code.java.company.AthenaHealth.Array;
/**
 * https://leetcode.com/problems/kth-missing-positive-number/description/
 * https://takeuforward.org/arrays/kth-missing-positive-number/
 */
public class _6FindKthMissingElementSortedArray {
    public static void main(String[] args) {
        System.out.println(findKMissing(new int[]{4,7,9,10 }, 1));
        System.out.println(findKMissingOptimised(new int[]{4,7,9,10 }, 4));
    }
    //brute force time : O(N)
    public static int findKMissing(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=k)
                k++;
            else
                break;
        }
        return k;
    }
    //using binary search
    public static int findKMissingOptimised(int[] nums,int k){
        int n = nums.length;
        int low=0,high=n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            int missing = nums[mid]- (mid+1);
            if(missing<k)
                low = mid+1;
            else
                high = mid-1;
        }
        return k+high+1;
    }
}
