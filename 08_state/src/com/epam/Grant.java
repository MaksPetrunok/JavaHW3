package com.epam;

import com.epam.states.GrantState;
import com.epam.states.GrantStateCreated;

public class Grant {

    private GrantState state = new GrantStateCreated();
    private String name;

    public Grant(String name) {
        this.name = name;
    }

    public void previousState() {
        state.prevState(this);
    }

    public void nextState() {
        state.nextState(this);
    }

    public void printStatus() {
        System.out.print(this.name + "'s grant status: ");
        state.printState();
    }

    public GrantState getState() {
        return this.state;
    }

    public void setState(GrantState state) {
        this.state = state;
        System.out.print(this.name + "'s grant changed status to: ");
        state.printState();
    }
}
