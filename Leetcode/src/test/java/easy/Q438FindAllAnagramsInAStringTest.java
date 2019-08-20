package easy;

import org.junit.Test;

import java.util.List;

public class Q438FindAllAnagramsInAStringTest {

    @Test
    public void findAnagrams() {
//        List<Integer> result = Q438FindAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
        List<Integer> result = Q438FindAllAnagramsInAString.findAnagrams("abab", "ab");

        for (int temp : result) {
            System.out.println(temp);
        }
    }
}