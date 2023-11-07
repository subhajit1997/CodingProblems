package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 * learn:https://takeuforward.org/arrays/implement-lower-bound-bs-2/
 * practice:https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class LowerBound {
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1, 2, 2 ,3 ,3, 5},6,2));
        System.out.println(lowerBoundOptimised(new int[]{1, 2, 2 ,3 ,3, 5},6,2));

    }
    //using linear search
    public static int lowerBound(int []arr, int n, int x) {
        for(int i=0;i<n;i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return n;
    }
    //using binary search
    public static int lowerBoundOptimised(int []arr, int n, int x) {
        int low = 0;
        int high = n-1;
        int ans =n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}
