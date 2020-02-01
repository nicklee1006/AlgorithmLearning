package medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q215KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        // create priority queue
        Queue<Integer> queue = new PriorityQueue<>(comparator);
        for (int num : nums) {
            queue.offer(num);
        }

        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }

        return queue.poll();
    }
}
