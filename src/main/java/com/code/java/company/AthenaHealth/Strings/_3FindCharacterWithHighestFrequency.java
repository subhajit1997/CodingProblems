package com.code.java.company.AthenaHealth.Strings;
/**
 * https://takeuforward.org/data-structure/maximum-occurring-character-in-a-string/
 */
public class _3FindCharacterWithHighestFrequency {
    public static void main(String[] args) {
        System.out.println(maxOccouringChar("app----le"));
    }
    //
    public static char maxOccouringChar(String str){
        char ans = 0;
        int maxFreq = 0,n=str.length();
        int count[] = new int[256];
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
             if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count[ch]++;
                if(count[ch]>maxFreq){
                    maxFreq = count[ch];
                    ans = ch;
                }
            }
        }
        return ans;
    }
}
