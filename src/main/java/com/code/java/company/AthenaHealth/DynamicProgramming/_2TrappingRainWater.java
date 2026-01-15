package com.code.java.company.AthenaHealth.DynamicProgramming;
/**
 * https://takeuforward.org/data-structure/trapping-rainwater/
 */
public class _2TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicate element is " + trap(arr));
    }
    //brute force: Time:  O(N^2) spaxe :O(1)
    public static int trap(int[] arr){
        int n = arr.length;
        int waterTrapped =0;
        for(int i=0;i<n;i++){
            int j=i;
            int leftMax=0,rightMax=0;
            while(j>0){
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j=i;
            while (j<n) {
                rightMax = Math.max(arr[j], rightMax);
                j++;
            }
            waterTrapped +=Math.min(leftMax, rightMax)-arr[i];
        }
        return waterTrapped;
    }
    static int trapOptimised(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
