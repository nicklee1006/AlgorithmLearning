package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q914XOfAKindInADeckOfCardsTest {

    @Test
    public void hasGroupsSizeX() {
        Assert.assertTrue(Q914XOfAKindInADeckOfCards.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
        Assert.assertFalse(Q914XOfAKindInADeckOfCards.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
        Assert.assertFalse(Q914XOfAKindInADeckOfCards.hasGroupsSizeX(new int[]{1}));
        Assert.assertTrue(Q914XOfAKindInADeckOfCards.hasGroupsSizeX(new int[]{1,1}));
        Assert.assertTrue(Q914XOfAKindInADeckOfCards.hasGroupsSizeX(new int[]{1,1,2,2,2,2}));
        Assert.assertTrue(Q914XOfAKindInADeckOfCards.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2}));
    }
}