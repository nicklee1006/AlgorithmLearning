package medium;

import java.util.ArrayList;
import java.util.List;

public class Q131PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        return helper(s, 0);
    }

    private static List<List<String>> helper(String s, int start) {
        // exit recursive
        if (start == s.length()) {
            List<List<String>> temp = new ArrayList<>();
            temp.add(new ArrayList<>());

            return temp;
        }

        List<List<String>> result = new ArrayList<>();
        for (int i = start; i < s.length(); i++) {
            // only continue if left part is palindrome
            if (isPalindrome(s.substring(start, i + 1))) {
                String left = s.substring(start, i + 1);

                for (List<String> temp : helper(s, i + 1)) {
                    // append left part in beginning
                    temp.add(0, left);
                    result.add(temp);
                }
            }
        }

        return result;
    }

    // helper method to check whether a string is palindrome
    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
