package com.code.java.course.gfg.Week4.Strings.videos;

public class _5_CheckIfAStringIsSubsequenceOfOther {
    public static void main(String[] args) {
        System.out.println(isSubSeq("abcde", "aed", 5, 3));
    }
    //optimised method, Time - O(n+m) space - O(1)
    static boolean isSubSeq(String s1,String s2, int n , int m){
        int j=0;
        for(int i=0;i<n && j<m ; i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
    // recursive method, Time - O(n+m) space - O(n+m)
    static boolean isSubSeqReq(String s1,String s2, int n , int m){
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return isSubSeqReq(s1,s2,n-1,m-1);
        }else
            return isSubSeqReq(s1,s2,n-1,m);
    }
}
