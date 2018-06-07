package easy;

/**
 * 2018.6.7 Question 507. Perfect Number
 * https://leetcode.com/problems/perfect-number/description/
 *
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors
 * except itself.
 *
 * Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
 */
public class Q507PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int result = 0;

        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                result += i + num / i;
            }
        }

        result++;

        return num == result;
    }
}
