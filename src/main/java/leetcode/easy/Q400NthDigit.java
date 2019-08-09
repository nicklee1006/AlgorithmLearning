package leetcode.easy;

/**
 * 2018.5.21 Question 400. Nth Digit
 * https://leetcode.com/problems/nth-digit/description/
 * <p>
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 * <p>
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 *
 * Solution***
 * 1. Find the length of the number which n-th digit lies in
 *  1.1 10, 100, 1000...
 * 2. Get the actual number
 *  2.1 get 21,333 etc
 * 3. get the digit of actual number
 */
public class Q400NthDigit {
    public static int findNthDigit(int n) {
        int lengthOfNumber = 1;
        long numberOfCount = 9;
        int startNumber = 1;

        // find the length of actual number
        while (n > lengthOfNumber * numberOfCount) {
            n -= lengthOfNumber * numberOfCount;
            lengthOfNumber++;
            numberOfCount *= 10;
            startNumber *= 10;
        }

        // get the actual number
        int actual = startNumber + (n-1) / lengthOfNumber;
        String number = String.valueOf(actual);
        return Character.getNumericValue(number.charAt((n-1) % lengthOfNumber));
    }
}
