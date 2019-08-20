package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q762PrimeNumberOfSetBitsInBinaryRepresentationTest {

    @Test
    public void countPrimeSetBits() {
        Assert.assertEquals(4, Q762PrimeNumberOfSetBitsInBinaryRepresentation.countPrimeSetBits(6, 10));
        Assert.assertEquals(5, Q762PrimeNumberOfSetBitsInBinaryRepresentation.countPrimeSetBits(10, 15));

    }
}