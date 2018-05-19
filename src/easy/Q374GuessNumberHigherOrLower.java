package easy;

/**
 * 2018.5.19 Question 374. Guess Number Higher or Lower
 * https://leetcode.com/problems/guess-number-higher-or-lower/description/
 *
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 */
public class Q374GuessNumberHigherOrLower {
    public static int guessNumber(int n) {
        int i = 1, j = n;

        while (i < j) {
            int mid = (i + j) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return i;
    }

    private static int guess(int num) {
        return 0;
    }
}
