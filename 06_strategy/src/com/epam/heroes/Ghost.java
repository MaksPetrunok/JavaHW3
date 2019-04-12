package com.epam.heroes;

import com.epam.strategy.Fly;
import com.epam.strategy.Move;
import com.epam.strategy.Run;

public class Ghost extends Hero {

    public Ghost() {
        this.moveStrategy.put(Move.FLY, new Fly());
    }
}
