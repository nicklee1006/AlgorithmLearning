package medium;

import java.util.*;

public class Q127WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        // dynamic programming
        Map<String, List<String>> cache = new HashMap<>();
        Set<String> visited = new HashSet<>();

        int result = 1;

        // beginWord is assumed to be non-empty
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int levelSize = 1;

        visited.add(beginWord);
        while (!queue.isEmpty()) {
            for (int i = 0; i < levelSize; i++) {
                String currentWord = queue.poll();

                // get currentWord's neighbor
                List<String> neighbors;

                // read from cache or get
                if (cache.containsKey(currentWord)) {
                    neighbors = cache.get(currentWord);
                } else {
                    neighbors = getNeighbors(currentWord, wordList);
                    cache.put(currentWord, neighbors);
                }

                for (String neighbor : neighbors) {
                    // only consider unvisited word
                    if (!visited.contains(neighbor)) {
                        // add currentWord's neighbor to queue
                        queue.offer(neighbor);

                        visited.add(neighbor);
                    }
                }

                if (neighbors.contains(endWord)) {
                    return result + 1;
                }
            }

            // finish this level, go to next level
            result++;
            levelSize = queue.size();
        }

        return 0;
    }

    private static List<String> getNeighbors(String source, List<String> wordList) {
        List<String> results = new ArrayList<>();

        for (String word : wordList) {
            // skip itself
            if (word.equals(source)) {
                continue;
            }

            if (stringDifference(source, word) == 1) {
                results.add(word);
            }
        }

        return results;
    }

    private static int stringDifference(String a, String b) {
        int diff = 0;

        // a and b are same length
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }

        return diff;
    }
}
