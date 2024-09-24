package com.code.java.company.WissenTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        List<int[]>  val = splitArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},3);
        for (int[] v:val){
            System.out.println(Arrays.toString(v));
        }
    }
    public static List<int[]> splitArray(int[] original,int splitSize){
        List<int[]> arrays= new ArrayList<>();
        for (int i=0;i<original.length;i+=splitSize){
            int[] arrayChunk = new int[Math.min(splitSize, original.length-i)];
            System.arraycopy(original,i,arrayChunk,0,arrayChunk.length);
            arrays.add(arrayChunk);
        }
        return arrays;
    }
}
