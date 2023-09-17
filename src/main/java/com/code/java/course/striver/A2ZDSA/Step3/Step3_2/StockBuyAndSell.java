package com.code.java.course.striver.A2ZDSA.Step3.Step3_2;

/**
 * learn:https://takeuforward.org/data-structure/stock-buy-and-sell/
 * practice:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 *
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class StockBuyAndSell {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfitOptimised(new int[]{7,1,5,3,6,4}));
    }

    //Brute Force - O(N^2)
    public static int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if((prices[j]>prices[i]))
                    profit = Math.max((prices[j]-prices[i]),profit);
            }
        }
        return profit;
    }

    //Optimised Best approach
    public static int maxProfitOptimised(int[] prices) {
        int min=Integer.MAX_VALUE ,max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            max = Math.max(prices[i]-min,max);
            System.out.println("max: "+max+"min: "+min);
        }
        return max;
    }

}
