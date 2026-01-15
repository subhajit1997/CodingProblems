package com.code.java.course.gfg.Week2.arrays.videos;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        printGroups(new int[]{1,0,0,0,1,0,0,1,1,1,1});
        printGroupsEfficient(new int[]{1,0,0,0,1,0,0,1,1,1,1});
    }
    static void printGroups(int arr[]){
        int n = arr.length;
        int group_1s = 0;
        int group_0s=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]==0){
                    group_1s++;
                }else{
                    group_0s++;
                }
            }
        }
        if(arr[n-1] == 0){
            group_0s++;
        }else{
            group_1s++;
        }
        
        int flipGroup = (group_1s < group_0s) ? 1 : 0;
        // Traverse again to find flipping positions
        for (int i = 0; i < n; i++) {
            if (arr[i] == flipGroup) {
                int start = i;
                while (i < n && arr[i] == flipGroup) {
                    i++;
                }
                int end = i - 1;
                System.out.println("From " + start + " to " + end);
            }
        }
    }
    static void printGroupsEfficient(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0])
                    System.out.print("From "+i+" to ");
                else
                    System.out.println(i-1);
            }
        }
        if(arr[n-1]!=arr[0])
            System.out.println(n-1);
    }
}
