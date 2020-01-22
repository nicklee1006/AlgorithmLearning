package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.5.1: Question 202. Happy Number
 * https://leetcode.com/problems/happy-number/discuss/56913/Beat-90-Fast-Easy-Understand-Java-Solution-with-Brief-Explanation
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 *
 * Solution
 * 1. Use set to record number meet, if a number has meet before, then it's a loop, return false
 * 2. Get every digit of a number
 *      while (n > 0)
 *          digit = n % 10
 *          n = n / 10
 */
public class Q202HappyNumber {
    public static boolean isHappy(int n) {
        // use set to record previous met numbers
        Set<Integer> previousSums = new HashSet<>();

        int sum;
        int remain;

        // if Set.add returns false, means we have met 'n' before
        while (previousSums.add(n)) {
            sum = 0;

            while (n > 0) {
                remain = n % 10;
                sum += remain * remain;

                n = n / 10;
            }

            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }

        }

        return false;
    }
}
