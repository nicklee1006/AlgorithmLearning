package medium;

import util.ListNode;

public class Q148SortList {
    public static ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    // helper method to split original list into 2 half
    // recursive the left and right half
    // merge the left and right half
    private static ListNode mergeSort(ListNode node) {
        // reach the end
        if (node == null || node.next == null) {
            return node;
        }

        // add a dummy pointer to the start
        // so that in the end, the slow pointer always point to the last element of left half
        ListNode dummy = new ListNode(0);
        dummy.next = node;

        // use fast and slow pointer
        ListNode slow = dummy;
        ListNode fast = dummy;

        // split the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the last node of left half
        ListNode rightHalf = slow.next;

        // make slow.next = null so we have 2 split list
        slow.next = null;

        // recursive sort the left and right half
        ListNode head1 = mergeSort(node);
        ListNode right = mergeSort(rightHalf);

        return merge(head1, right);
    }

    // helper method to merge 2 sorted list
    private static ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode lastNode = dummyHead;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                // head1 is smaller
                // add head1 to the last
                // move head1 to next
                lastNode.next = head1;
                lastNode = lastNode.next;
                head1 = head1.next;
            } else {
                lastNode.next = head2;
                lastNode = lastNode.next;
                head2 = head2.next;
            }
        }

        // we exit the while loop because one of the head1 or head2 reach end
        // append the other one to the last
        if (head1 != null) {
            lastNode.next = head1;
        }

        if (head2 != null) {
            lastNode.next = head2;
        }

        return dummyHead.next;
    }
}
