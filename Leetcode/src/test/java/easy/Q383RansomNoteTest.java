package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q383RansomNoteTest {

    @Test
    public void canConstruct() {
        Assert.assertFalse(Q383RansomNote.canConstruct("a", "b"));
        Assert.assertFalse(Q383RansomNote.canConstruct("aa", "ab"));
        Assert.assertTrue(Q383RansomNote.canConstruct("aa", "aab"));
    }
}