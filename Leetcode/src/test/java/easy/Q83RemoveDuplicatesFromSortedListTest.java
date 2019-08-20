package easy;

import org.junit.Assert;
import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

public class Q83RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 1, 2, 3, 3, 4});

        ListNode actual = Q83RemoveDuplicatesFromSortedList.deleteDuplicates(testCase1);
        ListNode expected = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4});

        Assert.assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(actual, expected));
    }
}