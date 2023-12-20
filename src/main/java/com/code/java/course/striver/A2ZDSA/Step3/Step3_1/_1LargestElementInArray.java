package com.code.java.course.striver.A2ZDSA.Step3.Step3_1;

/**learn: https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
 * practice: https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 *
 */
public class _1LargestElementInArray {
    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{1,2,4,8,34,4},6));
    }

    static int largestElement(int[] arr, int n) {
        int max =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
