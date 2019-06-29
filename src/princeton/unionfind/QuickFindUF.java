package princeton.unionfind;

public class QuickFindUF implements UnionFind{
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // change all entries with id[p] to id[q]
    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (pid == id[i]) {
                id[i] = qid;
            }
        }
    }

    // check whether p and q are in the same component (2 array accesses)
    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public int find(int p) {
        return 0;
    }

    @Override
    public int countComponent() {
        return 0;
    }
}
