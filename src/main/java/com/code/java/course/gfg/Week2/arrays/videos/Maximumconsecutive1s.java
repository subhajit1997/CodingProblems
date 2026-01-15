package com.code.java.course.gfg.Week2.arrays.videos;

public class Maximumconsecutive1s {
    public static void main(String[] args) {
        System.out.println(maxConsucutiveOnes(new int[]{0,1,1,0,1}));
        System.out.println(maxConsucutiveOnesEfficient(new int[]{0,1,1,0,1}));
    }
    static int maxConsucutiveOnes(int arr[]){
        int res =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int current =0;
            for(int j=i;j<n;j++){
                if(arr[j]==1)
                    current++;
                else
                    break;
            }
            res = Math.max(res,current);
        }
        return res;
    }
    static int maxConsucutiveOnesEfficient(int[] arr){
        int res =0;
        int current =0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                current=0;
            else{
                current++;
                res = Math.max(res,current);
            }
        }
        return res;
    }
}
