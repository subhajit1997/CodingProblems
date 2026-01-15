package com.code.java.course.gfg.Week2.arrays.videos;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(findMajority(new int[]{8,7,6,8,6,6,6,6}));
    }
    static int findMajority(int arr[]){
        int n =arr.length;
        int count=1;
        for(int i=0;i<n;i++){
            count=1;
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return i;
            }
        }
        return -1;
    }

    static int findMajorityEffiecientMoodysALgo(int arr[]){
        int n = arr.length;
        int res=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0)
            {
                res=i;
                count=1;
            }
        }

        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            if(count<=n/2)
                res=-1;
        }
        return res;
    }
}
