import Strategy.WinningStrategy;
import models.Game;
import models.GameStatus;
import models.Player;

import java.util.List;
import Exception.MoveEmptyException;

public class GameController {
    public Game createGame(List<Player> players, List<WinningStrategy>winningStrategies,int dimension) {
        Game game = null;
        try {
            game=Game.create().setDimension(dimension).setPlayers(players).setWinningStrategies(winningStrategies).build();
        } catch (Exception exception) {
            System.out.println("We did something wrong");
            exception.printStackTrace();
        }

        return game;
    }
        public boolean Undo(Game game) throws MoveEmptyException
        {
            return game.Undo();
        }
        public void makeMove(Game game)
        {
            game.makeMove();
        }
        public Player getWinner(Game game) {
        return game.getWinner();
    }

        public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

        public void display(Game game) {
        game.getBoard().printBoard();
    }

}
