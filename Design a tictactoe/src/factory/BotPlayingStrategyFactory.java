package factory;

import Strategy.BotPlayingStrategy;
import Strategy.RandomBotPlayingStrategy;
import models.Board;
import models.BotDifficulty;
import models.Move;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotStrategy(BotDifficulty botDifficulty)
    {
        return switch (botDifficulty) {
            case EASY,MEDIUM,HARD -> new RandomBotPlayingStrategy();
            };

    }

}
