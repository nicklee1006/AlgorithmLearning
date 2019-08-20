package w2_assignment2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<>();

        int k = Integer.parseInt(args[0]);

        String input;
        while (!StdIn.isEmpty()) {
            input = StdIn.readString();

            randomizedQueue.enqueue(input);

            // if over size k, deque at random
            if (randomizedQueue.size() == k + 1) {
                randomizedQueue.dequeue();
            }
        }

        for (String item : randomizedQueue) {
            StdOut.println(item);
        }
    }
}
