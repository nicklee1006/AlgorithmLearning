package easy;

/**
 * 2018.5.11 Question 258: Add Digits
 * https://leetcode.com/problems/add-digits/description/
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * hint
 * https://en.wikipedia.org/wiki/Digital_root#Congruence_formula
 * return 1 + (num - 1) % 9;
 */
public class Q258AddDigits {
    public static int addDigits(int num) {
        int result = num;

        while (result >= 10) {
            result = 0;

            while (num > 0) {
                result += num % 10;

                num /= 10;
            }

            num = result;
        }

        return result;
    }
}
