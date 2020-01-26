package medium;

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
public class Q208ImplementTriePrefixTree {
    TireNode root;

    /** Initialize your data structure here. */
    public Q208ImplementTriePrefixTree() {
        root = new TireNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] wordChars = word.toCharArray();

        TireNode current = root;
        for (char wordChar : wordChars) {
            // if child not exist
            if (current.children[wordChar - 'a'] == null) {
                current.children[wordChar - 'a'] = new TireNode();
            }

            // move to child
            current = current.children[wordChar - 'a'];
        }

        current.isFinish = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] wordChars = word.toCharArray();

        TireNode current = root;
        for (int i = 0; i < wordChars.length; i++) {
            // if child not exist
            if (current.children[wordChars[i] - 'a'] == null) {
                return false;
            }

            // move to child
            current = current.children[wordChars[i] - 'a'];
        }

        return current.isFinish;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] wordChars = prefix.toCharArray();

        TireNode current = root;
        for (int i = 0; i < wordChars.length; i++) {
            // if child not exist
            if (current.children[wordChars[i] - 'a'] == null) {
                return false;
            }

            // move to child
            current = current.children[wordChars[i] - 'a'];
        }

        return true;
    }

    static class TireNode {
        // to mark what children this node has
        TireNode[] children;
        // if this node is the finish of the word
        boolean isFinish;

        public TireNode() {
            children = new TireNode[26];
            isFinish = false;

            for (TireNode child : children) {
                child = null;
            }
        }
    }
}
