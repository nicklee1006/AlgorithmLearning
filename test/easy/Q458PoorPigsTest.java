package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q458PoorPigsTest {

    @Test
    public void poorPigs() {
        Assert.assertEquals(5, Q458PoorPigs.poorPigs(1000, 15, 60));
    }
}