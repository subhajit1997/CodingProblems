/**
 * 
 */
package com.problems.algorithm.sort;

/**
 * @author sbiswa0
 * Heap Sort
 * -----------------
 * In place algorithm
 * 
 * TimeComplexity:
 * Heapify: O(log(n))
 * Create and Build Heap O(n)
 * Total: O(nlogn)
 * 
 * Space Complexity: O(1)
 * 
 * https://www.geeksforgeeks.org/heap-sort/
 * https://www.youtube.com/watch?v=HqPJF2L5h9U
 *
 */
public class HeapSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = { 1, 5, 8, 3,2,7, 9, 4, 7 };
		HeapSort heapSort = new HeapSort();
		heapSort.sort(input);
		
		for(int i:input)
		{
			System.out.println(i+" ");
		}
	}

	private void sort(int[] input) {
		int length = input.length;
		for (int i = length / 2 - 1; i >= 0; i--) {
			heapify(input, length, i);
		}

		for (int i = length - 1; i > 0; i--) {
			int temp = input[0];
			input[0] = input[i];
			input[i] = temp;

			heapify(input, i, 0);
		}

	}

	private void heapify(int[] input, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n && input[left] > input[largest])
			largest = left;
		if (right < n && input[right] > input[largest])
			largest = right;
		if (largest != i) {
			int swap = input[i];
			input[i] = input[largest];
			input[largest] = swap;

			heapify(input, n, largest);
		}

	}

}
