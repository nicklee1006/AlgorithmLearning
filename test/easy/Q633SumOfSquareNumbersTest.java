package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q633SumOfSquareNumbersTest {

    @Test
    public void judgeSquareSum() {
        Assert.assertTrue(Q633SumOfSquareNumbers.judgeSquareSum(5));
        Assert.assertFalse(Q633SumOfSquareNumbers.judgeSquareSum(3));
    }
}