package easy;

import org.junit.Test;

public class Q21MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        util.ListNode node1 = new util.ListNode(1);
        util.ListNode node2 = new util.ListNode(2);
        util.ListNode node3 = new util.ListNode(4);
        util.ListNode node4 = new util.ListNode(1);
        util.ListNode node5 = new util.ListNode(3);
        util.ListNode node6 = new util.ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;

        util.ListNode result = Q21MergeTwoSortedLists.mergeTwoLists(node1, node4);

        while (result.next != null) {
            System.out.println(result.val);

            result = result.next;
        }

        System.out.println(result.val);
    }
}