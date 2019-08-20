package easy;

/**
 * 2018.5.27 Question 441. Arranging Coins
 * https://leetcode.com/problems/arranging-coins/description/
 * <p>
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row
 * must have exactly k coins.
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 *
 * Solution
 * 1. 1+2+3+4+...x < n
 * 2. (x*(x+1))/2 < x
 * 3. solve the equation
 */
public class Q441ArrangingCoins {
    public static int arrangeCoins(int n) {
        double result = (Math.sqrt(8.0 * n + 1) - 1) / 2;

        return (int) Math.floor(result);
    }
}
