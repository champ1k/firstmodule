package firstmodule;

public class GameOfLife {
    public int[][] nextGeneration(int[][] grid, int M, int N) {
        int[][] future = new int[M][N];
        if(grid.length == 0)
            throw new IllegalArgumentException("Grid is empty!");
        for (int l = 1; l < M - 1; l++) {
            for (int m = 1; m < N - 1; m++) {
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += grid[l + i][m + j];
                aliveNeighbours -= grid[l][m];

                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;

                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;

                else
                    future[l][m] = grid[l][m];
            }
        }
        return future;
    }

}
