package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q389FindTheDifferenceTest {

    @Test
    public void findTheDifference() {
        Assert.assertEquals('e', Q389FindTheDifference.findTheDifference("abcd", "abcde"));
    }
}