package easy;

/**
 * 2018.5.16 Question 344. Reverse String
 * https://leetcode.com/problems/reverse-string/description/
 *
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example:
 * Given s = "hello", return "olleh".
 *
 * hint:
 * https://www.geeksforgeeks.org/reverse-a-string-in-java-5-different-ways/
 */
public class Q344ReverseString {
    public static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);

        return stringBuilder.reverse().toString();
    }
}
