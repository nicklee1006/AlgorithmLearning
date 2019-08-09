package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2018.7.13 Question 819. Most Common Word
 * https://leetcode.com/problems/most-common-word/description/
 *
 * Given a paragraph and a list of banned words, return the most frequent word that is not in
 * the list of banned words.  It is guaranteed there is at least one word that isn't banned,
 * and that the answer is unique.
 *
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words
 * in the paragraph are not case sensitive.  The answer is in lowercase.
 *
 * Solution
 * 1. convert paragraph
 * 2. use hashmap to count
 * 3. get the largest count
 */
public class Q819MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace(',', ' ').replace('!', ' ').replace('?', ' ').replace('\'', ' ').replace(';', ' ').replace('.', ' ');
        String[] spilt = paragraph.split("\\s+");

        ArrayList<String> ban = new ArrayList<>(Arrays.asList(banned));

        Map<String, Integer> count = new HashMap<>();

        for (String temp : spilt) {
            if (ban.contains(temp)) {
                continue;
            }

            count.put(temp, count.getOrDefault(temp, 0) + 1);
        }

        int largest = 0;
        String result = "";
        for (String temp : count.keySet()) {
            if (count.get(temp) > largest) {
                largest = count.get(temp);
                result = temp;
            }
        }

        return result;
    }
}
