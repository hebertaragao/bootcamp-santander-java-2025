package model;

public class Board {
    private Cell[][] grid = new Cell[9][9];

    public Board(String rawData) {
        for (String entry : rawData.split(" ")) {
            String[] parts = entry.split(";");
            String[] pos = parts[0].split(",");
            int row = Integer.parseInt(pos[0]);
            int col = Integer.parseInt(pos[1]);
            String[] valueAndFlag = parts[1].split(",");
            int val = Integer.parseInt(valueAndFlag[0]);
            boolean fixed = Boolean.parseBoolean(valueAndFlag[1]);
            grid[row][col] = new Cell(val, fixed);
        }

        // Preenche células vazias com zero
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] == null)
                    grid[i][j] = new Cell(0, false);
    }

    public Cell getCell(int row, int col) {
        return grid[row][col];
    }

    public boolean isComplete() {
        for (Cell[] row : grid)
            for (Cell cell : row)
                if (cell.getValue() == 0)
                    return false;
        return true;
    }

    public Cell[][] getGrid() {
        return grid;
    }
}