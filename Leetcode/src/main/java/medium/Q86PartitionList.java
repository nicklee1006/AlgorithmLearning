package medium;

import util.ListNode;

public class Q86PartitionList {
    public static ListNode partition(ListNode head, int x) {
        // pivot node, first element that is >= x
        ListNode pivot = head;

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode previousPivot = dummyHead;

        while (pivot != null) {
            if (pivot.val >= x) {
                break;
            } else {
                previousPivot = pivot;
                pivot = pivot.next;
            }
        }

        // no value >= x or pivot is already the end, return list itself
        if (pivot == null || pivot.next == null) {
            return head;
        }

        // start from pivot, move all smaller node before pivot
        ListNode current = pivot.next;
        ListNode previous = pivot;

        while (current != null) {
            // >= x, move to next
            if (current.val >= x) {
                previous = current;
                current = current.next;
            } else {
                final ListNode temp = current.next;

                previousPivot.next = current;
                current.next = pivot;
                previousPivot = current;

                previous.next = temp;
                current = temp;
            }
        }

        return dummyHead.next;
    }
}
