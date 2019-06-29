package princeton.w1_unionfind;

public class QuickUnionPathCompression implements UnionFind {
    private int[] id;

    public QuickUnionPathCompression(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public int find(int p) {
        return 0;
    }

    @Override
    public int countComponent() {
        return 0;
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }

        return i;
    }
}
