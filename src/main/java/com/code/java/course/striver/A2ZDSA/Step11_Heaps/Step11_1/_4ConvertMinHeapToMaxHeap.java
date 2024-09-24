package com.code.java.course.striver.A2ZDSA.Step11_Heaps.Step11_1;

import java.util.Arrays;

/**
 * practice: https://www.codingninjas.com/studio/problems/convert-min-heap-to-max-heap_1381084?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class _4ConvertMinHeapToMaxHeap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MinToMaxHeapBruteForce(6, new int[]{5, 10, 7, 21, 21, 10})));
        System.out.println(Arrays.toString(MinToMaxHeapOptimised(6, new int[]{5, 10, 7, 21, 21, 10})));
    }

    /**
     * The main idea is that when an array is sorted in descending order it becomes max heap as for every ‘i’ from i=0 to n/2 it is greater than equal to arr[2*i+1] and arr[2*i+2].
     * Time Complexity
     * O(n*log(n)), where n is the size of the array.
     *
     * Sorting an array takes O(n*log(n)) time complexity.
     */
    public static int[] MinToMaxHeapBruteForce(int n, int[] arr)
    {
        // Sorting in descending order.
        Arrays.sort(arr);
        reverse(arr);
        return arr;
    }

    public static void reverse(int[] array)
    {

        // Length of the array
        int n = array.length;

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }

    /**
     * The main idea is to build max-heap for the given input array just like in heapsort. It will convert the input array into a max heap. We will perform the heapify(Refer Heap Sort Algorithm) process to the given input array to build the heap. In a max heap, if arr[ i ] is less than it’s it children node arr[2*i+1] and arr[2*i+2] then replace it with children and call heapfiy on the corresponding child node.Heapify can only be applied to a node only when its children are heapified. Hence it must be performed in bottom-up order.
     * Time Complexity: O(n) where ‘n’ is the size of the array.
     * The time complexity due to the heapify process in the heap sort algorithm is of O(n) time complexity.
     */
    public static int[] MinToMaxHeapOptimised(int n, int[] arr) {
        // Calling heapify process in bottom-up manner.
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
        return arr;
    }
    public static void heapify(int[] arr, int n, int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // If left child is greater than replace it with node
        if (leftChild < n && arr[largest] < arr[leftChild]) {
            largest = leftChild;
        }

        // If right child is greater than replace it with node
        if (rightChild < n && arr[largest] < arr[rightChild]) {
            largest = rightChild;
        }

        // If any child has more value, call heapify on corresponding sub-tree.
        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            heapify(arr, n, largest);
        }
    }


}
