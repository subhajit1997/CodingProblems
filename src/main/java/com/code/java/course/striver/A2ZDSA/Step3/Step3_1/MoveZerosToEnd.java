package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

import java.util.Arrays;

/**
 *  <IMPORTANT>
 * learn : https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
 * practice: https://leetcode.com/problems/move-zeroes/
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    //{1, 0, 2, 3, 2, 0, 0, 4, 5, 1} j=1 i=2
    //1 , 2,0,3,2,0,0,4,5,1    j=2 ,i=3
    //1 , 2,3,0,2,0,0,4,5,1    j=3,i=4
    //1 , 2,3,2,0,0,0,4,5,1     j=4,i=5
    //1 , 2,3,2,0,0,0,4,5,1     j=4,i=6
    //1 , 2,3,2,0,0,0,4,5,1     j=4,i=7
    //1 , 2,3,2,4,0,0,0,5,1     j=4,i=8

    //time- O(N) , space- O(1)
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }

}
