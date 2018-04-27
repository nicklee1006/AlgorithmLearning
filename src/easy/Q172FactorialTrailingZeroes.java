package easy;

/**
 * 2018.4.27 Question 172. Factorial Trailing Zeroes
 * https://leetcode.com/problems/factorial-trailing-zeroes/description/
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 * Your solution should be in logarithmic time complexity.
 */
public class Q172FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int result = 0;

        int pow = 1;
        while (true) {
            int temp = (int) (n / Math.pow(5, pow));

            if (temp < 1) {
                break;
            } else {
                result += temp;
                pow++;
            }
        }

        return result;
    }
}
