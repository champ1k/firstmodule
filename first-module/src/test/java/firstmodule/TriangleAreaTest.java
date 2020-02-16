package firstmodule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleAreaTest {
    TriangleArea triangleArea;
    TriangleArea triangleArea1;
    @BeforeEach
    void setUp()
    {
        triangleArea = new TriangleArea(3,4,5);
        triangleArea1 = new TriangleArea(3,3,3);
    }
    @Test
    void area()
    {
        test(3.897114317029974,triangleArea1.area());
        test(6,triangleArea.area());
    }
    private void test(double actual,double expected)
    {
        assertEquals(actual,expected);
    }
}