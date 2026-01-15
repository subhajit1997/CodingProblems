package com.code.java.course.gfg.Week2.recursion.videos;

public class GenerateSubsets {
    public static void main(String[] args) {
        generateSubsets("ABC", "", 0);
    }
        
    private static void generateSubsets(String s,  String current,int i) {
        if(i==s.length()){
            System.out.println(current);
            return;
        }
        generateSubsets(s, current, i+1);
        generateSubsets(s, current+s.charAt(i), i+1);
    }
}
