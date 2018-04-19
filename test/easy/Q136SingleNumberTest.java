package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q136SingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(5, Q136SingleNumber.singleNumber(new int[]{1,3,1,3,5}));
    }
}