package com.chap01;

public class Singleton {

    private static final Singleton instance = new Singleton();

    // 기본 생성자를 new 로 객체를 생성하지 못하게 private 로 선언
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
