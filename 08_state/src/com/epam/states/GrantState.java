package com.epam.states;

import com.epam.Grant;

public interface GrantState {

    void nextState(Grant grant);
    void prevState(Grant grant);
    void printState();
}
