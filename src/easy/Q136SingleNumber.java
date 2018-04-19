package easy;

/**
 * 2018.4.19: Question 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Use XOR(commutative), N1^N1^N2^N2^N3 = N3
 */
public class Q136SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int temp : nums) {
            result = result ^ temp;
        }

        return result;
    }
}
