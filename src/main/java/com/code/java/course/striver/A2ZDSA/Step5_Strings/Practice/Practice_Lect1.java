package com.code.java.course.striver.A2ZDSA.Step5_Strings.Practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice_Lect1 {
    public static void main(String[] args) {
        System.out.println("Remove Outermost Parentheses: "+lect1_1_bruteforce("()()"));
        System.out.println("Reverse Words in a String : "+lect1_2_bruteforce("this is an amazing program")+
            "\n"+lect1_2_optimised_without_space("this is an amazing program"));
        System.out.println(" Largest Odd Number in String: "+lect1_3_bruteforce("52")+
            "\n"+lect1_3_optimised("3542788889"));
        System.out.println("Longest Common Prefix: "+lect1_4_bruteforce(new String[]{"flower","flow","flight"})+
            "\n"+lect1_4_approach2(new String[]{"flower","flow","flight"}));
        System.out.println("Isomorphic Strings: "+lect1_5_bruteforce("paper","title")+
            "\n"+lect1_5_hashmap("paper","title"));
        System.out.println("Rotate String : "+lect1_6_bruteforce("abcde","abced")+
            "\n"+lect1_6_optimised("abcde","cdeab"));
        System.out.println("Valid anagram: "+lect1_7_bruteforce("rat","car"));
    }
    //Problem Statement :Remove Outermost Parentheses
    public static String lect1_1_bruteforce(String s){
        //Time : O(N)
        //space: O(N)
        StringBuilder sb = new StringBuilder();
        StringBuffer result = new StringBuffer();
        int count =0;
        for(char c : s.toCharArray()){
            if(c == '('){
               sb.append(c);
               count++;
            }else if(c==')'){
                sb.append(c);
                count--;
            }
            if(count==0 && sb.length()>0){
                result.append(sb.substring(1, sb.length()-1));
                sb.setLength(0);
            }
        }
        return result.toString();
    }
    //Problem Statement :Reverse Words in a String
    /*
     * Example 1:
    Input: s=”this is an amazing program”
    Output: “program amazing an is this”
     */
    public static String lect1_2_bruteforce(String s){
        //Time: O(N)
        //Space: O(N)
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String lect1_2_optimised_without_space(String s){
        //Time :O(N)
        //space = O(1)
        int left = 0,right = s.length()-1;
        String temp = "";
        String result = "";
        while (left<=right) {
            char ch = s.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }else if(ch == ' '){
                if(result.isEmpty()){
                    result = temp;
                }else{
                    result = temp +" "+ result;
                }
                temp = "";
            }
            left++;
        }
        if(!temp.isEmpty()){
            if(result.isEmpty()){
                result = temp;
            }else{
                result = temp+" "+result;
            }
        }
        return result;
    }
    //Problem Statement :1903. Largest Odd Number in String
    public static String lect1_3_bruteforce(String s){
        //Time : O(N)
        //space : O(N)
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(Integer.parseInt(sb.substring(i, i+1)));
            if(Integer.parseInt(sb.substring(i, i+1))%2!=0){
                return sb.substring(0, i+1);
            }
        }
        return "";
    }
    public static String lect1_3_optimised(String s){
        //Time :O(N)
        //Space: O(1)
        for(int i=s.length()-1;i>=0;i--){
            Character c = s.charAt(i);
            if(Integer.parseInt(c.toString(c))%2!=0){
                return s.substring(0, i+1);
            }
        }
        return "";       
    }
    //Problem Statement :14. Longest Common Prefix
    public static String lect1_4_bruteforce(String[] s){
        //Time : O(N^2)
        //Space: O(1)
        String common = "";
        Character commonChar = null;
        int index =0;
        while (true) {
            Character ch ;
            for(int i=0;i<s.length;i++){
                String str = s[i];
                if(index >= str.length()){
                    return common;
                }
                ch = str.charAt(index);
                if(commonChar==null){
                    commonChar = ch;
                }else if(commonChar == ch){
                    continue;
                }else if(commonChar != ch){
                    commonChar = null;
                    break;
                }
            }
            if(commonChar!=null){
                common += commonChar;
                commonChar = null;
            }
            index++;
        }
    }
    public static String lect1_4_approach2(String[] s){
        //Time : O(N^2)
        //Space: O(1)
        String common = s[0];
        for(int i=1;i<s.length;i++){
            int len1 = common.length();
            int len2 = s[i].length();
            if(len1>len2){
                common = findCommon(common, s[i]);
            }else{
                common = findCommon(s[i],common);
            }
        }
        return common;
    }
    public static String findCommon(String s1,String s2){
        String commonString = "";
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                commonString += s1.charAt(i);
            }else{
                return commonString;
            }
        }
        return commonString;
    }
    //Problem Statement :205. Isomorphic Strings
    public static boolean lect1_5_bruteforce(String s,String t){   
        //Time :O(N) 
        //space :O(1)
        if(s.length()!=t.length())
            return false;
        int[] val1 = new int[256];
        int[] val2 = new int[256];
        for(int i=0;i<s.length();i++){
            if(val1[s.charAt(i)]!=val2[t.charAt(i)]){
                return false;
            }
            val1[s.charAt(i)]=i+1;
            val2[t.charAt(i)]=i+1;
        }
        return true;
    }
    public static boolean lect1_5_hashmap(String s,String t){   
        //Time :O(N) 
        //space :O(1)
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> mpp1 =new HashMap<>();
        Map<Character,Integer> mpp2 =new HashMap<>();
        for(int i=0;i<s.length();i++){
            mpp1.putIfAbsent(s.charAt(i), i);
            mpp2.putIfAbsent(t.charAt(i), i);
            if(!mpp1.get(s.charAt(i)).equals(mpp2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    //Problem Statement :796. Rotate String
    public static boolean lect1_6_bruteforce(String s,String goal){   
        //TIME :O(N^2)
        //SPACE: O(N)
        int n = s.length();
        if(n!=goal.length())
            return false;
        char[] sChar = s.toCharArray();
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(sChar));
            char temp = sChar[0];
            for(int j=0;j<n-1;j++){
                sChar[j] = sChar[j+1];
            }
            sChar[n-1] = temp;
            if(goal.equals(new String(sChar))){
                return true;
            }
        }
        return false;
    }
    public static boolean lect1_6_optimised(String s,String goal){   
        //TIME :O(N)
        //SPACE: O(N)
        int n = s.length();
        if(n!=goal.length())
            return false;
        String str = s+s;
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
    //Problem Statement :242. Valid Anagram
    public static boolean lect1_7_bruteforce(String s,String t){   
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int valS = sMap.getOrDefault(s.charAt(i), 0);
            sMap.put(s.charAt(i), valS+1);

            int valT = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), valT+1);
        }
        for(Map.Entry<Character,Integer> mpp: sMap.entrySet()){
            Character chr = mpp.getKey();
            if(mpp.getValue()==tMap.get(chr)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
