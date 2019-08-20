package easy;

import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * Question 888. Fair Candy Swap
 * https://leetcode.com/problems/fair-candy-swap/description/
 *
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
 *
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.
 *
 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 */
public class Q888FairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int diff = (IntStream.of(A).sum() - IntStream.of(B).sum())/2;

        HashSet<Integer> number = new HashSet<>();

        for (int i : A) {
            number.add(i);
        }

        for (int i : B) {
            if (number.contains(i + diff)) {
                return new int[]{i + diff, i};
            }
        }

        return new int[0];
    }
}
