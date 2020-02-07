package medium;

import java.util.ArrayList;
import java.util.List;

public class Q93RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();

        getResults(s, 0, new StringBuilder(), results, 0);

        return results;
    }

    /**
     * @param:  start start of string
     * @param:  temp already partitioned part
     * @param:  ans results
     * @param:  count how many parts
     */
    private static void getResults(String s, int start, StringBuilder temp, List<String> result, int count) {
        // If remaining length >= remaining part * 3
        // e.g. s = 121231312312, length = 12
        // current start = 1，count = 1
        // remaining length 11，remaining part 4 - count = 3，at most 3 * 3 = 9
        // so it's impossible
        if ((s.length() - start) > (3 * (4 - count))) {
            return;
        }

        // reaching the end
        if (start == s.length()) {
            // already formed 4 parts
            if (count == 4) {
                result.add(temp.substring(0, temp.length() - 1));
            }

            return;
        }

        if (start > s.length() || count == 4) {
            return;
        }

        // save current
        StringBuilder before = new StringBuilder(temp);

        // add 1 digit
        temp.append(s.charAt(start) + "" + '.');
        getResults(s, start + 1, temp, result, count + 1);

        // if start with 0
        if (s.charAt(start) == '0') {
            return;
        }

        // add 2 digit
        if (start + 1 < s.length()) {
            // restore to before
            temp = new StringBuilder(before);

            temp.append(s.substring(start, start + 2) + "" + '.');

            getResults(s, start + 2, temp, result, count + 1);
        }

        // add 3 digit
        if (start + 2 < s.length()) {
            // restore to before
            temp = new StringBuilder(before);

            int num = Integer.parseInt(s.substring(start, start + 3));

            if (num >= 0 && num <= 255) {
                temp.append(s.substring(start, start + 3) + "" + '.');
                getResults(s, start + 3, temp, result, count + 1);
            }
        }
    }

//    public static List<String> restoreIpAddresses(String s) {
//        List<String> results = new ArrayList<>();
//
//        if (s.length() > 12 || s.length() < 4) {
//            return results;
//        }
//
//        // first field 1,2,3 digit
//        for (int i = 0; i < 4 && i < s.length() - 2; i++) {
//            // second field 1,2,3 digit
//            for (int j = i + 1; j < i + 4 && j < s.length() - 1; j++) {
//                // third field 1,2,3 digit
//                for (int k = j + 1; k < j + 4 && k < s.length(); k++) {
//                    String s1 = s.substring(0, i);
//                    String s2 = s.substring(i, j);
//                    String s3 = s.substring(j, k);
//                    String s4 = s.substring(k);
//
//                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
//                        results.add(s1 + "." + s2 + "." + s3 + "." + s4);
//                    }
//                }
//            }
//        }
//
//        return results;
//    }
//
//    // 1 <= length <= 3
//    // between 0 - 255
//    // or 0
//    private static boolean isValid(String subString) {
//        return subString.length() != 0 && subString.length() <= 3 && Integer.parseInt(subString) <= 255 && (subString.charAt(0) != '0' || subString.length() <= 1);
//    }
}
