package com.problems.course.striver.A2ZDSA.Step1.Step1_4;

/**
 * https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(336));
    }

    public static int countDigits(int n){
        int num=n;
        int count =0;
        while(num>0){
            int val=num%10;
            if(val!=0){
                if(n%(val)==0){
                    count++;
                }
            }
            num = num/10;
        }
        return count;
    }
}
