package com.code.java.course.codingblocks.Lecture13;

import java.util.Arrays;
import java.util.Scanner;

public class Contest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * 1)
         * Take as input N, a number. Take N more inputs and store that in an array.
         * Write a recursive function which inverses the array. Print the values of
         * inverted array
         * 
         * Input Format
         * Enter a number N and take N more inputs
         * 
         * Output Format
         * Display the values of the inverted array in a space separated manner
         */
        int n1 = 5;
        int arr1[] = { 0, 2, 4, 1, 3 };

        int ans1[] = inverseArray(arr1, n1);
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + " ");
        }
        /*
         * 2) Sum Tripple
         * Take as input N, the size of array. Take N more inputs and store that in an
         * array. Take as input “target”, a number. Write a function which prints all
         * triplets of numbers which sum to target.
         * 
         * Sample Input
         * 9
         * 5 7 9 1 2 4 6 8 3
         * 10
         * Sample Output
         * 1, 2 and 7
         * 1, 3 and 6
         * 1, 4 and 5
         * 2, 3 and 5
         */
        int n2 = 9;
        int[] arr2 = { 5, 7, 9, 1, 2, 4, 6, 8, 3 };
        int targer3 = 10;
        sumOfThree(n2, arr2, targer3);

        /*
         * 3)Arrays-Linear Search
         * Take as input N, the size of an array. Take N more inputs and store that in
         * an array. Take another number’s input as M. Write a function which returns
         * the index on which M is found in an array, in case M is not found -1 is
         * returned. Print the value returned.
         * 
         * It reads a number N.
         * 2.Take Another N numbers as an input and store them in an Array.
         * Take another number M as an input.
         * If M is found in the Array the index of M is returned else -1 is returned and
         * print the value returned.
         */
        int n3 = 5;
        int arr3[] = { 2, 4, 6, 9, 17 };
        int target3 = 17;
        System.out.println(linearSearch(arr3, n3, target3));

        /*
         * 4) Arrays-Target Sum Pairs
         * 
         * Take as input N, the size of array. Take N more inputs and store that in an
         * array. Take as input “target”, a number. Write a function which prints all
         * pairs of numbers which sum to target.
         */
        int n4 = 5;
        int[] arr4 = { 1, 3, 4, 2, 5 };
        int target4 = 5;
        findPairSum(arr4, n4, target4);

        /*
         * 5)Arrays-Max Value In Array
         * Take an input N, the size of array. Take N more inputs and store that in an
         * array. Write a function which returns the maximum value in the array. Print
         * the value returned.
         * 1.It reads a number N.
         * 2.Take Another N numbers as input and store them in an Array.
         * 3.calculate the max value in the array and return that value.
         */

        int n5 = 4;
        int[] arr5 = {2 ,8 ,6 ,4};
        findMaxValue(n5, arr5);
        /*
         * 6) Pair of Roses
         * Deepak has a limited amount of money that he can spend on his girlfriend. So
         * he decides to buy two roses for her. Since roses are of varying sizes, their
         * prices are different. Deepak wishes to completely spend that fixed amount of
         * money on buying roses for her.
         * As he wishes to spend all the money, he should choose a pair of roses whose
         * prices when summed up are equal to the money that he has.
         * Help Deepak choose such a pair of roses for his girlfriend.
         * 
         * NOTE: If there are multiple solutions print the solution that minimizes the
         * difference between the prices i and j. After each test case, you must print a
         * blank line.
         */
        int t6 = 1;
        for(int i=0;i<t6;i++){
            int n6 = 5;
            int arr6[] = {10 ,2, 6 ,8 ,4};
            int m =10;
            int val[]= findPair(n6,arr6,m);
            System.out.println("Deepak should buy roses whose prices are "+val[0]+" and "+val[1]+".");
        }

