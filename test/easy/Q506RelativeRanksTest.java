package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q506RelativeRanksTest {

    @Test
    public void findRelativeRanks() {
        Assert.assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, Q506RelativeRanks.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }
}