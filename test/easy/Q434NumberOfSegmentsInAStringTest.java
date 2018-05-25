package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q434NumberOfSegmentsInAStringTest {

    @Test
    public void countSegments() {
        Assert.assertEquals(5, Q434NumberOfSegmentsInAString.countSegments("Hello, my name is John"));
    }
}