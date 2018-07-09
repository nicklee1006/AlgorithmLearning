package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 2018.7.9 Question 784. Letter Case Permutation
 * https://leetcode.com/problems/letter-case-permutation/description/
 *
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to
 * create another string.  Return a list of all possible strings we could create.
 */
public class Q784LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        Queue<String> queue = new LinkedList<>();
        queue.add(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                continue;
            }

            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String current = queue.poll();

                char[] chars = current.toCharArray();

                chars[i] = Character.toLowerCase(chars[i]);
                queue.add(String.valueOf(chars));

                chars[i] = Character.toUpperCase(chars[i]);
                queue.add(String.valueOf(chars));
            }
        }

        return new ArrayList<>(queue);
    }
}
