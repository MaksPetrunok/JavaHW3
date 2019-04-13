package com.epam.states;

import com.epam.Grant;

public class GrantStateCreated implements GrantState {

    @Override
    public void nextState(Grant grant) {
        grant.setState(new GrantStateInWork());
    }

    @Override
    public void prevState(Grant grant) {
        System.out.println("No state before 'Created'.");
    }

    @Override
    public void printState() {
        System.out.println("Created");
    }
}
