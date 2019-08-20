package easy;

/**
 * 2018.3.19 Question 14: Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class Q14LongestCommonPrefix {
    /**
     * Binary search
     * Search the length**
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int shortest = Integer.MAX_VALUE;
        for (String temp : strs) {
            if (temp.length() < shortest) {
                shortest = temp.length();
            }
        }


        int low = 1;
        int high = shortest;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (hasCommonPref(strs, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean hasCommonPref(String[] strs, int length) {
        String common = strs[0].substring(0, length);

        for (String temp : strs) {
            if (!temp.startsWith(common)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Divide and conquer
     */
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        }
//
//        return longestCommonPrefix(strs, 0, strs.length - 1);
//    }
//
//    private static String longestCommonPrefix(String[] strs, int left, int right) {
//        if (left == right) {
//            return strs[left];
//        } else {
//            int mid = (left + right) / 2;
//            String leftStr = longestCommonPrefix(strs, left, mid);
//            String rightStr = longestCommonPrefix(strs, mid + 1, right);
//
//            return combineLeftAndRight(leftStr, rightStr);
//        }
//    }
//
//    private static String combineLeftAndRight(String leftStr, String rightStr) {
//        int shortLength = Math.min(leftStr.length(), rightStr.length());
//
//        for (int i = 0; i < shortLength; i++) {
//            if (leftStr.charAt(i) != rightStr.charAt(i)) {
//                return leftStr.substring(0, i);
//            }
//        }
//
//        return leftStr.substring(0, shortLength);
//    }

    /**
       *  1. Determine the shortest string
       *  2. Two loops
       *   2.1 First: loop all chars in the shortest string
       *   2.2 Second: loop all strs, see if the char at index i are equal
       *  3. return the prefix
       */
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        int shortest = Integer.MAX_VALUE;
//        // determine the shortest
//        for (String temp : strs) {
//            if (temp.length() < shortest) {
//                shortest = temp.length();
//            }
//        }
//
//        for (int i = 0; i < shortest; i++) {
//            char tempChar = strs[0].charAt(i);
//
//            for (String temp : strs) {
//                if (temp.charAt(i) != tempChar) {
//                    return result.toString();
//                }
//            }
//
//            result.append(tempChar);
//        }
//
//        return result.toString();
//    }
}
