package medium;

import java.util.ArrayList;
import java.util.List;

public class Q6ZigZagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int curRow = 0;
        boolean isGoingDown = true;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++) {
            if (curRow == 0) {
                isGoingDown = true;
            }

            if (curRow == numRows - 1) {
                isGoingDown = false;
            }

            rows.get(curRow).append(s.charAt(i));

            curRow += isGoingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder temp: rows) {
            result.append(temp);
        }

        return result.toString();
    }

//    public static String convert(String s, int numRows) {
//        if (numRows == 1) {
//            return s;
//        }
//
//        int numberOfCompleteZig =  s.length() / (2 * numRows - 2);
//        int remaining = s.length() % (2 * numRows - 2);
//
//        int numCols = (numRows - 1) * numberOfCompleteZig + (remaining - numRows > 0 ? (remaining % numRows + 1) : 1);
//
//        char[][] converted = new char[numRows][numCols];
//
//        int charIndex = 0;
//        for (int i = 0; i < numCols && charIndex < s.length(); i++) {
//            if (i % (numRows - 1) == 0) {
//                for (int j = 0; j < numRows && charIndex < s.length(); j++) {
//                    converted[j][i] = s.charAt(charIndex++);
//                }
//            } else {
//                converted[numRows - i % (numRows - 1) - 1][i] = s.charAt(charIndex++);
//            }
//
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < numRows; i++) {
//            stringBuilder.append(converted[i]);
//        }
//
//        return stringBuilder.toString().replace("\u0000", "");
//    }
}
