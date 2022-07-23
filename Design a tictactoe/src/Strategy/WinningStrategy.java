package Strategy;

import models.Board;
import models.Cell;

public interface WinningStrategy {
    public boolean checkStrategy(Board board, int lastIndex, Cell cell);
}
