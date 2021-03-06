package easy;

/**
 * 2018.4.17: 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple
 * transactions at the same time (ie, you must sell the stock before you buy again).
 *
 * Solution
 * 1. As long as later price is higher than previous one, do a transaction
 * 2. Do as many transactions as possible
 */
public class Q122BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        // do as many transaction as possible
        // as long as there is profit
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                result += prices[i + 1] - prices[i];
            }
        }

        return result;
    }
}
