package com.epam.heroes;

import com.epam.strategy.Fly;
import com.epam.strategy.Move;
import com.epam.strategy.Run;

public class Dragon extends Hero {

    public Dragon() {
        this.moveStrategy.put(Move.RUN, new Run());
        this.moveStrategy.put(Move.FLY, new Fly());
    }
}
