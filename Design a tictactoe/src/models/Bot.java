package models;

import Strategy.BotPlayingStrategy;
import factory.BotPlayingStrategyFactory;
public class Bot extends Player {
    private BotDifficulty botDifficulty;
    private BotPlayingStrategy botPlayingStrategy;
    private BotPlayingStrategyFactory botPlayingStrategyFactory = new BotPlayingStrategyFactory();

    public Bot(Symbol symbol, BotDifficulty botDifficulty) {
        super(PlayerType.BOT, symbol);
        this.botPlayingStrategy = botPlayingStrategyFactory.createBotStrategy(botDifficulty);
    }

    @Override
    public Move makeMove(Board board) {
        return this.botPlayingStrategy.makeNextMove(board, this);
    }
}
