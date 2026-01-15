package com.code.java.course.striver.A2ZDSA.Step5_Strings.Step5_1;

import java.util.HashMap;
import java.util.Map;

public class _7ValidAnagram {
    public static void main(String[] args) {
        System.out.println("Valid anagram: "+lect5_7_bruteforce("rat","car"));
    }
    public static boolean lect5_7_bruteforce(String s,String t){   
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

