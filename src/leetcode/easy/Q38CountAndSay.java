package leetcode.easy;

/**
 * 2018.3.28 Count and say
 * https://leetcode.com/problems/count-and-say/description/
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class Q38CountAndSay {
    public static String countAndSay(int n) {
        String previous = "1";
        String current = "1";

        for (int i = 1; i < n; i++) {
            int count;
            char character;
            current = "";

            int length = previous.length();
            for (int j = 0; j < previous.length(); j++) {
                character = previous.charAt(j);
                count = 1;

                while (j + 1 < length && character == previous.charAt(j + 1)) {
                    count++;
                    j++;
                }

                current = current + count + character;
            }

            previous = current;
        }

        return current;
    }
}
