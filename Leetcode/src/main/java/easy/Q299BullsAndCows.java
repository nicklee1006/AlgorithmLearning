package easy;

import java.util.HashMap;
import java.util.Map;

public class Q299BullsAndCows {
    public static String getHint(String secret, String guess) {
        // count A
        int countA = 0;

        // assume the length is the same
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                countA++;
            }
        }

        // count B, use 2 hashmap to count the occurrence of each number in secret and guess
        Map<Character, Integer> countSecret = new HashMap<>();
        Map<Character, Integer> countGuess = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            countSecret.put(secret.charAt(i), countSecret.getOrDefault(secret.charAt(i), 0) + 1);
            countGuess.put(guess.charAt(i), countGuess.getOrDefault(guess.charAt(i), 0) + 1);
        }

        // check all counts in guess, B is always the smaller count
        int countB = 0;
        for (Character character : countGuess.keySet()) {
            int countS = countSecret.getOrDefault(character, 0);
            int countG = countGuess.getOrDefault(character, 0);

            countB += Math.min(countS, countG);
        }

        // as count B also includes count A, thus need to minus it
        return countA + "A" + (countB - countA) + "B";
    }
}