/*
7) Help ramu
Ramu often uses public transport. The transport in the city is of two types: cabs and rickshaws. The city has n rickshaws and m cabs, the rickshaws are numbered by integers from 1 to n, the cabs are numbered by integers from 1 to m.

Public transport is not free. There are 4 types of tickets:

A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.

Ramu knows for sure the number of rides he is going to make and the transport he is going to use. He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.
*/
        int t7 = 1;
        for (int j = 0; j < t7; j++) {
            int c1 = 1;
            int c2 = 3;
            int c3 = 7;
            int c4 = 19;
            int n = 2;
            int m = 3;
            int[] ai = {2,5};
            int[] bi = {4,4,4};
            System.out.println(findMinSumRamuSpends(c1,c2,c3,c4,n,m,ai,bi));      
        }
/*
8) Alex Goes Shopping
It is Alex’s birthday and she wants to go shopping. She only has ‘A’ units of money and she wants to spend all of her money. However, she can only purchase one kind of item. She goes to a shop which has ‘n’ types items with prices A0,A1,A2,…,An-1. The shopkeeper claims that he has at least ‘k’ items she can choose from. Help her find out if the shopkeeper is correct or not.

Input Format
The first line contains an integer ‘n’ denoting the number of items in the shop. The second line contains ‘n’ space-separated integers describing the respective price of each item. The third line contains an integer ‘q’ denoting the number of queries. Each of the subsequent lines contains two space-separated integers ‘A’ and ‘k’
*/
        System.out.println("alexShoppingLeastKItems");
        int n8 = 4;
        int arr8[] = {100,200,400,100};
        int q=6;
        int a[] = {100,200,500,600,800,1200};
        int k[] = {2,3,4,4,4,1};
        alexShoppingLeastKItems(n8,arr8,q,a,k);
        System.exit(0);

/*
9) Arrays-Reverse an Array
Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that reverses the array. Print the values in reversed array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Reverse the elements in the Array.
4.Print the reversed Array.
*/
        int n9= 5;
        int arr9[] = {0,4,6,8,9};
        reverseArray(n9,arr9);
        for(int i=0;i<n9;i++){
            System.out.println(arr9[i]);
        }
/*
10) Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/
        int n10=5;
        int arr10[] ={-4 ,-1 ,0, 3 ,10};
        squaresOfSortedArray(n10,arr10);
        for (int i = 0; i < n10; i++) {
            System.out.print(arr10[i]+" ");
        }
/*
11)Sort just Zeroes and Ones
Sort just 0 and 1

Input Format
A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
*/  
        int n11= 7;
        int arr11[] = {1,0,0,1,1,0,1};
        sortZerosOnes(n11,arr11);
        for (int i = 0; i < n11; i++) {
            System.out.print(arr11[i]+" ");
        }
/*
12) Calculate The Sum
Raj is a very smart kid who recently started learning computer programming. His coach gave him a cyclic array A having N numbers, and he has to perform Q operations on this array. In each operation the coach would provide him with a number X. After each operation, every element of the cyclic array would be replaced by the sum of itself and the element lying X positions behind it in the cyclic array. All these replacements take place simultaneously. For example, if the cyclic array was [a, b, c, d], then after the operation with X = 1, the new array would be [a+d, b+a, c+b, d+c]. He needs to output the sum of the elements of the final array modulus 10^9+7. He made a program for it but it's not very efficient. You know he is a beginner, so he wants you to make an efficient program for this task because he doesn't want to disappoint his coach.
*/  
        System.out.println("calculateSumCyclicArray");
        int n12 = 5;
        int arr12[] = {1,2,3,4,5};
        int q12=2;
        int x12[] = {1,0};
        System.out.println(calculateSumCyclicArray(n12,arr12,q12,x12));
        

/*
13)Arrays-Bubble Sort
Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that bubble sorts the array. Print the elements of sorted array.
*/
        int n13 = 4;
        int arr13[]= {2,-18,45,30};
        bubbleSort(arr13,n13);
        for (int i = 0; i < arr13.length; i++) {
            System.out.println(arr13[i]);
        }
