package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q633SumOfSquareNumbersTest {

    @Test
    public void judgeSquareSum() {
        Assert.assertTrue(Q633SumOfSquareNumbers.judgeSquareSum(5));
        Assert.assertFalse(Q633SumOfSquareNumbers.judgeSquareSum(3));
    }
}