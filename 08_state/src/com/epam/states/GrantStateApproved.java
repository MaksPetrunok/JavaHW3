package com.epam.states;

import com.epam.Grant;

public class GrantStateApproved implements GrantState {
    @Override
    public void nextState(Grant grant) {
        grant.setState(new GrantStateArchived());
    }

    @Override
    public void prevState(Grant grant) {
        grant.setState(new GrantStateInWork());
    }

    @Override
    public void printState() {
        System.out.println("Approved");
    }
}
