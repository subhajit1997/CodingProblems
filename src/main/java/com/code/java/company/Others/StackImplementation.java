package com.code.java.company.Others;

public class StackImplementation {

    public static void main(String[] args) {
        indexOfElement(new int[]{2,4,7,9,},9);
    }
    public static int indexOfElement(int[] arr,int index){
        int n = arr.length;
        int right = n-1,left =0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == index)
                return mid;
            if(arr[mid]<index)
            {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }


}
