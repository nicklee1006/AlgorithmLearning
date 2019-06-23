package leetcode.easy;

/**
 * 2018.5.27 Question 443. String Compression
 * https://leetcode.com/problems/string-compression/description/
 *
 * Given an array of characters, compress it in-place.
 * The length after compression must always be smaller than or equal to the original array.
 * Every element of the array should be a character (not int) of length 1.
 * After you are done modifying the input array in-place, return the new length of the array.
 *
 * Follow up:
 * Could you solve it using only O(1) extra space?
 *
 * hint:
 * https://leetcode.com/problems/string-compression/discuss/92559/Simple-Easy-to-Understand-Java-solution
 *
 * Solution
 * 1. two index, one for result and one for current
 * 2. keep track of counting
 */
public class Q443StringCompression {
    public static int compress(char[] chars) {
        int currentIndex = 0, resultIndex = 0;

        while (currentIndex < chars.length) {
            int count = 0;
            char currentChar = chars[currentIndex];

            while (currentIndex < chars.length && chars[currentIndex] == currentChar) {
                currentIndex++;
                count++;
            }

            chars[resultIndex++] = currentChar;

            if (count != 1) {
                for (char temp : Integer.toString(count).toCharArray()) {
                    chars[resultIndex++] = temp;
                }
            }
        }

        return resultIndex;
    }
}
