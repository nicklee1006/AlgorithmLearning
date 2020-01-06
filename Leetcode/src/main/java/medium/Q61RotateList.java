package medium;

import util.ListNode;

public class Q61RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        // length of the list
        int length = 1;
        ListNode node = head;

        if (head == null) {
            return null;
        }

        // get length of the list
        while (node.next != null) {
            node = node.next;
            length++;
        }

        ListNode tail;

        // now 'node' is the last node in the last
        // connect tail to head
        node.next = head;
        tail = node;

        // Move right k place = moving head to right by (length - k % length) places
        int steps = length - k % length;

        while (steps > 0) {
            head = head.next;
            tail = tail.next;

            steps--;
        }

        tail.next = null;

        return head;
    }
}
