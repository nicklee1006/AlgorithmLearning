package medium;

import org.junit.Assert;
import org.junit.Test;

public class Q55JumpGameTest {

    @Test
    public void canJump() {
        Assert.assertTrue(Q55JumpGame.canJump(new int[]{2,3,1,1,4}));
        Assert.assertFalse(Q55JumpGame.canJump(new int[]{3,2,1,0,4}));
        Assert.assertFalse(Q55JumpGame.canJump(new int[]{0, 2, 3}));
        Assert.assertTrue(Q55JumpGame.canJump(new int[]{0}));

    }
}