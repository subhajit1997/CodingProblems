package com.code.java.course.codingblocks.Lecture18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _30thDec {
    public static void main(String[] args) {
        /*
            Array List->
                ->class in java
                ->non-primitive (stored in heap)
                ->dynamic size array
            
                ->ArrayList<Type> l = new ArrayList<Type>();

                ->capacity = 2*oldcapacity stored in form of array
                 for very long data: capacity = oldCapacituy+ oldcapcity/2;

                ->initial capacity at start is 10

                ->Type should be non-primitive and use wrapper class

                -> Wrapper class: converting primitive to non-primitive

                        ->compares address for non-primitive
                        ->comapres value for primitive

                        int a =10;
                        Integer b=10;
                        Integer c = 10;
                        System.out.println(a==b); ->    true  as comapres value for primitive
                        System.out.println(b==c); ->    true  as if value is between -128 to 128 is cached so if newly assigned it would point to same location of same address
                        Integer d= a;                   (Auto-boxing)

                        System.out.println(d);    ->    10
                        int e = d;                      (Un-boxing)

                        Integer f=129;
                        Integer g= 129;
                        System.out.println(f==g); ->    false as if value is between -128 to 128 is cached so if newly assigned it would point to same location of same address


        */
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("AC");
        list.add("AD");
        list.add("AE");
        list.add("AF");
        list.add("AG");

        list.add(2,"EF");
        System.out.println(list);

        //For-each loop
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int arr1[][] = {{1,2},{3,4},{5,6}};
        for (int[] arry : arr1) {
            for (int i : arry) {
                System.out.print(i);
            }
            System.out.println();
        }

        //back to arrayl list
        String a = list.get(0);
        String b = list.get(list.size()-1);
        System.out.println(a);
        System.out.println(b);

        //Iterate list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String a1 : list) {
            System.out.println(a1);
        }

        //update / replace
        list.set(3, "a");
        System.out.println(list);

        /*
            update more than size gives error
            list.set(list.size()+1, "a");
            list.set(list.size(), "a");

        */

        //sorting
        Collections.sort(list);
        System.out.println();

        //remove elements
        list.remove(0);
        System.out.println(list);

        //Question : Sum of two arrays
        int n1 = 4;
        int a1[] = {1,0,2,9};
        int n2= 5;
        int a2[] = {3,4,5,6,7};
        SumOfTwoArray(a1,a2,n1,n2);


        /*
            StringBuilder: 
                ->  StringBuilder sb = new StringBuilder();
                ->  StringBuilder sb = new StringBuilder("hello");
                ->  append: Adding new values to stringbuilder
                ->  internally stores a character array , when growing does 2*n
                ->  StringBuilder is very faster than String
        */
        String s ="";
        long start = System.nanoTime();
        int n =10000;
        for (int i = 0; i < n; i++) {  //Time complexity : O(N^2) as string literals during concatination creates aniother string
            s+=i;
        }
         long end = System.nanoTime();
         System.out.println(end-start);
       
        
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) { //Time complexity : O(N) as StringBuilder faster
            sb.append(i);
        }
        long end1 = System.nanoTime();
        System.out.println(end1-start1);

         //So , StringBuilder is very faster than String

         //Iterafte stringbuilder
         StringBuilder sb1 = new StringBuilder();
         sb1.append("a");
         sb1.append("b");
         for (int i = 0; i < sb1.length(); i++) {
            System.out.println(sb1.charAt(i));
         }
         sb1.replace(0, 1, "zzz");
          System.out.println(sb1.toString());

        //Question:2 reverse using stringbuilder
    }

    //https://www.geeksforgeeks.org/problems/sum-of-two-numbers-represented-as-arrays3110/1
    private static void SumOfTwoArray(int[] a1, int[] a2, int n1, int n2) {
        ArrayList<Integer> ans= new ArrayList<>();

    }
}
