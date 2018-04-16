package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q121BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        Assert.assertEquals(5, Q121BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, Q121BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}