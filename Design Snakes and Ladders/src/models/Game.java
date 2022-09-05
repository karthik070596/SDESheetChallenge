package models;

import java.util.ArrayList;
import java.util.List;
import Exception.MaxButtonExceededException;


public class Game {
    Board board;
    private List<Player>players;
    private GameStatus gameStatus;
    private List<Player> rankings;
    private int maxButtonPerPlayer;
    int lastPlayerMovedIndex;
    private Dice dice;
    private CanMoveStrategy canMoveStrategy;
    private HandleMoveStrategy handleMoveStrategy;

    private Game()
    {
        this.players=new ArrayList<>();
        this.rankings=new ArrayList<>();
        this.lastPlayerMovedIndex=-1;
        this.maxButtonPerPlayer=-1;
        this.gameStatus=GameStatus.INPROGRESS;
    }
    public static Builder create()
    {
        return new Builder();
    }
    public static class Builder
    {
        private List<Player>players;
        private int maxButtonPerPlayer;
        private int size;

        public Builder setPlayers(List<Player> players) {
            this.players.addAll(players);
            return this;
        }

        public Builder setMaxButtonPerPlayer(int maxButtonPerPlayer) {
            this.maxButtonPerPlayer = maxButtonPerPlayer;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public boolean check(int maxButtonPerPlayer,List<Player>players) throws MaxButtonExceededException
        {
            for(Player player:players)
            {
                if(player.getButton().size()>maxButtonPerPlayer) {
                    throw new MaxButtonExceededException();
                }
            }
            return true;
        }
        public Game Build() throws MaxButtonExceededException
        {
            if(check(this.maxButtonPerPlayer,this.players)) {
                Game game = new Game();
                Board board = new Board(size);
                game.board = board;
                game.players=this.players;
                game.maxButtonPerPlayer = this.maxButtonPerPlayer;
                return game;
            }
           return null;
        }
    }

}