/*
14) Maximum Sum Path in Two Arrays
You are provided two sorted arrays. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.
2 3 7 10 12 15 30 34
1 5 9 8 10 15 16 19

*/
        System.out.println("findMaxpath");
        int t14=1;
        for (int j = 0; j < t14; j++) {
            int n14= 8;
            int m14= 8;
            int arrN[] = {2, 3 ,7 ,10 ,12 ,15 ,30 ,34};
            int arrM[] = {1, 5 ,7 ,8 ,10, 15 ,16 ,19};
            System.out.println(findMaxpath(n14,m14,arrN,arrM)); 
        }

/*
15)Arrays-Selection Sort
Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that selection sorts the array. Print the elements of sorted array.
*/
        int n15=5;
        int arr15[] = {4,2,7,11,3};
        selectionSort(n15,arr15);
        for (int i = 0; i < n15;i++) {
            System.out.print(arr15[i]+" ");
        }
/*
16) Arrays-Insertion Sort
Given an array A of size N , write a function that implements insertion sort on the array. Print the elements of sorted array.
*/
        int n16 = 5;
        int arr16[] = {4,2,7,11,3};
        insertionSort(n16,arr16);
        for (int i = 0; i < n16;i++) {
            System.out.print(arr16[i]+" ");
        }
/*
17)Maximum Circular Sum
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
*/
        int t17 = 1;
        for (int i = 0; i < t17; i++) {
            int n17 = 7;
            int arr17[] = {8 ,-8, 9 ,-9 ,10, -11 ,12};
            System.out.println(maximumCircularSum(n17,arr17));
        }
/*
18)Sorting Patient Severity Levels in Hospitals
In a busy hospital emergency room, patients are triaged based on their severity levels to prioritize treatment. Each patient is assigned a severity code:
● 0: Non-urgent cases
● 1: Moderately urgent cases
● 2: Critical cases
The hospital's system must efficiently sort these severity levels to ensure that critical cases are attended to first, followed by moderately urgent, and finally, non-urgent cases. You are tasked with writing a function that takes a list of integers representing patient severity levels and sorts it in ascending order. The goal is to ensure patients are categorized by their severity efficiently.
*/

        int n18 =5;
        int arr18[] = {0,1,2,1,2};
        sortpatientsSeverity(n18,arr18);
        System.out.println();
        for (int i = 0; i < n18; i++) {
            System.out.println(arr18[i]);
        }
/*
19)Product of Array Except Self
Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].
Challenge : do this without division in linear time
*/
        int n19=4;
        int[] arr19={1,2,3,4};
        long ans19[] = productOfArrayExceptSelf(arr19,n19);
        for (int i = 0; i < n19; i++) {
            System.out.print(ans19[i]+" ");
        }
/*
20)Running Sum of the Array
Given an array nums of length n. We define a running sum of an array as for every index runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of array for each i (0 <= i < n).
*/
        int n20=4;
        int arr20[] = {1,2,3,4};
        int[] ans20 = runningSum(n20,arr20);
        for (int i = 0; i < n20; i++) {
            System.out.print(ans20[i]+" ");
        }
/*
21)Von Neuman Loves Binary
Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.
*/
        int n21=1;
        if(n21<=1000){
            long arr21[]={101,1111,00110,111111};
            for (int i = 0; i < n21; i++) {
                long ans = binaryToDecimal(arr21[i]);
                if(ans!=-1)
                    System.out.println(ans);
            }
        }
/*
22)Rain Water Trapping
You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.
*/
        int t22= 1;
        for (int j = 0; j < t22; j++) {
            int n22  =6;
            int[] arr22= {3 , 0 , 0 , 2,  0  ,4};
            System.out.println(findRainWaterTrapped(n22,arr22));       
        }
/*
23)Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
You may assume that the array is non-empty and the majority element always exist in the array.
*/
        int n23 = 5;
        int[] arr23 = {-1,-1,2,-1,3};
        System.out.println(findMajorityElement(arr23,n23));
