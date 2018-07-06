package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q747LargestNumberAtLeastTwiceOfOthersTest {

    @Test
    public void dominantIndex() {
        Assert.assertEquals(1, Q747LargestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{3, 6, 1, 0}));
        Assert.assertEquals(-1, Q747LargestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{1, 2, 3, 4}));
    }
}