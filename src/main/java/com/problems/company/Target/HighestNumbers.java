package com.problems.company.Target;

/**
 * Given an array and number ‘n’, return the first n highest numbers without sorting it
 */
public class HighestNumbers {
    public static void main(String[] args) {
        int[] array = {12, 45, 6, 78, 23, 56, 89, 9};
        int n = 4;

        int[] result = findHighestNumbers(array, n);

        System.out.println("First " + n + " highest numbers:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findHighestNumbers(int[] array, int n) {
        int[] result = new int[n];
        int smallestIndex = 0;

        // Initialize the result array with the first n elements
        for (int i = 0; i < n; i++) {
            result[i] = array[i];
            if (result[i] < result[smallestIndex]) {
                smallestIndex = i;
            }
        }

        // Find the first n highest numbers
        for (int i = n; i < array.length; i++) {
            if (array[i] > result[smallestIndex]) {
                result[smallestIndex] = array[i];
                // Update the index of the smallest element in the result array
                for (int j = 0; j < n; j++) {
                    if (result[j] < result[smallestIndex]) {
                        smallestIndex = j;
                    }
                }
            }
        }

        return result;
    }
}
