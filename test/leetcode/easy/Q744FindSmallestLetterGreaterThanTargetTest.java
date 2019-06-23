package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q744FindSmallestLetterGreaterThanTargetTest {

    @Test
    public void nextGreatestLetter() {
        Assert.assertEquals('c', Q744FindSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        Assert.assertEquals('f', Q744FindSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        Assert.assertEquals('f', Q744FindSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
        Assert.assertEquals('j', Q744FindSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g'));
        Assert.assertEquals('c', Q744FindSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
        Assert.assertEquals('c', Q744FindSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k'));
    }
}