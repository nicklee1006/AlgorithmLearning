package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.7.4 Question 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/description/
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number,
 * including the bounds if possible.
 *
 * Solution
 * 1. follow definition
 */
public class Q728SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int temp = i;

            while (temp != 0) {
                int number = temp % 10;

                if (number == 0 || i % number != 0) {
                    break;
                }

                temp /= 10;
            }

            if (temp == 0) {
                results.add(i);
            }
        }

        return results;
    }
}
