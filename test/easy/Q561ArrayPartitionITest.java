package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q561ArrayPartitionITest {

    @Test
    public void arrayPairSum() {
        Assert.assertEquals(4, Q561ArrayPartitionI.arrayPairSum(new int[]{1,4,3,2}));
    }
}