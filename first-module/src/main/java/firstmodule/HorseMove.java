package firstmodule;

public class HorseMove {
    int x1;
    int y1;
    public HorseMove(int x1,int y1)
    {
        this.x1 = x1;
        this.y1 = y1;
    }
    public boolean horseChessMove(int x2,int y2)
    {
        boolean canMove;
        int dx = Math.abs(x1-x2);
        int dy = Math.abs(y1-y2);
        if((dx == 1 && dy== 2)||(dx == 2 && dy==1))
            canMove=true;
        else
            canMove = false;
        return  canMove;
    }
}
