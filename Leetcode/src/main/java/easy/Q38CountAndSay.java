package easy;

/**
 * 2018.3.28 Count and say
 * https://leetcode.com/problems/count-and-say/description/
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class Q38CountAndSay {
    /**
     * Recursive.
     */
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String previous = countAndSay(n - 1);
        StringBuilder current = new StringBuilder();

        int count;
        for (int i = 0; i < previous.length(); i++) {
            count = 1;

            while ((i + 1) < previous.length() && previous.charAt(i) == previous.charAt(i + 1)) {
                i++;
                count++;
            }

            current.append(count).append(previous.charAt(i));
        }

        return current.toString();
    }

//    public static String countAndSay(int n) {
//        String previous = "1";
//        StringBuilder current = new StringBuilder("1");
//
//        int charCount;
//        for (int i = 1; i < n; i++) {
//            current.setLength(0);
//
//            for (int j = 0; j < previous.length(); j++) {
//                charCount = 1;
//
//                while ((j + 1) < previous.length() && previous.charAt(j) == previous.charAt(j + 1)) {
//                    j++;
//                    charCount++;
//                }
//
//                current.append(charCount).append(previous.charAt(j));
//            }
//
//            previous = current.toString();
//        }
//
//        return current.toString();
//    }

//    public static String countAndSay(int n) {
//        String previous = "1";
//        String current = "1";
//
//        for (int i = 1; i < n; i++) {
//            int count;
//            char character;
//            current = "";
//
//            int length = previous.length();
//            for (int j = 0; j < previous.length(); j++) {
//                character = previous.charAt(j);
//                count = 1;
//
//                while (j + 1 < length && character == previous.charAt(j + 1)) {
//                    count++;
//                    j++;
//                }
//
//                current = current + count + character;
//            }
//
//            previous = current;
//        }
//
//        return current;
//    }
}
