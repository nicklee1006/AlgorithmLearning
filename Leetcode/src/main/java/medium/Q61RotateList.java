package medium;

import util.ListNode;

public class Q61RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        int length = 1;
        ListNode node = head;
        ListNode tail;

        if (head == null) {
            return null;
        }

        while (node.next != null) {
            node = node.next;
            length++;
        }

        // connect tail to head
        node.next = head;
        tail = node;

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
