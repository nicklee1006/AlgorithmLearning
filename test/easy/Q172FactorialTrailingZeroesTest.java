package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q172FactorialTrailingZeroesTest {

    @Test
    public void trailingZeroes() {
        Assert.assertEquals(1, Q172FactorialTrailingZeroes.trailingZeroes(5));
    }
}