package com.code.java.course.gfg.Week4.Strings.videos;

public class _11_NaivePatternSearching {
    public static void main(String[] args) {
        patSearchinng("ABABABCD","ABAB");
    }

    // Naive Pattern Searching , time : O(n-m+1)*m 
    static void patSearchinng(String txt,String pat){
        int m=pat.length();
        int n=txt.length();
        for(int i=0;i<=(n-m);i++){
            int j;
            for(j=0;j<m;j++)
                if(pat.charAt(j)!=txt.charAt(i+j))
                    break;
            
            if(j==m)
                System.out.print(i+" ");
        }
    }
}
