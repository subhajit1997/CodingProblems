package com.code.java.company.WissenTech;

/**
 * https://takeuforward.org/data-structure/stock-buy-and-sell-dp-35/
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class _2BestTimetoBuyandSellStock {
    public static void main(String[] args) {

    }
    //Time -: O(N)
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            int currentProfit = prices[i]- mini;
            maxProfit = Math.max(maxProfit,currentProfit);
            mini = Math.min(mini,prices[i]);
        }
        return maxProfit;
    }
}
