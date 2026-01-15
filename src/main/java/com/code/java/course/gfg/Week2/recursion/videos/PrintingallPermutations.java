package com.code.java.course.gfg.Week2.recursion.videos;

public class PrintingallPermutations {
    public static void main(String[] args) {
        permute("ABC",0);
            }
        
    private static void permute(String s, int i) {
        if(i==s.length()-1){
            System.out.println(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            s = swap(s, i, j);
            permute(s, i+1);
            s = swap(s, i, j);
        }
    }
    private static String swap(String s,int i,int j) {
        char temp;
        char[] charArr = s.toCharArray();
        temp=charArr[i];
        charArr[i]=charArr[j];
        charArr[j]=temp;
        return String.valueOf(charArr);
    }
}
