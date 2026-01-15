package com.code.java.course.gfg.Week2.searching.videos;

public class _10_SearchInSortedRotatedArray {
    public static void main(String[] args) {
        System.out.println(searchNaive(new int[]{10,20,40,60,5,8},6,5));
    }
    //naive approach - Time- O(N) , space-O(1)
    static int searchNaive(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }

    //efficient approach - Time- O(logN) , space-O(1)
    static int searchEfficient(int arr[],int n,int x){
        //like normal binary search
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            //left half sorted check
            if(arr[low]<=arr[mid]){
                if(x>=arr[low] && x<arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            //right half sorted check
            else{
                if(x>arr[mid] && x<=arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}
