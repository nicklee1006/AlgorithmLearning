package medium;

import java.util.HashSet;
import java.util.Set;

import util.ListNode;

public class Q142LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode meet = null;

        while (fast != null) {
            // no loop
            if (fast.next == null) {
                return null;
            }
        }

        // move forward slow and fast
        slow = slow.next;
        fast = fast.next.next;

        // reach the meet point
        if (fast == slow) {
            meet = fast;

            // start move forward head, until meet point
            while (head != meet) {
                head = head.next;
                meet = meet.next;
            }

            return head;
        }

        return null;
    }

//    public static ListNode detectCycle(ListNode head) {
//        Set<ListNode> nodes = new HashSet<>();
//
//        while (head != null) {
//            nodes.add(head);
//
//            head = head.next;
//
//            if (nodes.contains(head)) {
//                return head;
//            }
//        }
//
//        return null;
//    }
}
