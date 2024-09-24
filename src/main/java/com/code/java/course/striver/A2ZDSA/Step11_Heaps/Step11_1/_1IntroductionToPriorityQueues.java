package com.code.java.course.striver.A2ZDSA.Step11_Heaps.Step11_1;

import java.util.List;

/**
 * practice: https://www.codingninjas.com/studio/problems/implement-a-priority-queue-_1743878?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 *
 */
public class _1IntroductionToPriorityQueues {
    public static void main(String[] args) {

    }

    //O(log(n)) - Time
    // O(1) - space
    public static int pop(List<Integer> heap) {
        if (heap.size() == 0) return -1;

        // The top-most element of the heap is the largest.
        int ans = heap.get(0);

        // Removing the last element in the heap and inserting it at the top.
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        // Edge case.
        if (heap.size() == 0) return ans;

        // Shifting the current element down till its correct position.
        int pos = 0;
        while (true) {
            int left = pos * 2 + 1;
            int right = pos * 2 + 2;
            int leftValue = 0, rightValue = 0;

            // To avoid an IndexOutOfBoundsException.
            if (left < heap.size()) leftValue = heap.get(left);
            if (right < heap.size()) rightValue = heap.get(right);

            // Swapping it by the larger value.
            if (leftValue <= heap.get(pos) && rightValue <= heap.get(pos)) {
                // As it is larger than both its children, it is at its correct position.
                break;
            } else if (leftValue >= rightValue) {
                swap(heap, pos, left);
                pos = left;
            } else {
                swap(heap, pos, right);
                pos = right;
            }
        }
        return ans;
    }

    public static void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Code Snippet of the push function:
    // public static void push(List<Integer> heap, int x) {
    //         heap.add(x);
    //
    //         // Position of the current inserted element.
    //         int pos = heap.size() - 1;
    //
    //         // Shifting the element up until it reaches the topmost node if it is larger than its parent.
    //         while (pos > 0) {
    //             int parent = (pos - 1) / 2;
    //             if (heap.get(pos) > heap.get(parent)) {
    //                 // Swapping the elements.
    //                 int temp = heap.get(parent);
    //                 heap.set(parent, heap.get(pos));
    //                 heap.set(pos, temp);
    //                 pos = parent;
    //             } else {
    //                 // As parent is larger, the element is now in its correct position.
    //                 break;
    //             }
    //         }
    //     }
}
