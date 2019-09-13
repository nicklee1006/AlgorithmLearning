package medium;

import util.ListNode;

public class Q92ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int count = 0;
        ListNode node1 = null;
        ListNode node2 = null;

        ListNode previous = dummy;
        ListNode current = head;

        while (current != null) {
            // first move to m
            count++;

            // just reach m
            if (count == m) {
                node1 = previous;
                node2 = current;
            }

            // in between m and n
            if (count > m && count < n) {
                ListNode temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
                continue;
            }

            // reach n
            if (count == n) {
                node2.next = current.next;
                current.next = previous;
                node1.next = current;
                break;
            }

            previous = previous.next;
            current = current.next;
        }

        return dummy.next;
    }
}
