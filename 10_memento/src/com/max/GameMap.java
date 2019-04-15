package com.max;

public class GameMap {

    private char map[][] = {
        {'.', '.', '.'},
        {'.', '.', '.'},
        {'.', '.', '.'}
    };

    public char[][] getMap() {
        char copy[][] = new char[3][3];
        for (int i=0; i<map.length; i++) {
            for (int j=0; j<map.length; j++) {
                copy[i][j] = map[i][j];
            }
        }
        return copy;
    }

    public boolean setSymbol(char symbol, int x, int y) {
        if (symbol != 'O' && symbol != 'X') {
            return false;
        }
        else if (map[y][x] != '.') {
            return false;
        }
        map[y][x] = symbol;
        return true;
    }

    public GameMap clone() {
        GameMap newMap = new GameMap();
        newMap.map = this.getMap();
        return newMap;
    }
}
