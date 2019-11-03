package medium;

import java.util.HashSet;
import java.util.Set;

import util.ListNode;

public class Q142LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();

        while (head != null) {
            nodes.add(head);

            head = head.next;

            if (nodes.contains(head)) {
                return head;
            }
        }

        return null;
    }
}
