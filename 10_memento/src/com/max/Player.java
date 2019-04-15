package com.max;

public class Player {

    private final char symbol;
    private final String name;

    public Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Point makeTurn(GameMap map) {
        char arena[][] = map.getMap();

        for (int y=0; y<arena.length; y++) {
            for (int x=0; x<arena.length; x++) {
                if (arena[y][x] == '.') {
                    return new Point(x, y);
                }
            }
        }
        return null;
    }
}
