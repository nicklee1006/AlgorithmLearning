package easy;

/**
 * 2018.6.6 Question 504. Base 7
 * https://leetcode.com/problems/base-7/description/
 *
 * Given an integer, return its base 7 string representation.
 *
 * Solution
 * 1. recursive
 */
public class Q504Base7 {
    public static String convertToBase7(int num) {
        if (num < 0) {
            return "-" + convertToBase7(-num);
        }

        if (num < 7) {
            return num + "";
        }

        return convertToBase7(num / 7) + num % 7;
    }
}
