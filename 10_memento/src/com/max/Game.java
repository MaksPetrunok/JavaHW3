package com.max;

public class Game {

    private GameMap map = new GameMap();

    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    private History history = new History();

    public Game(Player playerX, Player playerO) {
        this.playerX = playerX;
        this.playerO = playerO;
        this.currentPlayer = playerX;
    }

    public void gameTurn() {
        history.addMemento(this.saveGame());

        Point point = currentPlayer.makeTurn(map.clone());
        if (point == null) {
            System.out.println("Player " + currentPlayer.getName() + " loose!");
            System.exit(0);
        }
        map.setSymbol(currentPlayer.getSymbol(), point.getX(), point.getY());
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public void undoLastTurn() {
        restoreGame(history.getPrevious());
    }

    public void printGame() {
        char m[][] = map.getMap();
        for (int y=0; y<m.length; y++) {
            System.out.println(m[y]);
        }
        System.out.printf("Current player: %s (%c)\n", currentPlayer.getName(), currentPlayer.getSymbol());
    }

    /**
     * Save current game state.
     */
    public Memento saveGame() {
        return new Memento(map.clone(), currentPlayer);
    }

    /**
     * Restore game state from specific point.
     */
    public void restoreGame(Memento memento) {
        this.map = memento.getMap();
        this.currentPlayer = memento.getCurrentPlayer();
    }

    public void printHistory() {
        this.history.printHistory();
    }

}
