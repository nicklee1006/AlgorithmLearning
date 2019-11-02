package medium;

import java.util.List;

public class Q139WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        // want to know if canBreak[s.length] is true
        boolean[] canBreak = new boolean[s.length() + 1];

        canBreak[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            // if canBreak[i] is true, then must canBreak[j] and substring(j, i) in wordDict
            for (int j = 0; j < i; j++) {
                canBreak[i] = canBreak[j] && wordDict.contains(s.substring(j, i));

                if (canBreak[i]) {
                    break;
                }
            }
        }

        return canBreak[s.length()];
    }
}
