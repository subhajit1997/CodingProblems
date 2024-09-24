package com.code.java.course.striver.A2ZDSA.Step12_GreedyAlgo.Step12_1;

import java.util.ArrayList;
import java.util.List;

/**practice:https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_975277?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *learn:https://takeuforward.org/data-structure/find-minimum-number-of-coins/
 *
 * Problem statement
 * Given an infinite supply of Indian currency i.e. [1, 2, 5, 10, 20, 50, 100, 500, 1000] valued coins and an amount 'N'.
 *
 * Find the minimum coins needed to make the sum equal to 'N'. You have to return the list containing the value of coins required in decreasing order.
 * For Example
 * For Amount = 70, the minimum number of coins required is 2 i.e an Rs. 50 coin and a Rs. 20 coin.
 * Note
 * It is always possible to find the minimum number of coins for the given amount. So, the answer will always exist.
 */
public class _3MinimumNumberOfCoins {
    public static void main(String[] args) {
        System.out.println(MinimumCoins(13));
    }
    public static List<Integer> MinimumCoins(int n) {
        int[] deno = {1,2,5,10,20,50,100,500,1000};
        List<Integer> ans = new ArrayList<>();
        int dLen = deno.length;

        for(int i=dLen-1;i>=0;i--){
            while(n >=deno[i]){
                n-=deno[i];
                ans.add(deno[i]);
            }
        }
        return ans;
    }
}
