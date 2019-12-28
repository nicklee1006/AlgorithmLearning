package medium;

import util.ListNode;

public class Q24SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        // 1-> 2 (previous) -> 3 (current, node1) -> 4 (node2)
        while (current != null && current.next != null) {
            // node 1 and node 2 are 2 nodes to exchange
            ListNode node1 = current;
            ListNode node2 = current.next;

            // exchange node
            node1.next = node2.next;
            node2.next = node1;

            // point previous node to node 2
            if (previous != null) {
                previous.next = node2;
            } else {
                head = node2;
            }

            previous = node1;
            current = node1.next;
        }

        return head;
    }
}
