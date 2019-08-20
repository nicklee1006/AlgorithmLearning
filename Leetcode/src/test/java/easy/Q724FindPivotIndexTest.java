package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q724FindPivotIndexTest {

    @Test
    public void pivotIndex() {
        Assert.assertEquals(3, Q724FindPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Assert.assertEquals(-1, Q724FindPivotIndex.pivotIndex(new int[]{1, 2, 3}));
    }
}