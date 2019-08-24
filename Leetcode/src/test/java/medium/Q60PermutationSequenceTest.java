package medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q60PermutationSequenceTest {

    @Test
    public void getPermutation() {
        Assert.assertEquals("213", Q60PermutationSequence.getPermutation(3, 3));
        Assert.assertEquals("2314", Q60PermutationSequence.getPermutation(4, 9));
        Assert.assertEquals("194627853", Q60PermutationSequence.getPermutation(9, 37098));
    }
}