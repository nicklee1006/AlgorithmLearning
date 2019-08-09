package leetcode.easy;

/**
 * 2018.6.10 Question 541. Reverse String II
 * https://leetcode.com/problems/reverse-string-ii/description/
 * <p>
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters
 * counting from the start of the string. If there are less than k characters left, reverse all of them.
 * If there are less 'than 2k but greater than or equal to k characters, then reverse the first k
 * characters and left the other as original.
 *
 * Solution
 * 1. Divide the string to s.length/2k pairs (each length k)
 * 2. For each pair, divide into 2 k-length part
 * 3. Reverse first part
 * 4. Depending on how much left
 *  4.1 If less then K, reverse all
 *  4.2 If k < length < 2k, reverse first k
 */
public class Q541ReverseStringII {
    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();

        int pairs = s.length() / (2 * k);

        for (int i = 0; i < pairs; i++) {
            String partA = s.substring(i * 2 * k, i * 2 * k + k);
            String partB = s.substring(i * 2 * k + k, (i+1) * 2 * k );

            result.append(new StringBuffer(partA).reverse().toString());
            result.append(partB);
        }

        s = s.substring(pairs * 2 * k);

        if (s.length() < k) {
            result.append(new StringBuffer(s).reverse().toString());
        } else {
            String partA = s.substring(0, k);
            String partB = s.substring(k, s.length());

            result.append(new StringBuffer(partA).reverse().toString());
            result.append(partB);
        }

        return result.toString();
    }
}
