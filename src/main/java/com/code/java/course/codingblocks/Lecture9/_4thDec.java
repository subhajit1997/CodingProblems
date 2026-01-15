package com.code.java.course.codingblocks.Lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class _4thDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        //print maximum marks
        System.out.println(getMaxNumber(n,marks));
        reverse(marks);
        System.out.println(Arrays.toString(marks));
        int arr[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,4,9)));
        System.out.println(Arrays.toString(prouctOfArray(new int[]{1,2,3,4})));
        //trapping rain water
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }




    public static int getMaxNumber(int n ,int[] marks){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max, marks[i]);
        }
        return max;
    }
    private static void reverse(int[] marks) {
        int n = marks.length;
        // for(int i=0;i<n/2;i++){
        //     int temp = marks[n-i-1];
        //     marks[n-i-1]=marks[i];
        //     marks[i]=temp;
        // }
        int i=0;
        int j=marks.length-1;
        while (i<j) {
            int temp = marks[i];
            marks[i] = marks[j];
            marks[j] = temp;
            i++;
            j--;
        }
    }
    //Two sum
    private static int[] twoSum(int[] arr, int n, int target) {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //product of array except self
    public static int[] prouctOfArray(int[] arr){
        int left[] = new int[arr.length];
        left[0] =1;
        for(int i=1;i<left.length;i++){
            left[i] = arr[i-1]*left[i-1];
        }
        int right[] = new int[arr.length];
        right[right.length-1] =1;
        for(int i=right.length-2;i>=0;i--){
            right[i] = arr[i+1]*right[i+1];
        }  
        for(int i=0;i<left.length;i++){
            left[i] = left[i]*right[i];
        }
        return left;
    }

    private static int trap(int[] height) {
        int left[] = new int[height.length];
        left[0]= height[0];

        for(int i=1;i<height.length;i++){
            left[i] = Math.max(height[i], left[i-1]);
        }

        int right[] = new int[height.length];
        right[right.length-1] = height[height.length-1];

        for(int i=height.length-2;i>=0;i--){
            right[i] = Math.max(height[i], right[i+1]);
        }
        int ans=0;
        for(int i=0;i<right.length;i++){
            ans+=Math.min(left[i], right[i])-height[i];
        }
        return ans;
    }

} 
