package com.epam;

import com.epam.heroes.Dragon;
import com.epam.heroes.Elf;
import com.epam.heroes.Ghost;
import com.epam.heroes.Hero;
import com.epam.strategy.Fly;
import com.epam.strategy.Move;

public class Main {

    public static void main(String[] args) {

        Hero elf = new Elf();
        Hero dragon = new Dragon();
        Hero ghost = new Ghost();

        elf.move(Move.RUN);
        dragon.move(Move.RUN);
        ghost.move(Move.RUN);
        System.out.println("-----------------");

        elf.move(Move.FLY);
        dragon.move(Move.FLY);
        ghost.move(Move.RUN);
        System.out.println("-----------------");

        System.out.println("Apply magic to Elf.");
        elf.setMoveStrategy(Move.FLY, new Fly());
        elf.move(Move.FLY);
    }
}
