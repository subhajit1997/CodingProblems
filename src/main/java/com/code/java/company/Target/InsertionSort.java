package com.code.java.company.Target;

/*
Insertion Sort
----------------------------
Best case - 	O(n)
Average case- 	O(n^2)
Worst case- 	O(n^2)

https://www.geeksforgeeks.org/insertion-sort/

https://www.youtube.com/watch?v=TzeBrDU-JaY&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=5
*/
public class InsertionSort {

	public static void main(String[] args) {
		int[] input = { 9, 4, 8, 2, 6, 4, 1 };
		insertionSort(input);
		for (int i : input) {
			System.out.println(i + " ");
		}
	}

	private static void insertionSort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int val = input[i];
			int hole = i;
			while (hole > 0 && input[hole - 1] > val) {
				input[hole] = input[hole - 1];
				hole--;
			}
			input[hole] = val;
		}
	}

}
