package com.problems.course.striver.A2ZDSA.Step1.Step1_4;

/**
 * https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(calcGCD(20,30));
        System.out.println(calcGCD1(20,30));
    }
    //O(m)
    public static int calcGCD(int n, int m){
        if(!(n>0 ||n<Integer.MAX_VALUE))
            return -1;
        int gcd=0;
        for(int i=1;i<=n||i<=m;i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    //O(log(n))
    public static int calcGCD1(int n, int m){
        if(m==0){
            return n;
        }
        return calcGCD1(m, n%m);
    }
}
