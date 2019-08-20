package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q893GroupsOfSpecialEquivalentStringsTest {

    @Test
    public void numSpecialEquivGroups() {
        Assert.assertEquals(3, Q893GroupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[]{"a","b","c","a","c","c"}));
        Assert.assertEquals(4, Q893GroupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[]{"aa","bb","ab","ba"}));
        Assert.assertEquals(3, Q893GroupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[]{"abc","acb","bac","bca","cab","cba"}));
        Assert.assertEquals(1, Q893GroupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[]{"abcd","cdab","adcb","cbad"}));
    }
}