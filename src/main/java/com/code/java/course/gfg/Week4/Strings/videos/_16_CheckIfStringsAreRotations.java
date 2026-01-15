package com.code.java.course.gfg.Week4.Strings.videos;

public class _16_CheckIfStringsAreRotations {
    public static void main(String[] args) {
        System.out.println(areRotations("ABAB","ABBA"));
        System.out.println(areRotationsBetter("ABCD","CDAB"));
    }

    //naive approach
    // rotate one letter at a time and check 

    // time : O(n^2)
    static boolean areRotations(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        char []a1 = str1.toCharArray();
        char []a2 = str2.toCharArray();
        for(int i=0;i<a1.length;i++){
            char temp = a1[0];
            for(int j=0;j<a1.length-1;j++)
                a1[j] = a1[j+1];
            a1[a1.length-1] = temp;
            if(isEqual(a1,a2))
                return true;
        }
        return false;
    }
    private static boolean isEqual(char[] a1, char[] a2) {
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i])
                return false;
        }
        return true;
    }


    // better approach time: O(N)
    // concanitate the sring with itself and check if the second string is a substring of the first string
    static boolean areRotationsBetter(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        String str = str1+str1;
        return str.indexOf(str2)>=0;
    }

}
