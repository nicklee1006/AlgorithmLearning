package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q151ReverseWordsInAString {
    public static String reverseWords(String s) {
        // remove heading and trailing spaces
        s = s.trim();

        String[] split = s.split("\\s+");

        // reverse the words
        List<String> words = Arrays.asList(split);
        Collections.reverse(words);

        // concat string
        return String.join(" ", words);
    }
}
