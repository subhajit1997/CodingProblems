package com.code.java.company.AthenaHealth.Strings;

public class _1ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reveStringOptimised("hello mny bname syubha"));
    }
    //Time :O(N) space : O(N)
    public static String reverseString(String str){
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char swap = ch[i];
            ch[i] = ch[ch.length-i-1];
            ch[ch.length-i-1]=swap;
        }
        return new String(ch);
    }
    //optimised Time : O(N) space:O(1)
    public static String reveStringOptimised(String str){
        int i=0,j=str.length()-1;
        while (i<j) {
            str = swap(str,i,j);
            i++;
            j--;
        }
        
        return str;
    }
    public static String swap(String str,int i,int j){
        StringBuffer sb = new StringBuffer(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

}
