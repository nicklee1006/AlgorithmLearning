package medium;

import org.junit.Assert;
import org.junit.Test;

public class Q34FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void searchRange() {
        Assert.assertArrayEquals(new int[]{3, 4}, Q34FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5,7,7,8,8,10}, 8));
        Assert.assertArrayEquals(new int[]{-1, -1}, Q34FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5,7,7,8,8,10}, 6));
        Assert.assertArrayEquals(new int[]{-1, -1}, Q34FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{}, 0));
        Assert.assertArrayEquals(new int[]{-1, -1}, Q34FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{2, 2}, 3));
    }
}