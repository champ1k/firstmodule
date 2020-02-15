package firstmodule;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CountUniqueNumTest {
    private CountUniqueNum countUniqueNum;
    @BeforeEach
    void setUp()
    {
        countUniqueNum = new CountUniqueNum();
    }
    @Test
    void count() {
        test(1,countUniqueNum.count(0));
        test(6,countUniqueNum.count(1,2,3,4,5,6,4,2,4));
    }
    private void test(int expected,int actual)
    {
        assertEquals(expected,actual);
    }
}