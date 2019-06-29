package princeton.assignment1;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/* *****************************************************************************
 *  Name:    Nick Li
 *
 *  Description:  model a percolation system,
 *
 *  Written:       27/June/2019
 *  Last updated:  28/June/2019
 *
 **************************************************************************** */
public class Percolation {
    private int gridSize;                       // size of the grid
    private boolean[] isSiteOpen;               // mark if site is open
    private int numberOfOpenSites;              // total number of sites are opened
    private WeightedQuickUnionUF quickUnionUF;  // quickUnion data structure
    private int virtualTopSiteIndex;            // index of virtual top site (n*n)
    private int virtualBottomSiteIndex;         // index of virtual bottom site (n*n + 1)

    /**
     * Initializes an empty union–find data structure with n * n sites.
     *
     * @param  n the number of sites
     * @throws IllegalArgumentException if n <= 0}
     */
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        this.gridSize = n;
        this.isSiteOpen = new boolean[n * n];
        this.numberOfOpenSites = 0;

        // plus 2 virtual site at top and bottom
        // n * n + 1 is top
        // n * n + 2 is bottom
        this.quickUnionUF = new WeightedQuickUnionUF(n * n + 2);

        this.virtualTopSiteIndex = n * n;
        this.virtualBottomSiteIndex = n * n + 1;
    }

    /**
     * Open site (row, col) if it is not open already.
     *
     * @param row row number (1 - n)
     * @param col col number (1 - n)
     */
    public void open(int row, int col) {
        validateIndices(row);
        validateIndices(col);

        int index = map2DTo1D(row, col);

        // if already open, do nothing
        if (isOpen(row, col)) {
            return;
        }

        // open site
        isSiteOpen[index] = true;
        numberOfOpenSites++;

        // link the site to it's open neighbors
        // first row, link to virtual top site
        if (row == 1) {
            quickUnionUF.union(index, virtualTopSiteIndex);
        }

        // last row, link to virtual bottom site
        if (row == gridSize) {
            quickUnionUF.union(index, virtualBottomSiteIndex);
        }

        // link to up
        if (row > 1) {
            if (isOpen(row - 1, col)) {
                quickUnionUF.union(index, map2DTo1D(row - 1,col));
            }
        }
        // link to down
        if (row < gridSize) {
            if (isOpen(row + 1, col)) {
                quickUnionUF.union(index, map2DTo1D(row + 1,col));
            }
        }
        // link to left
        if (col > 1) {
            if (isOpen(row, col - 1)) {
                quickUnionUF.union(index, map2DTo1D(row,col - 1));
            }
        }
        // link to right
        if (col < gridSize) {
            if (isOpen(row, col + 1)) {
                quickUnionUF.union(index, map2DTo1D(row,col + 1));
            }
        }
    }

    /**
     * Check if site (row, col) open.
     *
     * @param row row number (1 - n)
     * @param col col number (1 - n)
     *
     * @return true if (row, col) is open
     */
    public boolean isOpen(int row, int col) {
        validateIndices(row);
        validateIndices(col);

        return isSiteOpen[map2DTo1D(row, col)];
    }

    /**
     * Check if site (row, col) is full.
     * Site is full is it is connected to the virtual top site.
     *
     * @param row row number (1 - n)
     * @param col col number (1 - n)
     *
     * @return true if (row, col) is full
     */
    public boolean isFull(int row, int col) {
        validateIndices(row);
        validateIndices(col);

        int index = map2DTo1D(row, col);

        // Site is full is it is connected to the virtual top site
        return quickUnionUF.connected(index, virtualTopSiteIndex);
    }

    /**
     * Count number of open sites.
     *
     * @return number of open site
     */
    public int numberOfOpenSites() {
        return numberOfOpenSites;
    }

    /**
     * Check if the system percolates.
     * System percolates if virtual top site and virtual bottom site are connected.
     *
     * @return true if the system percolates
     */
    public boolean percolates() {
        // System percolates if virtual top site and virtual bottom site are connected
        return quickUnionUF.connected(virtualTopSiteIndex, virtualBottomSiteIndex);
    }

    /**
     * Check if input indices if valid.
     *
     * @param indices indices to check
     *
     * @throws IllegalArgumentException unless 1 <= indices <= n
     */
    private void validateIndices(int indices) {
        if (indices < 1 || indices > gridSize) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Map 2D(row, col) to 1D index.
     *
     * @param row row number (1 - n)
     * @param col col number (1 - n)
     *
     * @return index in 1D
     */
    private int map2DTo1D(int row, int col) {
        return gridSize * (row - 1) + (col - 1);
    }

    /**
     * test client.
     */
    public static void main(String[] args) {
        Percolation percolation = new Percolation(3);

        percolation.open(1, 1);
        percolation.open(1, 2);
        percolation.open(2, 2);
        percolation.open(3, 2);
        System.out.println(percolation.percolates());
    }
}
