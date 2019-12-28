package medium;

import util.ListNode;
import org.junit.Test;
import testutil.LinkedListTestUtil;

import static org.junit.Assert.*;

public class Q24SwapNodesInPairsTest {

    @Test
    public void swapPairs() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4});
        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 1, 4, 3});

        ListNode testCase2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 1, 3});

        ListNode testCase3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1});
        ListNode expected3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, Q24SwapNodesInPairs.swapPairs(testCase1)));
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected2, Q24SwapNodesInPairs.swapPairs(testCase2)));
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected3, Q24SwapNodesInPairs.swapPairs(testCase3)));
    }
}