package com.code.java.course.gfg.Week2.arrays.problems;

import java.util.Arrays;

/**
nsertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at some index.

You are given an array arr(0-based index). The size of the array is given by sizeOfArray. You need to insert an element at given index.

Example 1:

Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 5, element = 90
Output: 1 2 3 4 5 90
Explanation: 90 is inserted at index
5(0-based indexing). After inserting,
array elements are like
1, 2, 3, 4, 5, 90.
Example 2:

Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 2, element = 90
Output: 1 2 90 3 4 5
Explanation: 90 is inserted at index 
2(0-based indexing). After inserting,
array elements are like 
1, 2, 90, 3, 4, 5.
Your Task:
You don't need to read input or print anything.. The input is already taken care of by the driver code. You only need to complete the function insertAtIndex() that takes arr, sizeOfArray, index, element as input and modifies the array arr as per requirements. The printing is done by driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= sizeOfArray <= 10000
0 <= element, arri <= 106
0 <= index <= sizeOfArray-1
 * 
 * 
 */
public class ArrayInsertAtIndex {
    public static void main(String[] args) {
 
        insertAtIndex(new int[]{1, 2, 3, 4, 5}, 6, 5, 90);
    }

    static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for(int i=sizeOfArray-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
    }
}
