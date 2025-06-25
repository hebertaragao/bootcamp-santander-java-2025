package view;

import model.Board;
import model.Cell;

public class ConsoleView {
    public void displayBoard(Board board) {
        Cell[][] grid = board.getGrid();
        for (int i = 0; i < 9; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 9; j++) {
                int val = grid[i][j].getValue();
                line.append(val).append(" ");
                if ((j + 1) % 3 == 0 && j < 8) line.append("| ");
            }
            System.out.println(line.toString());
            if ((i + 1) % 3 == 0 && i < 8) System.out.println("---------------------");
        }
    }
}