package Strategy;

import models.Board;
import models.Move;
import models.Player;

public interface BotPlayingStrategy {
    public Move makeNextMove(Board board, Player player);
}
