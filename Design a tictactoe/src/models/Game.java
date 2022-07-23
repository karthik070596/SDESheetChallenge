package models;

import java.util.ArrayList;
import java.util.List;
import Exception.MultipleBotsException;
import Exception.MoveEmptyException;
import Strategy.WinningStrategy;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move>moves;
    private GameStatus gameStatus;
    private int lastPlayerMovedIndex;
    private Player winner;
    private List<WinningStrategy>winningStrategies;

    private Game() {
        this.players = new ArrayList<>();
        this.gameStatus = GameStatus.INPROGRESS;
        this.winningStrategies = new ArrayList<>();
        this.lastPlayerMovedIndex = -1;
        this.moves = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getLastPlayerMovedIndex() {
        return lastPlayerMovedIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }
    public void makeMove()
    {
        this.lastPlayerMovedIndex+=1;
        this.lastPlayerMovedIndex%=this.players.size();
        Move move= this.players.get(lastPlayerMovedIndex).makeMove(this.board);
        move.getCell().setSymbol(move.getSymbol());
        this.moves.add(move);
        for(WinningStrategy strategy:this.winningStrategies)
        {
            if (strategy.checkStrategy(board, this.lastPlayerMovedIndex, move.getCell())) {
                gameStatus = gameStatus.ENDED;
                winner = this.players.get(lastPlayerMovedIndex);
                return;
            }
            if (moves.size() == this.board.getDimension() * this.board.getDimension()) {
                gameStatus = gameStatus.DRAW;
                return;
            }

        }
    }
    public boolean Undo() throws MoveEmptyException
    {
        if(moves.size()==0)
            throw new MoveEmptyException();

        Move move=this.moves.get(moves.size()-1);
        Cell relevantCell=move.getCell();
        relevantCell.clearCell();

        this.lastPlayerMovedIndex-=1;
        this.lastPlayerMovedIndex=(this.lastPlayerMovedIndex+this.players.size())%this.players.size();
        return true;
    }

    public static Builder create()
    {
        return new Builder();
    }
    public static class Builder{
        private List<Player> players;
        private List<WinningStrategy>winningStrategies;
        private int dimension;

        Builder()
        {
            this.players=new ArrayList<>();
            this.winningStrategies=new ArrayList<>();
        }

        public Builder setPlayers(List<Player> players) {
            this.players.addAll(players);
            return this;
        }
        public Builder setPlayers(Player players) {
            this.players.add(players);
            return this;
        }


        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies.addAll(winningStrategies);
            return this;
        }
        public Builder setWinningStrategies(WinningStrategy winningStrategies) {
            this.winningStrategies.add(winningStrategies);
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        boolean checkMultipleBots()
        {
            int count=0;
            for(Player player:players)
            {
                if(player.getPlayerType().equals(PlayerType.BOT))
                    count+=1;
            }
            return count<=1;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public int getDimension() {
            return dimension;
        }

        public Game build() throws MultipleBotsException
        {
            if(!checkMultipleBots())
                throw new MultipleBotsException();
            Game game=new Game();
            Board board=new Board(dimension);
            game.board=board;
            game.winningStrategies=this.winningStrategies;
            game.players=this.players;
            return game;
        }

    }
}
