package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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