package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.6.20 Question 633. Sum of Square Numbers
 * https://leetcode.com/problems/sum-of-square-numbers/description/
 *
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that
 * a2 + b2 = c.
 *
 * Solution
 * 1. for loop
 * 2. from 0 to sqrt(c)
 * 3. add i^2 to a set
 * 4. see if the set have c - i^2
 */
public class Q633SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i <= Math.sqrt(c); i++) {
            numbers.add(i*i);

            if (numbers.contains(c - i * i)) {
                return true;
            }
        }

        return false;
    }
}
