package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Q49GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        List<List<String>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList("ate","eat","tea"));
        expected1.add(Arrays.asList("nat","tan"));
        expected1.add(Arrays.asList("bat"));

        ListOfListTestUtil<String> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(Q49GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}), expected1));

    }
}