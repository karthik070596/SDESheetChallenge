package Strategy;

import models.Board;
import models.Cell;
import models.Move;
import models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeNextMove(Board board, Player player) {
        for(List<Cell>cell:board.getBoard())
        {
           for(Cell cells:cell)
           {
               if(cells.isEmpty())
               {
                   Move move=new Move();
                   move.setCell(cells);
                   move.setSymbol(player.getSymbol());
                   move.setPlayer(player);
                   return move;
               }

           }
        }
        return null;
    }
}
