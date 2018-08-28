package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.7.10 Question 804. Unique Morse Code Words
 * https://leetcode.com/problems/unique-morse-code-words/description/
 * <p>
 * International Morse Code defines a standard encoding where each letter is mapped to a series
 * of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and
 * so on.
 *
 * Solution
 * 1. predefine codes
 */
public class Q804UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> count = new HashSet<>();

        for (String temp : words) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < temp.length(); i++) {
                int pos = temp.charAt(i) - 'a';

                stringBuilder.append(codes[pos]);
            }

            count.add(stringBuilder.toString());
        }

        return count.size();
    }
}
