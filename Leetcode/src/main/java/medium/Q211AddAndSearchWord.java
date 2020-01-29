package medium;

public class Q211AddAndSearchWord {
    private TrieNode root;

    /** Initialize your data structure here. */
    public Q211AddAndSearchWord() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        char[] chars = word.toCharArray();

        TrieNode current = root;

        for (char tempChar : chars) {
            if (current.children[tempChar - 'a'] == null) {
                current.children[tempChar - 'a'] = new TrieNode();
            }

            current = current.children[tempChar - 'a'];
        }

        current.isFinish = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchHelper(word, root);
    }

    private boolean searchHelper(String word, TrieNode root) {
        char[] chars = word.toCharArray();

        TrieNode current = root;

        for (int i = 0; i < chars.length; i++) {
            // use recursion to decide '.'
            if (chars[i] == '.') {
                // loop 26 chars to replace '.'
                // e.g '.abc'
                for (int j = 0; j < 26; j++) {
                    if (current.children[j] != null) {
                        if (searchHelper(word.substring(i + 1), current.children[j])) {
                            return true;
                        }
                    }
                }

                return false;
            } else {
                // the char not exist
                if (current.children[chars[i] - 'a'] == null) {
                    return false;
                }
            }

            current = current.children[chars[i] - 'a'];
        }

        return current.isFinish;
    }

    static class TrieNode {
        TrieNode[] children;
        boolean isFinish;

        public TrieNode() {
            children = new TrieNode[26];

            // initialize
            for (TrieNode child : children) {
                child = null;
            }

            isFinish = false;
        }
    }
}
