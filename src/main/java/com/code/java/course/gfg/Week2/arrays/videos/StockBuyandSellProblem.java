package com.code.java.course.gfg.Week2.arrays.videos;

public class StockBuyandSellProblem {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,5,3,8,12},0,4));
        System.out.println(maxProfitEfficient(new int[]{1,5,3,8,12},0,4));
    }
    static int maxProfit(int[] price,int start,int end){
        if(end<=start){
            return 0;
        }
        int profit=0;
        for(int i=start;i<end;i++){
            for(int j =i+1;j<=end;j++){
                if(price[j]>price[i]){
                    int currentProfit = price[j]-price[i]+
                    maxProfit(price,start,i-1)+maxProfit(price, j+1, end);
                    profit = Math.max(profit,currentProfit);
                }
            }
        }
        return profit;
    }
    static int maxProfitEfficient(int[] price,int start,int end){
        int profit=0;
        int n = price.length;
        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit+=price[i]-price[i-1];
            }
        }
        return profit;
    }
}