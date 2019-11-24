package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q150EvaluateReversePolishNotationTest {

    @Test
    public void evalRPN() {
        assertEquals(9, Q150EvaluateReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, Q150EvaluateReversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, Q150EvaluateReversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}