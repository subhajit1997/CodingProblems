package com.code.java.course.codingblocks.Lecture19;

public class _31stDec {
    public static void main(String[] args) {
        /*
            Recursion: A function calls iteself
                        -> Useful for repeated small sub-problems

                        -> Base case
                        -> self work
                        -> do recursion when : we need to print all posibilities of coin toss/substring etc 
        */

        //print n to 1
        /*
            small sub-problem: I will print 10 and recursion you print from 9-1
                                by me       by recurison
                                10          [9.....1]
                                n               (n-1)
        */
        System.out.println("printRecursion");
        printRecursion(10);
        
        System.out.println("printAssendingRecursion");
        //print 1 to n
        /*
            small sub-problem: I will print 10 , recursion give me (1-9) elemnts
                                1)  1-9     10
                                2)  1-8      9
                                3)  1-7      8
                                4)  1-6      7
                                ....
                                )   1-1      2   
                                             1   (base case)
        */
        printAssendingRecursion(10);

        //sum using recursion
        System.out.println("sumRecursion");
        System.out.println(sumRecursion(10));

        //factorial n!=1*2*3..n
        System.out.println("factorialRecursion");
        System.out.println(factorialRecursion(5));

        //power
        System.out.println("power");
        System.out.println(power(3,4));
        
        //linear search
        int arr[] = {1,6,-7,9,10,-14,11};
        int ans = ls(arr,11,0);
        System.out.println(ans);


    }

    private static int power(int a, int b) {
        if(b==0)
            return 1;
        return a*power(a, b-1);
        
    }

    private static int factorialRecursion(int n) {
        if(n==1)
            return 1;
        return n*factorialRecursion(n-1);
    }

    private static int sumRecursion(int n) {
        if(n==1)
            return 1;
        return n+sumRecursion(n-1);
    }

    private static void printAssendingRecursion(int n) {
        
        if(n==0)
            return;
        printAssendingRecursion(n-1); // 1=> n-1 bring recursion
        System.out.println(n); //sub-problem
       
    }

    private static void printRecursion(int n) {//n=> 1
        if(n==0)
            return;
        System.out.println(n); //small sub problem
        printRecursion(n-1);// recursive call
    }

    private static int ls(int[] arr, int target,int idx) {
        if(idx==arr.length)
            return -1;
        if(arr[idx]==target)
            return idx;
        int rest_of_array = ls(arr, target, idx+1);
        return rest_of_array;
    }
}
