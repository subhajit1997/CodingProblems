package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;



public class Practice_Lec1 {
    public static void main(String[] args) {
        System.out.println(lect1_1(new int[]{8,10,5,7,9}));
        System.out.println(Arrays.toString(lect1_2(new int[]{1,2,4,7,7,5})));
        System.out.println(lect1_3(new int[]{5,4,6,7,8}));

        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        int count = lect1_4(arr);
        IntStream.range(0, count).forEach(i->System.out.print(arr[i]+" "));

        System.out.println("\n"+Arrays.toString(lect1_5(new int[]{1,2,3,4,5},5)));
        System.out.println("Rotate array by K elements:");
        System.out.println(Arrays.toString(lect1_6_brute(new int[]{1,2,3,4,5,6,7},7,2,"right")));
        System.out.println(Arrays.toString(lect1_6_brute(new int[]{3,7,8,9,10,11},6,3,"left")));
        System.out.println(Arrays.toString(lect1_6_optimised(new int[]{1,2,3,4,5,6,7},7,2,"right")));
        System.out.println(Arrays.toString(lect1_6_optimised(new int[]{3,7,8,9,10,11},6,3,"left")));

        System.out.println("move all Zeros to the end of the array");
        System.out.println(Arrays.toString(lect1_7(new int[]{ 0,1 ,0 ,2 ,3 ,0 ,4 ,0 ,1})));

        System.out.println(Arrays.toString(lect1_9(new int[]{1,2,3,4,5},new int[]{2,3,4,4,5},5,5)));

        System.out.println("Find the missing number in an array \n"+lect1_10(new int[]{1,3},3)+"\n"+lect1_10_summation(new int[]{1,3},3));
        System.out.println("Count Maximum Consecutive One's in the array\n"+lect1_11(new int[]{1, 0, 1, 1, 0, 1}));

        System.out.println("Find the number that appears once, and the other numbers twice\n"+ lect1_12(new int[]{4,1,2,1,2})+"\n"+lect1_12_xor(new int[]{4,1,2,1,2}));
        System.out.println("Longest Subarray with given Sum K\n"+
            lect1_13(new int[]{2,3,5,1,9},10)+"\n"+lect1_13_twopointers(new int[]{2,3,5,1,9},10));
        System.out.println("Longest Subarray with sum K | [Postives and Negatives]: "+lect1_14(new int[]{-1, 1, 1}, 1)
            +"\n"+lect1_14_hashmap(new int[]{-1, 1, 1}, 1));
    }
    //Problem Statement: Given an array, we have to find the largest element in the array.
    public static int lect1_1(int[] val){
        //brute force:O(N)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<val.length;i++){
            max = Math.max(max, val[i]);
        }
        return max;

    }
    //Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
    public static int[] lect1_2(int[] val){
        //Brute force : O(N)
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;        
        for(int i=0;i<val.length;i++){
            max = Math.max(max, val[i]);
            if(val[i]!=max)
                secondMax = Math.max(secondMax, val[i]);
            min=Math.min(min, val[i]);
            if(val[i]!=min)
                secondMin = Math.min(secondMin, val[i]);
        }
        if(secondMax==Integer.MIN_VALUE)
            secondMax = -1;
        if(secondMin==Integer.MAX_VALUE)
            secondMin = -1;
        return new int[]{secondMax,secondMin};
    }
    //Problem Statement: Check if an Array is Sorted.
    //Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
    public static boolean lect1_3(int[] val){
        //O(N)
        for(int i=0;i<val.length-1;i++){
            if(val[i+1]>val[i])
                continue;
            else
                return false;
        }
        return true;

    }
    //Problem Statement: Remove Duplicates in-place from Sorted Array
    //Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
    public static int lect1_4(int[] val){
        //time: O(N)
        int lastSortedElement = 0;
        for(int i=1;i<val.length;i++){
            if(val[i]==val[lastSortedElement])
                continue;
            else{
                lastSortedElement++;
                val[lastSortedElement] = val[i];
            }
        }
        return lastSortedElement+1;
    }
    //Problem Statement:Left Rotate the Array by One
    public static int[] lect1_5(int[] val,int n){
        //O(N)
        int temp =val[0];
        for(int i=1;i<n;i++){
            val[i-1]=val[i];
        }
        val[n-1]=temp;
        return val;
    }
    //Problem Statement:Rotate array by K elements
    public static int[] lect1_6_brute(int[] val,int n,int k,String dir){
        //time: O(N), space:O(N)
        k = k% n;
        if (k>n) {
            return val;
        }
        int[] kElement = new int[k];
        if(dir.equals("right")){
            for(int i=n-k;i<n;i++){
                kElement[i+k-n]=val[i];
            }
            for(int i=n-1;i>=k;i--){
                val[i]=val[i-k];
            }
            for(int i=0;i<k;i++){
                val[i]=kElement[i];
            }
        }else if(dir.equals("left")){
            for(int i=0;i<k;i++){
                kElement[i]=val[i];
            }
            for(int i =k;i<n;i++){
                val[i-k]=val[i];
            }
            for(int i=0;i<k;i++){
                val[n-k+i]= kElement[i];
            }
        }
        return val;
        
    }
    public static void reverse(int[] val,int start,int end){
        while (start<=end) {
            int temp = val[start];
            val[start]=val[end];
            val[end]=temp;
            start++;
            end--;
        }
    }
    public static int[] lect1_6_optimised(int[] val,int n,int k,String dir){
        //time: O(N), space:O(1)
        if(dir.equals("right")){
            reverse(val,0,n-k-1);
            reverse(val,n-k,n-1);
            reverse(val,0,n-1);
        }else if(dir.equals("left")){
            reverse(val,0,k-1);
            reverse(val,k,n-1);
            reverse(val,0,n-1);
        }
        return val;
        
    }
    //Problem Statement:Move all Zeros to the end of the array
    public static int[] lect1_7(int[] val){
        //time :O(N)
        int zeroIndex = 0;
        for(int i=0;i<val.length;i++){
            if(val[i]!=0){
                int temp = val[zeroIndex];
                val[zeroIndex]=val[i];
                val[i]=temp;
                zeroIndex++;
            }
        }
        return val;
    }
    //Problem Statement:Find the union
    //Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays
    public static int[] lect1_9(int[] arr1,int[] arr2,int n,int m){
        //Time O(m+n)
        int[] arr3 = new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m) {
            if(arr1[i]<arr2[j]){
                if(k==0 || arr3[k-1]!=arr1[i]){
                    arr3[k++] = arr1[i];
                }
                i++;
            }else if(arr1[i]>arr2[j]){
                if(k==0|| arr3[k-1]!=arr2[j]){
                    arr3[k++] = arr2[j];
                }
                j++;
            }else {
                if(k==0 || arr3[k-1]!=arr1[i]){
                    arr3[k++]=arr1[i];
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (k == 0 || arr3[k - 1] != arr1[i]) {
                arr3[k++] = arr1[i];
            }
            i++;
        }
        while (j < m) {
            if (k == 0 || arr3[k - 1] != arr2[j]) {
                arr3[k++] = arr2[j];
            }
            j++;
        }
        return Arrays.copyOfRange(arr3, 0, k);
    }
    //Problem Statement:Find the missing number in an array
    public static int lect1_10(int[] val,int n){
        int num=1;
       for(int i=0;i<n-1;i++){
           if(val[i]==num){
            num++;
            continue;
           }else{
            return num;
           }
       }
       return -1;
    }
    public static int lect1_10_summation(int[] val,int n){
        int sum=(n*(n+1))/2;
        int sumVal=0;
       for(int i=0;i<n-1;i++){
           sumVal += val[i];
       }
       return sum-sumVal;
    }
    //Problem Statement:Count Maximum Consecutive One's in the array
    public static int lect1_11(int[] val){
        int count=0;
        int max=0;
        for(int i=0;i<val.length;i++){
            if(val[i]==0)
                count=0;
            else{
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
    //Problem Statement: Find the number that appears once, and the other numbers twice
    //Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
    public static int lect1_12(int[] val){
        //Time: O(N*logM) , M=n/2+1
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0;i<val.length;i++){
            int value = mpp.getOrDefault(val[i], 0);
            mpp.put(val[i], value+1);
        }
        for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
            if(it.getValue()==1)
                return it.getKey();
        }
        return -1;
    }
    public static int lect1_12_xor(int[] val){
        //Time: O(N)
        int res=0;
        for(int i =0;i<val.length;i++){
            res = res ^ val[i];
        }
        return res;
    }

    //Problem Statement:: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
    public static int lect1_13(int[] val,int k){
        //Time :O(N^2)
       int n = val.length;
       int max=0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=val[j];
                if(sum==k){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
    //only positive 
    public static int lect1_13_twopointers(int[] val,int k){
        //Time :O(2*N)
       int n = val.length;
       int left=0,right=0;
       long sum =val[0];
       int maxLen=0;
       while (right<n) {
            while (left<=right && sum>k) {
                sum-=val[left];
                left++;
            }
            if (sum==k) {
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;
            if(right<n){
                sum+=val[right];
            }
       }
       return maxLen;
    }
    //Problem Statement: Longest Subarray with sum K | [Postives and Negatives]
    //Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
    public static int lect1_14(int[] val,int k){
        int max =0;
        for(int i=0;i<val.length;i++){
            int sum =0;
            for(int j=i;j<val.length;j++){
                sum+=val[j];
                if(sum==k){
                    max = Math.max(max, j-i+1);
                }else if(sum>k){
                    break;
                }
            }
        }
        return max;
    }
    public static int lect1_14_hashmap(int[] val,int k){
        int max =0;
        int sum=0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<val.length;i++){
            sum+=val[i];
            if(sum==k){
                max= Math.max(max, i+1);
            }
            int rem = sum-k;
            if(mpp.containsKey(rem)){
                int len = i- mpp.get(rem);
                max = Math.max(max, len);
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum, i);
            }
        }
        return max;
    }
}
