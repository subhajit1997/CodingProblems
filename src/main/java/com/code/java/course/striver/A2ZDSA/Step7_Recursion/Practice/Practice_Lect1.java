package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Practice;

public class Practice_Lect1 {
    public static void main(String[] args) {
        lect1_1();
        System.out.println(lect1_2(3.0,5));
        System.out.println(lect1_3(2));
    }
    //Problem Statement: Recursive Implementation of atoi()
    // Given a string s, convert it into integer format without utilizing any built-in functions
    /*
     *  Input: s = "  1231231231311133"
        Output: 2147483647
        Explanation: The converted number is greater than 231 - 1, therefore print 231 - 1 = 2147483647.
     */
    public static void lect1_1(){
        String str="112";
        System.out.println(myAtoiRecursive(str,str.length()));
    }
    private static int myAtoiRecursive(String str, int n) {
        if(str=="" || !str.chars().allMatch(Character::isDigit)){
            return 0;
        }
        if(n==1)
            return str.charAt(0)-'0';
        return (10 * myAtoiRecursive(str, n-1)+str.charAt(n-1)-'0');
    }
    //Implement Pow(x,n) | X raised to the power N
    public static double lect1_2(double x,int n){
        if(n==0) //base case power(x,0) =1 
            return 1; //any number to the power 0 is 1
        if(n<0)
            return 1/lect1_2(x, -n); // negative powers: reciprocal of positive power
        return x * lect1_2(x, n-1); // multiply x by x^(n-1)
    }
    //Count Good Numbers
    public static int lect1_3(long n){
        final long MOD = 1_000_000_007;
        if (n == 0) return 0;
        if (n == 1) return 5;
        long evenPosition = (n+1)/2;
        long oddPosition = n/2;

        long evenCount = modPow(5,evenPosition);
        long oddCount = modPow(4,oddPosition);
        return (int) ((evenCount*oddCount)%MOD);
    }
    private static long modPow(long base, long exp) {
        final long MOD = 1_000_000_007;
        if(exp==0)
            return 1;
        if(exp==1)
            return base%MOD;
        long half = modPow(base, exp/2);
        long halfSquare = (half*half)%MOD;
        if(exp%2==0)
            return halfSquare;
        else
            return (halfSquare*(base%MOD))%MOD;
        
    }
}
