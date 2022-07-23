package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>>board;
    private int dimension;

    public int getDimension() {
        return dimension;
    }

    Board(int dimension)
    {
        this.dimension = dimension;

        board = new ArrayList<>();

        for (int i = 0; i < dimension; ++i) {
            board.add(new ArrayList<>());
            for (int j = 0; j < dimension; ++j) {
                board.get(i).add(new Cell());
            }
        }
    }
    public Cell getCell(int i, int j)
    {
        return board.get(i).get(j);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void printBoard()
    {
        for(List<Cell>row:board)
        {
            for (Cell cell: row) {
                if (cell.getSymbol() == null) {
                    System.out.print("|   |");
                } else {
                    System.out.printf("| " + cell.getSymbol().getCharacter() + " |");
                }
            }
            System.out.print("\n");
        }

    }
}
