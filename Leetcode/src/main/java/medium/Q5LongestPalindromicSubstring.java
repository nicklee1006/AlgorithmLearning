package medium;

public class Q5LongestPalindromicSubstring {
    /**
     * Palindromic are expaned from center.
     * Center could be 1 chars
     * or 2 chars like 'aa'
     */
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        String result = "";

        for (int i = 0; i < s.length() - 1; i++) {
            // center is 1 char
            int length = expand(s, i, i);
            // center is 2 chars
            int length2 = expand(s, i, i + 1);

            int longer = Math.max(length, length2);

            if (longer > result.length()) {
                result = s.substring(i - (longer - 1) / 2, i + longer / 2 + 1);
            }
        }

        return result;
    }

    private static int expand(String s, int start, int end) {
        int left = start;
        int right = end;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    /**
     * brute force method, get all possible substring and check if it's palindromic
     */
//    public static String longestPalindrome(String s) {
//        if (s.length() == 1) {
//            return s;
//        }
//
//        String result = "";
//        // brute force
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                if (isPalindrome(s.substring(i, j + 1))) {
//                    if (j - i + 1 > result.length()) {
//                        result = s.substring(i, j + 1);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    private static boolean isPalindrome(String s) {
//        int front = 0;
//        int end = s.length() - 1;
//
//        while (front < end) {
//            if (s.charAt(front) != s.charAt(end)) {
//                return false;
//            }
//
//            front++;
//            end--;
//        }
//
//        return true;
//    }
}
