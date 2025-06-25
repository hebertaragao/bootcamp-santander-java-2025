package controller;

import model.Board;
import view.ConsoleView;

import java.util.Scanner;

public class GameController {
    private final Board board;
    private final ConsoleView view;
    private final Scanner scanner = new Scanner(System.in);

    public GameController(String rawData) {
        this.board = new Board(rawData);
        this.view = new ConsoleView();
    }

    public void run() {
        while (!board.isComplete()) {
            view.displayBoard(board);
            System.out.print("Digite linha, coluna e valor (ex: 0 1 5): ");
            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                int val = scanner.nextInt();
                board.getCell(row, col).setValue(val);
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scanner.nextLine(); // limpa buffer
            }
        }
        view.displayBoard(board);
        System.out.println("Sudoku completo! 🎉");
    }
}