package com.code.java.course.gfg.Week2.arrays.videos;

public class EquilibriumPoint {
    public static void main(String[] args) {
        System.out.println(ePoint(new int[]{3,4,8,-9,9,7}));
        System.out.println(ePointEfficient(new int[]{3,4,8,-9,9,7}));
    }
    static boolean ePoint(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int leftSum=0;
            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            int rightSum=0;
            for(int j=i+1;j<n;j++){
                rightSum+=arr[j];
            }
            if(leftSum==rightSum){
                return true;
            }
        }
        return false;
    }
    static boolean ePointEfficient(int arr[]){
        int n = arr.length;
        int rightSum = 0;
        for(int i=0;i<n;i++)
            rightSum+=arr[i];
        int leftSum = 0;
        for(int i=0;i<n;i++){
            rightSum -=arr[i];
            if(leftSum==rightSum)
                return true;
            leftSum+=arr[i];
        }
        return false;
    }

    
}
