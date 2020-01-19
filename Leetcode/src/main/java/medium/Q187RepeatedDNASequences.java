package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q187RepeatedDNASequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        // store the sequence meet
        Set<String> temp = new HashSet<>();
        // store the sequence that meet twice
        Set<String> result = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            // sliding window with length 10
            String sequence = s.substring(i, i + 10);

            // have met this sequence before
            if (temp.contains(sequence)) {
                result.add(sequence);
            } else {
                temp.add(sequence);
            }
        }

        return new ArrayList<>(result);
    }
}
