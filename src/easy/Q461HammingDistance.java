package easy;

/**
 * 2018.5.31: Question 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/description/
 *
 * The Hamming distance between two integers is the number of positions at which the
 * corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Solution
 * 1. ^ XOR
 */
public class Q461HammingDistance {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
