package com.code.java.course.udmey.dsa_masterclass.section5;

/**
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/quiz/5867000#overview
 *
 * Best Time to Buy and Sell Stock - LeetCode 121
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example:
 *
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
//    public static int maxProfit(int[] prices) {
//        int maxdiff=0;
//        for(int i=0;i<prices.length;i++){
//            int diff=0;
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[j]>prices[i]){
//                    if((prices[j]-prices[i])>diff)
//                        diff = prices[j]-prices[i];
//                }
//            }
//            if(diff>=maxdiff)
//                maxdiff=diff;
//        }
//        return maxdiff;
//    }
    public static int maxProfit(int[] prices) {
        int maxdiff= Integer.MIN_VALUE;
        int mindiff = Integer.MAX_VALUE;
        for(int price:prices){
            if(price<mindiff){
                mindiff = price;
            }else if((price-mindiff)>maxdiff){
                maxdiff=price-mindiff;
            }
        }
        return maxdiff;
    }
}
