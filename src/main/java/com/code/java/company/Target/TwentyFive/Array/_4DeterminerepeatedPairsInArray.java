package com.code.java.company.Target.TwentyFive.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/count-all-distinct-pairs-of-repeating-elements-from-the-array-for-every-array-element/
 */
public class _4DeterminerepeatedPairsInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countDistinctRepeatedpairs(new int[] { 1, 1, 2, 1, 2 })));
    }

    // naive ti,me complexity O(n^2)
    static int[] countDistinctRepeatedpairs(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            res[i] = (count * (count - 1)) / 2;
        }
        return res;
    }

    static void countDistinctRepeatedpairsOptimised(int arr[],
            int n) {
        // Store the frequency
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        // Find all the count
        int cnt = 0;
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            cnt += ((x.getValue()) *
                    (x.getValue() - 1) / 2);
        }

        int[] ans = new int[n];

        // Delete the contribution of
        // each element for equal pairs
        for (int i = 0; i < n; i++) {
            ans[i] = cnt - (mp.get(arr[i]) - 1);
        }

        // Print the answer
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
