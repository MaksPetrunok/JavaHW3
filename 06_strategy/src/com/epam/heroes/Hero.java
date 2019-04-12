package com.epam.heroes;

import com.epam.strategy.Move;
import com.epam.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Hero {

    protected HashMap<Move, MoveStrategy> moveStrategy = new HashMap();

    public  void move(Move moveType) {

        MoveStrategy ms = moveStrategy.get(moveType);
        System.out.print(toString() + ": ");
        if (ms == null) {
            System.out.println("I cannot " + moveType.name() + ", I'm just " + toString());
        }
        else {
            ms.move();
        }
    }

    public void setMoveStrategy(Move type, MoveStrategy altMoveStrategy) {
        this.moveStrategy.put(type, altMoveStrategy);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
