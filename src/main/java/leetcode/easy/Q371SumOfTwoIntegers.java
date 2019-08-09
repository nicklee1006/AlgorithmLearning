package leetcode.easy;

/**
 * 2018.5.19 Question 371. Sum of Two Integers
 * https://leetcode.com/problems/sum-of-two-integers/description/
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * hint: https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary:-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
 *
 * Solution
 * 1. Math.addExact
 */
public class Q371SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        return Math.addExact(a, b);
    }
}
