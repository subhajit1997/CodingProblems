package com.code.java.practice.algorithm.sort;

/*
Merge Sort
--------------
1)Divide and Conquer approach 
2)Recursive algorithm

Time Complexity:
Best Case: 		O(n*log(n))	
Average Case:	O(n*log(n))
Worst Case:		O(n*log(n))

Space Complexity: O(n)
https://www.youtube.com/watch?v=0nlPxaC2lTw&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=6  
 */

public class MergeSort {
	public static void main(String[] args) {
		int[] input = { 1, 8, 5,4,6,7,2,1,3,8, 2, 6, 9, 3 };
		mergeSort(input);
		for (int i : input)
			System.out.println(i + " ");
	}

	private static void mergeSort(int[] input) {
		int n = input.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			leftArray[i] = input[i];
		}
		for (int j = mid; j < n; j++) {
			rightArray[j - mid] = input[j];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		mergeTwoArray(leftArray, rightArray, input);

	}

	private static void mergeTwoArray(int[] leftArray, int[] rightArray, int[] input) {
		int nL = leftArray.length;
		int nR = rightArray.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (leftArray[i] < rightArray[j]) {
				input[k] = leftArray[i];
				i++;
			} else {
				input[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			input[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < nR) {
			input[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
