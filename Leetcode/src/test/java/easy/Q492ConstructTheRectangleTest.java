package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q492ConstructTheRectangleTest {

    @Test
    public void constructRectangle() {
        Assert.assertArrayEquals(new int[]{2,2}, Q492ConstructTheRectangle.constructRectangle(4));
    }
}