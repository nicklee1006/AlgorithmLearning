package easy;

/**
 * 2018.7.15 Question 821. Shortest Distance to a Character
 * https://leetcode.com/problems/shortest-distance-to-a-character/description/
 * <p>
 * Given a string S and a character C, return an array of integers representing the shortest distance from the
 * character C in the string.
 */
public class Q821ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        int[] results = new int[S.length()];

        int posC = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                posC = i;
            }

            if (posC == -1) {
                results[i] = -1;
            } else {
                results[i] = i - posC;
            }
        }

        posC = -1;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                posC = i;
            }

            if (posC != -1) {
                if (results[i] == -1) {
                    results[i] = Math.abs(i - posC);
                } else {
                    results[i] = Math.min(results[i], Math.abs(i - posC));
                }
            }
        }

        return results;
    }
}
