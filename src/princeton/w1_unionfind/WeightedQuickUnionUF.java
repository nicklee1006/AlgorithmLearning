package princeton.w1_unionfind;

public class WeightedQuickUnionUF implements UnionFind {
    private int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }

        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[j] = i;
            size[i] += size[j];
        }
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
