package com.code.java.course.codingblocks.Lecture8;

public class _3rdDec {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr); 
        
        /*-> reference variable arr stores address of 1st index 
                -> [I@7ad041f3 is the ans
                -> to go any place = K(memory location) + index* (memory of data type)
        */
       arr[0] =10;
        System.out.println(arr[0]);
        
    }
}
