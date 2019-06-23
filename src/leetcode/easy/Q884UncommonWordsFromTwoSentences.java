package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Question 884. Uncommon Words from Two Sentences
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
 *
 * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 * Return a list of all uncommon words.
 *
 * You may return the list in any order.
 */
public class Q884UncommonWordsFromTwoSentences {
    public static String[] uncommonFromSentences(String A, String B) {
        String total = A + " " + B;

        String[] words = total.split("\\s+");

        HashMap<String, Integer> count = new HashMap<>();

        for (String temp : words) {
            count.put(temp, count.getOrDefault(temp, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();

        for (String temp : count.keySet()) {
            if (count.get(temp) == 1) {
                result.add(temp);
            }
        }

        return result.toArray(new String[0]);
    }
}
