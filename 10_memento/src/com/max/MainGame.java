package com.max;

public class MainGame {

    public static void main(String[] args) {
        Game g = new Game(new Player('X', "John"), new Player('O', "Luke"));

        System.out.println("Initial:");
        g.printGame();

        nextTurn(g);
        nextTurn(g);
        nextTurn(g);
        System.out.println("Undo last turn");
        g.undoLastTurn();
        g.printGame();

        g.printHistory();
    }

    public static void nextTurn(Game game) {
        game.gameTurn();
        game.printGame();
    }
}
