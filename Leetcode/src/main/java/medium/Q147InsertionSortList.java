package medium;

import util.ListNode;

public class Q147InsertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        // if input list has no element return null
        if (head == null) {
            return null;
        }

        // create a dummyHead, the node before the actual head
        ListNode dummyHead = new ListNode(0);

        // current node
        ListNode current = head;

        // loop original list
        while (current != null) {
            ListNode temp = dummyHead;
            // need this temp to record the next of current
            final ListNode currentNext = current.next;

            // set current.next to null as we don't want to move everything after current
            current.next = null;

            // find the node in the result that is greater than current node
            while (temp.next != null) {
                if (temp.next.val > current.val) {
                    // move the head from original to the result
                    current.next = temp.next;
                    temp.next = current;

                    // find the spot for this node, move to next
                    break;
                }

                // check next in result
                temp = temp.next;
            }

            // didn't find, mean current greater than all in the result
            if (temp.next == null) {
                temp.next = current;
            }

            // move current node
            current = currentNext;
        }

        return dummyHead.next;
    }
}
