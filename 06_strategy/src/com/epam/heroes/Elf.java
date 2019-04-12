package com.epam.heroes;

import com.epam.strategy.Move;
import com.epam.strategy.Run;

public class Elf extends Hero {

    public Elf() {
        this.moveStrategy.put(Move.RUN, new Run());
    }
}
