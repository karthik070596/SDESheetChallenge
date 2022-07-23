package models;

public abstract class Player {
    private String name;
    private PlayerType playerType;
    private Symbol symbol;

    Player(PlayerType playerType,Symbol symbol)
    {
        this.symbol=symbol;
        this.playerType=playerType;
    }

    public String getName() {
        return name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract Move makeMove(Board board);
}
