package firstmodule;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class HorseMoveTest {
    private HorseMove horseMove;
    @BeforeEach
    void setUp()
    {
        horseMove = new HorseMove(1,2);
    }
    @Test
    void horseChessMove()
    {
        test(true,horseMove.horseChessMove(2,4));
        test(true,horseMove.horseChessMove(3,3));
        test(true,horseMove.horseChessMove(0,0));
        test(true,horseMove.horseChessMove(-1,1));
    }
    private void test(boolean expect,boolean actual)
    {
      assertEquals(expect,actual);
    }

}