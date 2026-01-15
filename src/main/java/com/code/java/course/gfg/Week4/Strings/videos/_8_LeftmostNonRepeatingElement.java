package com.code.java.course.gfg.Week4.Strings.videos;

public class _8_LeftmostNonRepeatingElement {
    public static void main(String[] args) {
        System.out.println(leftMostNonRepeating("geeksforgeeks"));
        System.out.println(leftMostNonRepeatingBetter("geeksforgeeks"));
    }
        //naive approach , Time : O(N^2) space:O(1)
        static int leftMostNonRepeating(String str){
           for(int i=0;i<str.length();i++){
                boolean flag = false;
                for(int j=0;j<str.length();j++){
                    if(i!=j && str.charAt(i)==str.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    return i;
                }
           }
           return -1;
           
        }
        //Better , Time : O(N) space:O(1)
        static int leftMostNonRepeatingBetter(String str){
            int count[] = new int[256];
            for(int i=0;i<str.length();i++){
                count[str.charAt(i)]++;
            }
            for(int i=0;i<str.length();i++){
                if(count[str.charAt(i)]==1)
                    return i;
            }
            return -1;
        }
}
