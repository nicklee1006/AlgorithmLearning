package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q628MaximumProductOfThreeNumbersTest {

    @Test
    public void maximumProduct() {
        Assert.assertEquals(6, Q628MaximumProductOfThreeNumbers.maximumProduct(new int[]{1,2,3}));
        Assert.assertEquals(24, Q628MaximumProductOfThreeNumbers.maximumProduct(new int[]{1,2,3,4}));
    }
}