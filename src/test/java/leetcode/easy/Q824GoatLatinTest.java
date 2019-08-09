package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q824GoatLatinTest {

    @Test
    public void toGoatLatin() {
        Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", Q824GoatLatin.toGoatLatin("I speak Goat Latin"));
        Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", Q824GoatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}