/*
24)Next Permutation
You are given an array of integers that represents a permutation of numbers. Your task is to find the next lexicographical permutation of the array. If such a permutation does not exist (i.e., the array is sorted in descending order), rearrange the array to its smallest permutation (sorted in ascending order).
*/
        System.out.println("Next Permutation");
        int n24=3;
        int[] arr24 = {1,2,3};
        findNextPermutation(n24,arr24);
        
        for (int i = 0; i < arr24.length; i++) {
            System.out.print(arr24[i]+" ");
        }
    }

    private static int calculateSumCyclicArray(int n, int[] arr, int q, int[] x) {
        int finalSum=0;
        for (int i = 0; i < q; i++) {
            int[] temp= new int[n];
            for (int j = 0; j < n; j++) {
                temp[j] =arr[((j-x[i]+n)%n)]+arr[j];
            }
            arr=temp;
        }
        for (int i = 0; i < n; i++) {
            finalSum +=arr[i];
        }
        return finalSum;

    }

    private static void findNextPermutation(int n, int[] arr) {
        //from last find first number that breaks assending
        int indexOfBreak = -1;
        for (int i = n-2; i >= 0; i--) {
            if(arr[i]<arr[i+1]){
                indexOfBreak = i;
                break;
            }
        }

        //replace from just next bigger than indexOfBreak value
        if(indexOfBreak!=-1){
            for (int i = n-1; i >=indexOfBreak; i--) {
                if(arr[indexOfBreak]<arr[i]){
                    int temp = arr[indexOfBreak];
                    arr[indexOfBreak] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }

        //reverse all decreasing from indexOfBreak+1 to n
        int i=indexOfBreak+1;
        int j=n-1;
        while (i<=j) {
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    private static int findMajorityElement(int[] arr, int n) {
        int val=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(count==0){
                val = arr[i];
                count=1;
            }else if(val==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        return val;
    }

    private static int findRainWaterTrapped(int n, int[] arr) {
        int[] left = new int[n];
        int[] right = new int[n];
        int ans=0;
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(arr[i], left[i-1]);
        }
        for (int i = n-2; i >=0; i--) {
            right[i] = Math.max(arr[i], right[i+1]);
        }
        for (int i = 0; i < n; i++) {
            ans+= Math.min(left[i], right[i])-arr[i];
        }
        return ans;
    }

    private static long binaryToDecimal(long val) {
        long ans=0;
        int count=0;
        while (val!=0) {
            long res = val%10;
            if(res!=0 && res!=1)
                return -1;
            ans+=res*Math.pow(2, count++);
            val =val/10;
        }
        return ans;

    }

    private static int[] runningSum(int n, int[] arr) {
        if(!(n>=1 && n<=1000)){
            return arr;
        }
        int sum=arr[0];
        for (int i = 1; i < n; i++) {
            sum+=arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    private static long[] productOfArrayExceptSelf(int[] arr, int n) {
        long[] right = new long[n];
        long[] left = new long[n];
        left[0] =1;
        right[n-1] =1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i-1]*left[i-1];
        }
        for (int i = n-2; i >= 0; i--) {
            right[i] = arr[i+1]*right[i+1];
        }
        for (int i = 0; i < n; i++) {
            left[i] = right[i]*left[i];
        }
        return left;
    }

    private static void sortpatientsSeverity(int n, int[] arr) {
        int highSevarity = 0;
        int midSevarity=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==2)
                highSevarity++;
            else if(arr[i]==1)
                midSevarity++;
        }
        for (int i = n-1; i >=0; i--) {
            if(highSevarity>0){
                arr[i] = 2;
                highSevarity--;
            }
            else if(midSevarity>0){
                arr[i] =1;
                midSevarity--;
            }
            else
                arr[i] =0;
        }
    }

    private static int maximumCircularSum(int n, int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               sum+=arr[(i+j)%n];
               maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    private static void insertionSort(int n, int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    private static void selectionSort(int n, int[] arr) {
        for(int i=0;i<n-1;i++){
            int min_index= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index!=i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index]=temp;
            }
        }
    }

    private static int findMaxpath(int n, int m, int[] arrN, int[] arrM) {
        int i=0;
        int j=0;
        int sumI = 0;
        int sumJ = 0;
        int maxSum= 0;
        while (i<n && j<m) {
           if(arrN[i]>arrM[j]){
                sumJ+=arrM[j];
                j++;

           }else if(arrN[i]<arrM[j]){
                sumI+=arrN[i];
                i++;
           }else{
                maxSum += Math.max(sumJ, sumI)+arrN[i];
                sumI=0;
                sumJ=0;
                i++;
                j++;
           }
        }
        while (i<n) {
            maxSum += arrN[i];
            i++;
        }
        while (j<m) {
            maxSum += arrM[j];
            j++;
        }
        return maxSum;
    }

    private static void bubbleSort(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void sortZerosOnes(int n11, int[] arr11) {
        int countZero=0;
        for (int i = 0; i < n11; i++) {
            if(arr11[i]==0)
                countZero++;
        }
        for (int i = 0; i < countZero; i++) {
            arr11[i]=0;
        }
        for (int i = countZero; i < n11; i++) {
            arr11[i]=1;
        }
    }

    private static void squaresOfSortedArray(int n, int[] arr) {
        for(int i=0;i<n;i++){
            arr[i] = (int)Math.pow(arr[i], 2);
        }
        Arrays.sort(arr);
    }

    private static void reverseArray(int n9, int[] arr9) {
        int i=0;
        int j=n9-1;
        while (i<=j) {
            int temp = arr9[i];
            arr9[i] = arr9[j];
            arr9[j] = temp;
            i++;
            j--;
        }
    }

    // private static void alexShoppingLeastKItems(int n, int[] arr, int q, int[] aArr, int[] kArr) {
    //     for(int i=0;i<q;i++){
    //         int a = aArr[i];
    //         int k = kArr[i];
    //         int leastCount = 0;
    //         for(int j=0;j<n;j++){
    //             int sum=0;
    //             while (sum<=a) {
    //                 if(sum==a)
    //                     break;
    //                 sum+= arr[j];
    //             }
    //             if(sum==a)
    //                 leastCount++;
    //         }
    //         if(k<=leastCount)
    //             System.out.println("Yes ");
    //         else
    //             System.out.println("No ");
    //     }
    // }

    private static void alexShoppingLeastKItems(int n, int[] arr, int q, int[] aArr, int[] kArr) {
        for(int i=0;i<q;i++){
            int a = aArr[i];
            int k = kArr[i];
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(a%arr[j]==0){
                    count++;
                }
            }
            if(k<=count)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    private static int findMinSumRamuSpends(int c1, int c2, int c3, int c4, int n, int m, int[] ai, int[] bi) {
        int totalMinCostRickshaw = 0;
        int totalMinCostCab = 0;
        int totalFinalCost = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            totalMinCostRickshaw += Math.min(ai[i]*c1, c2);
        }
        totalMinCostRickshaw = Math.min(totalMinCostRickshaw, c3);
        for(int i=0;i<m;i++){
            totalMinCostCab += Math.min(bi[i]*c1, c2);
        }
        totalMinCostCab = Math.min(totalMinCostCab, c3);
        totalFinalCost = Math.min(Math.min((totalMinCostRickshaw + totalMinCostCab),c4), totalFinalCost);
        return totalFinalCost;
    }

    private static int[] findPair(int n, int[] arr, int m) {
        Arrays.sort(arr);
        int minPairVal = Integer.MAX_VALUE;
        int minPair[] = new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==m){
                    if(minPairVal>(Math.abs(arr[i]-arr[j]))){
                        minPair[0] = arr[i];
                        minPair[1] = arr[j];
                        minPairVal = Math.abs(arr[i]-arr[j]);
                    }
                }
            }
        }
        return minPair;
    }

    private static void findMaxValue(int n, int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }

    private static void findPairSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        if ((n >= 1 && n <= 1000)) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }
            }
        }
    }

    private static int linearSearch(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static void sumOfThree(int n, int[] arr, int target) {

        Arrays.sort(arr);

        // sum of three
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (target == arr[i] + arr[j] + arr[k]) {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
    }

    private static int[] inverseArray(int[] arr1, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr1[i];
            res[val] = i;
        }
        return res;
    }
}
