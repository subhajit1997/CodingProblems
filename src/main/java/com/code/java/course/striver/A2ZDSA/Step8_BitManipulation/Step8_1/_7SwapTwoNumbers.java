package com.code.java.course.striver.A2ZDSA.Step8_BitManipulation.Step8_1;

/**
 *
 */
public class _7SwapTwoNumbers {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        a = a^b;
        b = a ^ b;
        a = a ^b;
        System.out.println(a+" "+b);

    }

}
