package w1_assignment1;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/* *****************************************************************************
 *  Name:    Nick Li
 *
 *  Description:  Perform a series of computational experiments
 *
 *  Written:       27/June/2019
 *  Last updated:  28/June/2019
 *
 **************************************************************************** */
public class PercolationStats {
    private double[] threshold;         // record threshold of all trials
    private int trials;                 // number of trials

    /**
     * Perform trials independent experiments on an n-by-n grid.
     *
     * @param n number of grid
     * @param trials number of trials
     */
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException();
        }

        threshold = new double[trials];
        this.trials = trials;

        // run trials
        for (int i = 0; i < trials; i++) {
            Percolation percolation = new Percolation(n);

            // repeat until percolate
            while (!percolation.percolates()) {
                int row = StdRandom.uniform(1, n + 1);
                int col = StdRandom.uniform(1, n + 1);

                // get next blocked site
                while (percolation.isOpen(row, col)) {
                    row = StdRandom.uniform(1, n + 1);
                    col = StdRandom.uniform(1, n + 1);
                }

                // open the site
                percolation.open(row, col);
            }

            threshold[i] = (double)percolation.numberOfOpenSites() / (n * n);
        }
    }

    /**
     * Calculate sample mean of percolation threshold.
     *
     * @return sample mean of percolation threshold
     */
    public double mean() {
        return StdStats.mean(threshold);
    }

    /**
     * Calculate sample standard deviation of percolation threshold.
     *
     * @return sample mean of percolation threshold
     */
    public double stddev() {
        return StdStats.stddev(threshold);
    }

    /**
     * Calculate low endpoint of 95% confidence interval.
     *
     * @return low endpoint of 95% confidence interval
     */
    public double confidenceLo() {
        return mean() - 1.96 * Math.sqrt(stddev()) / Math.sqrt(trials);
    }

    /**
     * Calculate high endpoint of 95% confidence interval.
     *
     * @return high endpoint of 95% confidence interval
     */
    public double confidenceHi() {
        return mean() + 1.96 * Math.sqrt(stddev()) / Math.sqrt(trials);
    }

    /**
     * test client.
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Wrong number of arguments");
        }

        PercolationStats stats = new PercolationStats(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        System.out.printf("mean                    = %f%n", stats.mean());
        System.out.printf("stddev                  = %f%n", stats.stddev());
        System.out.printf("95%% confidence interval = [%f, %f]", stats.confidenceLo(), stats.confidenceHi());
    }
}
