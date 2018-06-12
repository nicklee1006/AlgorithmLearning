package easy;

/**
 * 2018.6.12 Question 557. Reverse Words in a String III
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence while
 * still preserving whitespace and initial word order.
 */
public class Q557ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        String[] split = s.split("\\s+");

        for (String temp : split) {
            StringBuilder tempBuilder = new StringBuilder(temp);

            result.append(tempBuilder.reverse().toString());
            result.append(" ");
        }

        return result.toString().trim();
    }
}
