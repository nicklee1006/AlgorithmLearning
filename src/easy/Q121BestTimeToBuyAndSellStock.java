package easy;

/**
 * 2018.4.16: 121 Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the
 * stock), design an algorithm to find the maximum profit.
 *
 * Solution
 * 1. Compare the (current - min)
 * 2. Keep the min price that have meet
 */
public class Q121BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int result = 0;
        int minBuyPrice = prices[0];

        for (int price : prices) {
            if (price > minBuyPrice) {
                result = Math.max(result, price - minBuyPrice);
            } else {
                minBuyPrice = price;
            }
        }

        return result;
    }
}
