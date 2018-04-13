package easy;

/**
 * 2018.3.24
 * Question 28: Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */
public class Q28ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        if (haystack.length() == 0 || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (i + j + 1 > haystack.length()) {
                    return -1;
                }

                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
