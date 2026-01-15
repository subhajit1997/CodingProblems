package com.code.java.company.Target;

/**
 * 	• Find the avg of elements in array.
 */
public class AverageElementArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,5,7,8};
        System.out.println(average(arr));
    }

    private static double average(int[] arr) {
        if(arr.length>1){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum +=arr[i];
            }
            return (double)sum/ arr.length;
        }else
            return arr[0];
    }
}
