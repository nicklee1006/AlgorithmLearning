package medium;

import util.ListNode;
import util.TreeNode;

public class Q109ConvertSortedListToBinarySearchTree {
    public static TreeNode sortedListToBST(ListNode head) {
        return findMiddle(head, null);
    }

    // need to find the middle node in the linked list
    private static TreeNode findMiddle(ListNode start, ListNode end) {
        if (start == end) {
            return null;
        }

        // slow and fast pointer to find middle node
        ListNode slow = start;
        ListNode fast = start;

        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the middle point
        TreeNode root = new TreeNode(slow.val);
        root.left = findMiddle(start, slow);
        root.right = findMiddle(slow.next, end);

        return root;
    }
}
