package medium;

import java.util.ArrayList;
import java.util.List;

public class Q93RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();

        if (s.length() > 12 || s.length() < 4) {
            return results;
        }

        // first field 1,2,3 digit
        for (int i = 0; i < 4 && i < s.length() - 2; i++) {
            // second field 1,2,3 digit
            for (int j = i + 1; j < i + 4 && j < s.length() - 1; j++) {
                // third field 1,2,3 digit
                for (int k = j + 1; k < j + 4 && k < s.length(); k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);

                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        results.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }

        return results;
    }

    // 1 <= length <= 3
    // between 0 - 255
    // or 0
    private static boolean isValid(String subString) {
        return subString.length() != 0 && subString.length() <= 3 && Integer.parseInt(subString) <= 255 && (subString.charAt(0) != '0' || subString.length() <= 1);
    }
}
