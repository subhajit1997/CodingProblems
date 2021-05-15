package com.problems.GeeksForGeeks;

public class PeakElement2D {

	public static void main(String[] args) {
		int[][] arr = { { 10, 8, 10, 10 }, { 14, 13, 12, 11 }, { 15, 9, 11, 21 }, { 16, 17, 19, 20 } };
		int row = 4;
		int columns = 4;
		int max = findPeak(arr, row, columns);
		System.out.println("max: " + max);
	}

	private static int findPeak(int[][] arr, int row, int columns) {
		return findPeakRecur(arr, row, columns, columns / 2);

	}

	private static int findPeakRecur(int[][] arr, int row, int columns, int mid) {
		int max_value = 0;
		int max_index = findMaxIndexOfColumn(arr, row, mid, max_value);
		max_value = findMaxValueOfColumn(arr, row, mid, max_value);

		if (mid == 0 || mid == columns - 1)
			return max_value;
		if (max_value >= arr[max_index][mid - 1] && max_value >= arr[max_index][mid + 1])
			return max_value;

		if (max_value < arr[max_index][mid - 1])
			return findPeakRecur(arr, row, columns, (int) (mid - Math.ceil((double) mid / 2)));

		return findPeakRecur(arr, row, columns, (int) (mid + Math.ceil((double) mid / 2)));

	}

	private static int findMaxValueOfColumn(int[][] arr, int row, int mid, int max_value) {
		for (int i = 0; i < row; i++) {
			if (max_value < arr[i][mid]) {
				max_value = arr[i][mid];
			}
		}

		return max_value;
	}

	private static int findMaxIndexOfColumn(int[][] arr, int row, int mid, int max) {
		int max_index = 0;
		for (int i = 0; i < row; i++) {
			if (max < arr[i][mid]) {
				max = arr[i][mid];
				max_index = i;
			}
		}
		return max_index;
	}

}
