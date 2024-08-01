package com.chap01.creation.singleton;

public class NonSingleton {

    public static NonSingleton getInstance() {
        return new NonSingleton();
    }
}
