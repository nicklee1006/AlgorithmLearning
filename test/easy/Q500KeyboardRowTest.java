package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q500KeyboardRowTest {

    @Test
    public void findWords() {
        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"}, Q500KeyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}