package com.code.java.course.striver.A2ZDSA.Step1.Step1_4;

/**https://www.codingninjas.com/studio/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 *
 */

import java.util.Scanner;

public class ArmstrongNumb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(armstrong(n));

    }
    public static boolean armstrong(int n){
        int temp=0,sum=0,digit=0,last=0;
        temp=n;
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            last = temp%10;
            sum = sum +(int)Math.pow(last, digit);
            temp = temp/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
