package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2018.10.20 Question 893. Groups of Special-Equivalent Strings
 * https://leetcode.com/problems/groups-of-special-equivalent-strings/description/
 *
 * You are given an array A of strings.
 * Two strings S and T are special-equivalent if after any number of moves, S == T.
 * A move consists of choosing two indices i and j with i % 2 == j % 2, and swapping S[i] with S[j].
 * Now, a group of special-equivalent strings from A is a non-empty subset S of A such that any string not in S is not special-equivalent with any string in S.
 * Return the number of groups of special-equivalent strings from A.
 */
public class Q893GroupsOfSpecialEquivalentStrings {
    public static int numSpecialEquivGroups(String[] A) {
        Set<String> result = new HashSet<>();

        for (String temp : A) {
            int[] countOdd = new int[256];
            int[] countEven = new int[256];

            for (int i = 0; i < temp.length(); i++) {
                if (i % 2 == 0) {
                    countEven[temp.charAt(i)]++;
                } else {
                    countOdd[temp.charAt(i)]++;
                }
            }

            result.add(Arrays.toString(countOdd) + " " + Arrays.toString(countEven));
        }

        return result.size();
    }
}
