package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q804UniqueMorseCodeWordsTest {

    @Test
    public void uniqueMorseRepresentations() {
        Assert.assertEquals(2, Q804UniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}