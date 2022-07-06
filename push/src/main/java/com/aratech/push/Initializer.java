package com.aratech.push;

public class Initializer {

    private static Initializer INSTANCE;

    private Initializer() {
    }

    public synchronized static Initializer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Initializer();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return "Initial Library setup is working";
    }

    public void checkVersion() {

    }
}
