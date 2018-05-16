package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2018.5.17 Question 345. Reverse Vowels of a String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 *
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 *
 * Note:
 * The vowels does not include the letter "y".
 */
public class Q345ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        Set<String> vowelSet = new HashSet<>(Arrays.asList(vowels));

        boolean[] isVowels = new boolean[s.length()];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (vowelSet.contains(Character.toString(s.charAt(i)))) {
                isVowels[i] = true;
                stringBuilder.append(s.charAt(i));
            }
        }

        String reverseVowel = stringBuilder.reverse().toString();

        StringBuilder result = new StringBuilder();
        for (int i = 0, vowelIndex = 0; i < s.length(); i++) {
            if (isVowels[i]) {
                result.append(reverseVowel.charAt(vowelIndex));
                vowelIndex++;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
