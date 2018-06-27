package easy;

/**
 * 2018.6.27 Question 686. Repeated String Match
 * https://leetcode.com/problems/repeated-string-match/description/
 *
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a
 * substring of it. If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 *
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not
 * a substring of A repeated two times ("abcdabcd").
 *
 * Note:
 * The length of A and B will be between 1 and 10000.
 */
public class Q686RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(A);

        while (stringBuilder.indexOf(B) == -1) {
            if (stringBuilder.length() > A.length() + B.length()) {
                return -1;
            }

            stringBuilder.append(A);
            count++;
        }

        return count;
    }
}
