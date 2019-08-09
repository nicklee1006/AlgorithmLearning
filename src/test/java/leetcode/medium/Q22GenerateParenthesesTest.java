package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q22GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
        String[] expected = {"((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"};

        Assert.assertEquals(Arrays.asList(expected), Q22GenerateParentheses.generateParenthesis(3));
    }
}