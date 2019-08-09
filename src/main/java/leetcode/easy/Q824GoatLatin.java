package leetcode.easy;

/**
 * 2018.7.15 Question 824. Goat Latin
 * https://leetcode.com/problems/goat-latin/description/
 *
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase
 * letters only.
 *
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 *
 * The rules of Goat Latin are as follows:
 *
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 *
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end,
 * then add "ma".
 * For example, the word "goat" becomes "oatgma".
 *
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 *
 * Solution
 * 1. follow instruction
 */
public class Q824GoatLatin {
    public static String toGoatLatin(String S) {
        StringBuilder result = new StringBuilder();

        String[] split = S.split("\\s+");

        for (int i = 0; i < split.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            if (split[i].startsWith("a") || split[i].startsWith("e") || split[i].startsWith("i") || split[i].startsWith("o") || split[i].startsWith("u")
                    || split[i].startsWith("A") || split[i].startsWith("E") || split[i].startsWith("I") || split[i].startsWith("O") || split[i].startsWith("U")) {
                stringBuilder.append(split[i]);
            } else {
                stringBuilder.append(split[i].substring(1)).append(split[i].substring(0 ,1));
            }

            stringBuilder.append("ma");

            for (int j = 0; j < (i + 1); j++) {
                stringBuilder.append("a");
            }

            result.append(stringBuilder.toString()).append(" ");
        }

        return result.toString().trim();
    }
}
