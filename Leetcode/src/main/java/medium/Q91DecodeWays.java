package medium;

public class Q91DecodeWays {
    public static int numDecodings(String s) {
        return getResult(s, 0);
    }

    private static int getResult(String s, int start) {
        if (start == s.length()) {
            return 1;
        }

        if (s.charAt(start) == '0') {
            return 0;
        }

        // answer if divide the first index
        int answer1 = getResult(s, start + 1);
        int answer2 = 0;

        if (start < s.length() - 1) {
            int ten = (s.charAt(start) - '0') * 10;
            int one = s.charAt(start + 1) - '0';

            if (ten + one <= 26) {
                answer2 = getResult(s, start + 2);
            }
        }

        return answer1 + answer2;
    }
}
