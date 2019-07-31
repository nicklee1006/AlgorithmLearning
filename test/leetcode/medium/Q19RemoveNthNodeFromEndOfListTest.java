package leetcode.medium;

import leetcode.util.ListNode;
import org.junit.Assert;
import org.junit.Test;
import util.LinkedListTestUtil;

public class Q19RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode actual1 = Q19RemoveNthNodeFromEndOfList.removeNthFromEnd(testCase1, 2);
        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 5});

        ListNode testCase2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2});
        ListNode actual2 = Q19RemoveNthNodeFromEndOfList.removeNthFromEnd(testCase2, 2);
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2});

        ListNode testCase3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1});
        ListNode actual3 = Q19RemoveNthNodeFromEndOfList.removeNthFromEnd(testCase3, 1);

        Assert.assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(actual1, expected1));
        Assert.assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(actual2, expected2));
        Assert.assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(actual3, null));
    }
}