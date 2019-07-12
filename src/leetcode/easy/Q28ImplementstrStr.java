package leetcode.easy;

/**
 * 2018.3.24 Question 28: Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 *
 * Implement strStr()
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
 */
public class Q28ImplementstrStr {
    /**
     * One loop, moving window in haystack
     */
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        if (haystack.length() == 0 || needle.length() == 0) {
            return 0;
        }

        if (haystack.equals(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Solution:
     *  1. check length of haystack and needle
     *  2. use two loop
     */
//    public static int strStr(String haystack, String needle) {
//        if (needle.length() > haystack.length()) {
//            return -1;
//        }
//
//        if (haystack.length() == 0 || needle.length() == 0) {
//            return 0;
//        }
//
//        for (int i = 0; i < haystack.length(); i++) {
//            for (int j = 0; j < needle.length(); j++) {
//                if (i + j + 1 > haystack.length()) {
//                    return -1;
//                }
//
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    break;
//                }
//
//                if (j == needle.length() - 1) {
//                    return i;
//                }
//            }
//        }
//
//        return -1;
//    }
}
