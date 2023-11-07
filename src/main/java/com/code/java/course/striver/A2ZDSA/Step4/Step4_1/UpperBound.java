package com.code.java.course.striver.A2ZDSA.Step4.Step4_1;

/**
 * learn:https://takeuforward.org/arrays/implement-upper-bound/
 * practice:https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class UpperBound {
    public static void main(String[] args) {
        System.out.println(upperBound(new int[]{1 ,5 ,5, 7, 7 ,9 ,10},5,7));
        System.out.println(upperBoundOptimised(new int[]{1 ,5 ,5, 7, 7 ,9 ,10},5,7));

    }
    public static int upperBound(int []arr, int x, int n){
        for(int i=0;i<n;i++){
            if(arr[i]>x)
                return i;
        }
        return n;
    }
    public static int upperBoundOptimised(int []arr, int x, int n){
        int low = 0;
        int high = n-1;
        int ans=n;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return ans;
    }
}
