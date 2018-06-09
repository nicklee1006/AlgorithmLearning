package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q532KDiffPairsInAnArrayTest {

    @Test
    public void findPairs() {
        Assert.assertEquals(2, Q532KDiffPairsInAnArray.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        Assert.assertEquals(4, Q532KDiffPairsInAnArray.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        Assert.assertEquals(1, Q532KDiffPairsInAnArray.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }
}