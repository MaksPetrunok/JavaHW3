package com.max;

public class Memento {

    private GameMap map;
    private Player currentPlayer;

    public Memento(GameMap map, Player currentPlayer) {
        this.map = map;
        this.currentPlayer = currentPlayer;
    }

    public GameMap getMap() {
        return map;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
