package com.chap01.singleton;

public class NonSingleton {

    public static NonSingleton getInstance() {
        return new NonSingleton();
    }
}
