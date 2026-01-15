package com.code.java.course.gfg.Week4.Strings.videos;

public class _17_AnagramSearch {
    public static void main(String[] args) {
        
    }
    //naive approach time: O(n-m+1)*m 
    static boolean isPresent( String txt, String pat){
        int m = pat.length();
        int n = txt.length();
        for(int i=0;i<=n-m;i++){
            if(areAnagram(pat,txt,i))
                return true;
        }
        return false;
    }
    private static boolean areAnagram(String pat, String txt, int i) {
        int []count = new int[256];
        for(int j=0;j<pat.length();j++){
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for(int j=0;j<256;j++){
            if(count[j]!=0)
                return false;
        }
        return true;
    }
}
