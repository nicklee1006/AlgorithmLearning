package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q7171bitAnd2bitCharactersTest {

    @Test
    public void isOneBitCharacter() {
        Assert.assertTrue(Q7171bitAnd2bitCharacters.isOneBitCharacter(new int[]{1, 0, 0}));
        Assert.assertFalse(Q7171bitAnd2bitCharacters.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }
}