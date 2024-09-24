package com.code.java.course.striver.A2ZDSA.Step12_GreedyAlgo.Step12_1;
/**
 * learn:https://takeuforward.org/data-structure/fractional-knapsack-problem-greedy-approach/
 * practice: https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
 */

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class itemCompare implements Comparator<Item> {

    @Override
    public int compare(Item a,Item b){
        double r1= (double)(a.value) /(double)(a.weight);
        double r2 = (double)(b.value)/(double)(b.weight);
//        if(r1<r2)
//            return 1;
//        else if(r1>r2)
//            return -1;
//        else
//            return 0;
        return Double.compare(r2, r1);
    }
}

/**
 * Approach:
 * The key observation here is that we need to pick items which have higher value/weight ratio.
 *
 *
 *
 * Here is the algorithm:
 *
 * We will calculate the ratio of value/weight for each item.
 * Sort the items in decreasing order based on this ratio.
 * We take the item with the highest ratio first and add them until we can’t add a whole item.
 * Add the next item as much as we can.
 *
 *
 * Time Complexity
 * O(N * log(N)), where ‘N’ is the number of items.
 * Since we are sorting the array, the time complexity is O(NlogN).
 *
 * Space Complexity
 * O(1), i.e. constant space complexity.
 */
public class _2FractionalKnapsackProblem {
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        Arrays.sort(arr,new itemCompare());
        //Arrays.sort(items, Comparator.comparingDouble(item -> item.ratio).reversed()); need to modify Item and pass ratio
        int curWeight = 0;
        double finalVal =0.0;
        for(int i=0;i<n;i++){
            if(curWeight + arr[i].weight <=W){
                curWeight += arr[i].weight;
                finalVal += arr[i].value;
            }
            else{
                int remain = W- curWeight;
                finalVal += ((double)arr[i].value/(double)arr[i].weight)*(double) remain;
                break;
            }
        }
        return finalVal;
    }
}
