package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q461HammingDistanceTest {

    @Test
    public void hammingDistance() {
        Assert.assertEquals(2, Q461HammingDistance.hammingDistance(1, 4));
    }
}