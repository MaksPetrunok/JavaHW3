package com.epam.states;

import com.epam.Grant;

public class GrantStateArchived implements GrantState {
    @Override
    public void nextState(Grant grant) {
        System.out.println("Already archived.");
    }

    @Override
    public void prevState(Grant grant) {
        grant.setState(new GrantStateApproved());
    }

    @Override
    public void printState() {
        System.out.println("Archived");
    }
}
