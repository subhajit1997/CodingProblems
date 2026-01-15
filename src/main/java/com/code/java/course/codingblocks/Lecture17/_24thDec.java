package com.code.java.course.codingblocks.Lecture17;

import java.util.Scanner;

import com.code.java.course.striver.A2ZDSA.Step1_Basics.Step1_4.sum_of_divisors;

public class _24thDec {
    public static void main(String[] args) {
        String t = "hello123";
        String u = "hello";
        u+="123";
        System.out.println(t==u);
        /*
             String t = "hello123"; -> This is a string literal created in string pool during compile time
             String u = "hello";    -> This is string literanl created in string pool during compile time

             u+="123";     -> when we update this is in run time where its created in heap area
             so u and t are having different address
        */
       String s1 = "hello";
       String t1 = "hell";
       System.out.println(s1==t1); //false
       t1+="o";
       System.out.println(s1==t1); //false
       for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
       }

       boolean ans = equalsTwoString(s1,t1);
       System.out.println(ans); //address comaprison
       System.out.println(s1.equals(t1)); //value comparison

       //palindrome
       System.out.println(checkPalindrome("subbus"));

       /*
        Substring -> continuous part of a string
                 -> maintaining order of character preserved 
       */
      String sub = "abcde";
      System.out.println(sub.substring(0,2));//last index is not covered till 2nd last
      System.out.println(sub.substring(3)); // start index if last index not mnentioned

      String a = "abcd";
      System.out.println();

      //String input
      Scanner sc = new Scanner(System.in);
      //String s2 = sc.next();

      //All SubString
      printAllPossibleSubstring("abcd");
       System.out.println("substring");

      //playing with good substring
      System.out.println(printGoodSubstringMax("cbaeicde"));
       System.out.println();
       System.out.println();
      //print substring in length order
      printSubstringOrder("abcd");
    }



    private static void printSubstringOrder(String s) {
        int n = s.length();
        for(int i=1;i<=n;i++){  //length of substring
            for(int j=0;j+i<=n;j++){ //starting point
                System.out.println(s.substring(j, j+i)); 

            }
        }
    }

    private static int printGoodSubstringMax(String s) {
        int max = -1;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }else{
                max = Math.max(max, count);
                count=0;
            }
        }
        max = Math.max(max, count);
        return max;
    }

    private static boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u') {
            return true;
        }
        return false;
    }

    private static void printAllPossibleSubstring(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(s.substring(i, j));
            }
        }
    }

    private static boolean checkPalindrome(String s) {
        // for (int i = 0; i < s.length()/2; i++) {
        //     if(s.charAt(i)!=s.charAt(s.length()-i-1)){
        //         return false;
        //     }
        // }
        // return true;
        
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
        
    }

    private static boolean equalsTwoString(String s1, String t1) {
        if(s1.length()!=t1.length())
            return false;
       for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=t1.charAt(i))
                return false;
       }
       return true;
    }
}
