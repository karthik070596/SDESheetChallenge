package models;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(Symbol symbol)
    {
        super(PlayerType.HUMAN,symbol);
    }
    @Override
    public Move makeMove(Board board) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tell Row Number starting from 1");
        int row = scanner.nextInt();

        System.out.println("Tell Column Number starting from 1");
        int col=scanner.nextInt();

        Move move=new Move();
        move.setCell(board.getCell(row-1,col-1));
        move.setSymbol(this.getSymbol());
        move.setPlayer(this);
        return move;

    }
}
