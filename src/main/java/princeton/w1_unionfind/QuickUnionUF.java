package princeton.w1_unionfind;

public class QuickUnionUF implements UnionFind {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // change root of p to point to root of q
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
            i = id[i];
        }

        return i;
    }
}
