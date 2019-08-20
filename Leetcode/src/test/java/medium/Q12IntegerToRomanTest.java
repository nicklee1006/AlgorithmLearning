package medium;

import org.junit.Assert;
import org.junit.Test;

public class Q12IntegerToRomanTest {

    @Test
    public void intToRoman() {
        Assert.assertEquals("III", Q12IntegerToRoman.intToRoman(3));
        Assert.assertEquals("IV", Q12IntegerToRoman.intToRoman(4));
        Assert.assertEquals("IX", Q12IntegerToRoman.intToRoman(9));
        Assert.assertEquals("LVIII", Q12IntegerToRoman.intToRoman(58));
        Assert.assertEquals("MCMXCIV", Q12IntegerToRoman.intToRoman(1994));
    }
}