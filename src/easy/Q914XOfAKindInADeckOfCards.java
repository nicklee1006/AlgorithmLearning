package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.10.26 Question 914. X of a Kind in a Deck of Cards
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/
 * <p>
 * In a deck of cards, each card has an integer written on it.
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1
 * or more groups of cards, where:
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 */
public class Q914XOfAKindInADeckOfCards {
    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i : deck) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        int X = getDivisorArray(count.values().stream().mapToInt(i->i).toArray(), count.values().size());

        return X >= 2;
    }

    private static int getDivisor(int A, int B) {
        if (B == 0) {
            return A;
        }

        return getDivisor(B, A % B);
    }

    private static int getDivisorArray(int num[], int n) {
        if (n == 1) {
            return num[n - 1];
        }

        return getDivisor(num[n - 1], getDivisorArray(num, n - 1));
    }
}
