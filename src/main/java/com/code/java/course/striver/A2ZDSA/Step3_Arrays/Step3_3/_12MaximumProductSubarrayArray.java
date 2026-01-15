package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Step3_3;

public class _12MaximumProductSubarrayArray {
    public static void main(String[] args) {
                System.out.println("Maximum Product Subarray in an Array: "+lect3_12_bruteforce(new int[]{1,2,-3,0,-4,-5})+
            "\n"+lect3_12_optimal_using_prefix_suffix(new int[]{1,2,-3,0,-4,-5}));

    }
        //Problem Statement :Maximum Product Subarray in an Array
    public static int lect3_12_bruteforce(int[]  arr){
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=i+1;j<arr.length;j++){
                product *=arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
    public static int lect3_12_optimal_using_prefix_suffix(int[]  arr){
        //Idea is if even -1 is there in a subarray its the max
        //if odd -1 is there thats the it will result in final negative number , So if we remove one negative number then overall its positive
        //we notice that each chosen negative number divides the array into two parts pre and suff
        int n = arr.length;
        int pre=1,suff=1;
        int result = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            //Ignore 0 as that causes 0 if multiuplied 
            if(pre == 0)
                pre =1;
            if(suff ==0)
                suff =1;
            pre *= arr[i];
            suff *=arr[n-i-1];
            result = Math.max(result, Math.max(pre, suff));
        }
        return result;
    }

}
