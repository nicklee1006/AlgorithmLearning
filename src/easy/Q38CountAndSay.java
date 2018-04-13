package easy;

/**
 * 2018.3.28 Count and say
 * https://leetcode.com/problems/count-and-say/description/
 */
public class Q38CountAndSay {
    public static String countAndSay(int n) {
        String previous = "1";
        String current = "1";

        for (int i = 1; i < n; i++) {
            int count;
            char character;
            current = "";

            int length = previous.length();
            for (int j = 0; j < previous.length(); j++) {
                character = previous.charAt(j);
                count = 1;

                while (j + 1 < length && character == previous.charAt(j + 1)) {
                    count++;
                    j++;
                }

                current = current + count + character;
            }

            previous = current;
        }

        return current;
    }
}
