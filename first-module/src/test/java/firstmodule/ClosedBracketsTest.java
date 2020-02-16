package firstmodule;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ClosedBracketsTest {

    private ClosedBrackets closedBrackets;
    @BeforeEach
    void setUp()
    {
        closedBrackets = new ClosedBrackets();
    }
    @Test
    void brackets()
    {
        test(false,closedBrackets.brackets("()()())"));
        test(true,closedBrackets.brackets("()()({})"));
    }
    private void test(boolean actual,boolean expected)
    {
        assertEquals(actual,expected);
    }
}