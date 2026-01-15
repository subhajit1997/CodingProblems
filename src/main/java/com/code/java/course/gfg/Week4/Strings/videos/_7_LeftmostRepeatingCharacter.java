package com.code.java.course.gfg.Week4.Strings.videos;

public class _7_LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(leftMostRepeating("abcd"));
        System.out.println(leftMostRepeatingbetter("abcd"));
    }
    //naive approach , Time : O(N) space:O(1)
    static int leftMostRepeating(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    //betrter approach, Time : O(N) space:O(1)
    static int leftMostRepeatingbetter(String str){
        int []count = new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
}
