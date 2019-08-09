package leetcode.medium;

import leetcode.util.ListNode;

public class Q24SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null && current.next != null) {
            ListNode node1 = current;
            ListNode node2 = current.next;

            node1.next = node2.next;
            node2.next = node1;

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
