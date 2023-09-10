package com.problems.company.Target;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicateStringArray {
    public static void main(String[] args) {
        String[] input = {"apple", "banana", "orange", "apple", "banana"};
        String[] result =  removeDuplicates(input);
        System.out.println(Arrays.toString(result));
        String[] result1 =  removeDuplicatesSet(input);
        System.out.println(Arrays.toString(result1));
    }

    private static String[] removeDuplicatesSet(String[] input) {
        Set<String> set = new HashSet<String>();
        for(String str:input){
            set.add(str);
        }
        String[] result= new String[set.size()];
        int i=0;
        for(String str: set){
            result[i++]=str;
        }
        return result;
    }

    private static String[] removeDuplicates(String[] input) {
        int uniqueCount = 0;
        String[] uniqueArray = new String[input.length];

        for(int i=0;i<input.length;i++){
            boolean isDublicate =false;
            for(int j=0;j<uniqueCount;j++){
                if(input[i].equals(uniqueArray[j])){
                    isDublicate =true;
                    break;
                }
            }
            if(!isDublicate){
                uniqueArray[uniqueCount] =input[i];
                uniqueCount++;
            }
        }
        return Arrays.copyOf(uniqueArray,uniqueCount);
    }


}
