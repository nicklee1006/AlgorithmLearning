package util;

public class UnionFind {
    // each node point to it's parent, the parent of the root is itself
    private int[] parent;

    public UnionFind(int size) {
        parent = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    // union 2 trees together, change root of node2 to node1
    public void union(int node1, int node2) {
        int root1 = findRoot(node1);
        int root2 = findRoot(node2);

        if (root1 != root2) {
            parent[root2] = root1;
        }
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    // find the root of the node
    public int findRoot(int node) {
        // loop until find parent is itself
        while (parent[node] != node) {
            parent[node] = parent[parent[node]];
            node = parent[node];
        }

        return node;
    }
}
