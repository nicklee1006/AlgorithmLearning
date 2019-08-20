package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q17LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void letterCombinations() {
        String[] expected = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        String[] actual = Q17LetterCombinationsOfAPhoneNumber.letterCombinations("234").toArray(new String[0]);

        Arrays.sort(expected);
        Arrays.sort(actual);

        Assert.assertArrayEquals(expected, actual);
    }
}