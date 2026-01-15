package com.code.java.course.gfg.Week2.arrays.problems;

public class _14_StockBuyAndSell {
    /**
     * 
  Stock buy and sell
Difficulty: MediumAccuracy: 29.18%Submissions: 284K+Points: 4Average Time: 20m
Given an array arr[] denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.

Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

Examples:

Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865
     */
    public static void main(String[] args) {
        
    }
    int stockBuySell(int arr[]) {
        int n = arr.length;
        int maxSum = 0;
        for(int i=1;i<n;i++){
            int sum = arr[i]-arr[i-1];
            if(sum>0){
                maxSum +=sum;
            }
        }
        return maxSum;
    }
}
