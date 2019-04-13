package com.epam;

public class MainState {

    public static void main(String[] args) {

        Grant johnGrant = new Grant("John");

        johnGrant.previousState();

        johnGrant.printStatus();

        johnGrant.nextState();
        johnGrant.nextState();
        johnGrant.nextState();
        johnGrant.nextState();

        johnGrant.printStatus();
    }
}
