package models;

public class Move {
    private Cell cell;
    private Symbol symbol;
    private Player player;

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Player getPlayer() {
        return player;
    }
}
