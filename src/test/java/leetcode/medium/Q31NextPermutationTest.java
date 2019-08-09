package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q31NextPermutationTest {

    @Test
    public void nextPermutation() {
        int[] testCase1 = new int[]{1, 2, 3};
        int[] testCase2 = new int[]{3, 2, 1};
        int[] testCase3 = new int[]{1, 1, 5};
        int[] testCase4 = new int[]{1, 3, 2};


        Q31NextPermutation.nextPermutation(testCase1);
        Q31NextPermutation.nextPermutation(testCase2);
        Q31NextPermutation.nextPermutation(testCase3);
        Q31NextPermutation.nextPermutation(testCase4);

        Assert.assertArrayEquals(new int[]{1, 3, 2}, testCase1);
        Assert.assertArrayEquals(new int[]{1, 2, 3}, testCase2);
        Assert.assertArrayEquals(new int[]{1, 5, 1}, testCase3);
        Assert.assertArrayEquals(new int[]{2, 1, 3}, testCase4);
    }
}