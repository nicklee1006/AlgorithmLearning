package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q771JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() {
        Assert.assertEquals(3, Q771JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, Q771JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}