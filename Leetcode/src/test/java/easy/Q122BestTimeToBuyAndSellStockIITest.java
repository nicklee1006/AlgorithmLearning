package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q122BestTimeToBuyAndSellStockIITest {

    @Test
    public void maxProfit() {
        Assert.assertEquals(4, Q122BestTimeToBuyAndSellStockII.maxProfit(new int[]{1,2,3,4,5}));
        Assert.assertEquals(7, Q122BestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0, Q122BestTimeToBuyAndSellStockII.maxProfit(new int[]{7,6,4,3,1}));
    }
}