package com.code.java.course.gfg.Week2.arrays.videos;

public class MaximumAppearingElement {
    public static void main(String[] args) {
        System.out.println(maxAppear(new int[]{1,2,5,15},new int[]{5,8,7,18}));
        System.out.println(maxAppearEfficient(new int[]{1,2,5,15},new int[]{5,8,7,18}));
    }
    static int maxAppear(int[] left,int right[]){
        int n = left.length;
        if(n!=right.length)
            return -1;
        int[] freq = new int[100];
        for(int i=0;i<n;i++){
            for(int j=left[i];j<=right[i];j++){
                freq[j]++;
            }
        }
        int result =0;
        for(int i=0;i<100;i++){
            if(freq[i]>freq[result])
                result = i;
        }
        return result;
    }

    static int maxAppearEfficient(int[] left,int right[]){
        int n = left.length;
        if(n!=right.length)
            return -1;
        int[] freq = new int[100];
        for(int i=0;i<n;i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int result=0;
        for(int i=1;i<100;i++){
            freq[i]=freq[i-1]+freq[i];
            if(freq[i]>freq[result])
                result = i;
        }
        return result;
    }
}
