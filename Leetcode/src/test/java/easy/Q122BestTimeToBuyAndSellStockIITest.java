package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q122BestTimeToBuyAndSellStockIITest {

    @Test
    public void maxProfit() {
        Assert.assertEquals(4, Q122BestTimeToBuyAndSellStockII.maxProfit(new int[]{1,2,3,4,5}));
    }
}