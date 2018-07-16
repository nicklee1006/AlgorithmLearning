package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.7.16 Question 830. Positions of Large Groups
 * https://leetcode.com/problems/positions-of-large-groups/description/
 *
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 *
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 *
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every
 * large group.
 *
 * The final answer should be in lexicographic order.
 */
public class Q830PositionsOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> results = new ArrayList<>();

        int length = 1;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                length++;

                if (length >= 3 && temp.size() != 1) {
                    temp.add(i - 1);
                }
            } else {
                if (temp.size() != 0) {
                    temp.add(i);

                    results.add(new ArrayList<>(temp));
                }

                length = 1;
                temp.clear();
            }
        }

        if (length >= 3) {
            temp.add(S.length()-1);

            results.add(new ArrayList<>(temp));
        }

        return results;
    }
}
