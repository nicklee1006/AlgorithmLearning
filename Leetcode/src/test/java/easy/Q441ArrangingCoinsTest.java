package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q441ArrangingCoinsTest {

    @Test
    public void arrangeCoins() {
        Assert.assertEquals(2, Q441ArrangingCoins.arrangeCoins(5));
        Assert.assertEquals(3, Q441ArrangingCoins.arrangeCoins(8));
    }
}