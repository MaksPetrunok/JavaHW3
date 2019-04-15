package com.max;

import java.util.LinkedList;
import java.util.List;

public class History {

    private List<Memento> history = new LinkedList<>();

    public void addMemento(Memento memento) {
        history.add(0, memento);
    }

    public Memento getPrevious() {
        Memento memento = history.get(0);
        if (history.size() > 1) {
            history.remove(0);
        }
        return memento;
    }

    public void printHistory() {
        System.out.println("History:");
        for (int i=0; i<history.size(); i++) {
            char map[][] = history.get(i).getMap().getMap();
            for (int y=0; y<map.length; y++) {
                System.out.println(map[y]);
            }
            Player current = history.get(i).getCurrentPlayer();
            System.out.printf("Current player: %s (%c)\n\n", current.getName(), current.getSymbol());
        }
    }
}
