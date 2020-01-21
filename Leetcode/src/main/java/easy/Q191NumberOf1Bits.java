package easy;

/**
 * 2018.4.29 Question 191: Number of 1 Bits
 * https://leetcode.com/problems/number-of-1-bits/description/
 *
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has
 * (also known as the Hamming weight).
 *
 * Solution
 * 1. & last digit with 1
 * 2. Right shift
 *
 */
public class Q191NumberOf1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result = 0;

        while (n != 0) {
            if ((n & 1) == 1) {
                result++;
            }

            n = n >>> 1;
        }

        return result;
    }
}
