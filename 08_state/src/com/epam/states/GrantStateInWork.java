package com.epam.states;

import com.epam.Grant;

public class GrantStateInWork implements GrantState {

    @Override
    public void nextState(Grant grant) {
        grant.setState(new GrantStateApproved());
    }

    @Override
    public void prevState(Grant grant) {
        grant.setState(new GrantStateCreated());
    }

    @Override
    public void printState() {
        System.out.println("In work");
    }
}
