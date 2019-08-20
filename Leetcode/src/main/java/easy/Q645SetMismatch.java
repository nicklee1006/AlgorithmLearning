package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.6.21 Question 645. Set Mismatch
 * https://leetcode.com/problems/set-mismatch/description/
 *
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the
 * numbers in the set got duplicated to another number in the set, which results in repetition of one number
 * and loss of another number.
 *
 * Given an array nums representing the data status of this set after the error. Your task is to firstly
 * find the number occurs twice and then find the number that is missing. Return them in the form of an
 * array.
 *
 * Solution
 * 1. get the sum of 1-n
 * 2. use a set, if some number can't be added, it is the duplicated
 * 3. substract each number from sum
 * 4. missing number is sum + duplicated number
 */
public class Q645SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        int[] result = new int[2];

        int sum = (1 + nums.length) * nums.length / 2;

        for (int i : nums) {
            if (!numbers.add(i)) {
                result[0] = i;
            }

            sum -= i;
        }

        result[1] = sum + result[0];

        return result;
    }
}
