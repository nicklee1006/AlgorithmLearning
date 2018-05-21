package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q389FindTheDifferenceTest {

    @Test
    public void findTheDifference() {
        Assert.assertEquals('e', Q389FindTheDifference.findTheDifference("abcd", "abcde"));
    }
}