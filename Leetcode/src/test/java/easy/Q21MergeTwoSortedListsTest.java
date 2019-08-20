package easy;

import util.ListNode;
import org.junit.Assert;
import org.junit.Test;
import testutil.LinkedListTestUtil;

public class Q21MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 4});
        ListNode testCase2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 3, 4});

        ListNode actual = Q21MergeTwoSortedLists.mergeTwoLists(testCase1, testCase2);
        ListNode expected = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 1, 2, 3, 4, 4});

        Assert.assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(actual, expected));
    }
}